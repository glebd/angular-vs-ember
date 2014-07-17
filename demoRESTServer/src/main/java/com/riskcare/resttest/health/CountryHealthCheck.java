package com.riskcare.resttest.health;

import com.riskcare.resttest.api.Country;
import com.yammer.metrics.core.HealthCheck;

import java.util.List;

/**
 * User: chris
 * Date: 4/9/14
 * Time: 5:45 PM
 */
public class CountryHealthCheck extends HealthCheck {
    private final List<Country> countries;

    public CountryHealthCheck(List<Country> countries) {
        super("Country HealthCheck");
        this.countries = countries;
    }


    @Override
    protected Result check() throws Exception {
        return (countries != null && countries.size() > 0) ? Result.healthy() : Result.unhealthy("Country file is missing");
    }
}
