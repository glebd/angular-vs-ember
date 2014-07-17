package com.riskcare.resttest.resources;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.riskcare.resttest.api.Country;
import com.yammer.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**

 */


@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/countries")
public class CountryResource {
    static final Logger logger = LoggerFactory.getLogger(CountryResource.class);
    private final Map<String, Country> countries;

    public CountryResource(List<Country> countries) {
        this.countries = new HashMap<>();
        for (Country country : countries) {
            this.countries.put(country.getCode(), country);
        }
    }

    @GET
    @Path("code/{code}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Timed
    public Country getCountry(@PathParam("code") final String code) throws JsonProcessingException {
        return countries.get(code);
    }

    @GET
    @Path("currencySymbol/{currency}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Timed
    public List<Country> getCurrencyCountries(@PathParam("currency") final String currency) throws JsonProcessingException {
        List<Country> currencyCountries = new ArrayList<>();
        for (Country country : countries.values()) {
            if (country.getCurrencyName().equalsIgnoreCase(currency))
                currencyCountries.add(country);
        }
        return currencyCountries;
    }

    @GET
    @Path("all")
    @Consumes(MediaType.APPLICATION_JSON)
    @Timed
    public List<Country> getCountries() throws JsonProcessingException {
        List<Country> countries = new ArrayList<>();
        countries.addAll(this.countries.values());
        return countries;
    }

}
