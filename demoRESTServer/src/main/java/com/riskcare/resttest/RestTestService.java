package com.riskcare.resttest;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;
import com.riskcare.resttest.api.Country;
import com.riskcare.resttest.health.CountryHealthCheck;
import com.riskcare.resttest.resources.CountryResource;
import com.riskcare.resttest.resources.NumberResource;
import com.riskcare.resttest.resources.TextResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * User: sawychr
 * Date: 18/11/13
 * Time: 16:49
 */
public class RestTestService extends Service<RestTestConfiguration> {
    static final Logger logger = LoggerFactory.getLogger(RestTestService.class);
    public static void main(String[] args) throws Exception {
        new RestTestService().run(args);
    }

    @Override
    public void initialize(final Bootstrap<RestTestConfiguration> bootstrap) {
        bootstrap.setName("restTestServer");
    }

    @Override
    public void run(final RestTestConfiguration configuration, final Environment environment) throws Exception {
        final List<Country> countries = loadCountries("countries.csv");
        environment.addResource(new CountryResource(countries));
        environment.addResource(new TextResource());
        environment.addResource(new NumberResource());
        environment.addHealthCheck(new CountryHealthCheck(countries));
    }

    private List<Country>loadCountries(String fileToLoad) throws IOException {
        List<Country> countries = new ArrayList<>();
        InputStream in = this.getClass().getClassLoader().getResourceAsStream(fileToLoad);
        CSVReader reader = new CSVReader(new InputStreamReader(in));
        String[] row;
        while ((row = reader.readNext()) != null) {
             countries.add(new Country(row[0], row[1], row[2], row[3], row[4]));
        }
        return countries;
    }
}
