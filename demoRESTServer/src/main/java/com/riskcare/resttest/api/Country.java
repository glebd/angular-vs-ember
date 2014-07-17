package com.riskcare.resttest.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * User: sawychr
 * Date: 18/11/13
 * Time: 16:59
 *
 */
public class Country {
    @NotEmpty
    @JsonProperty
    private final String code;
    @NotEmpty
    @JsonProperty
    private final String name;
    @NotEmpty
    @JsonProperty
    private final String capital;
    @NotEmpty
    @JsonProperty
    private final String currencySymbol;
    @NotEmpty
    @JsonProperty
    private final String currencyName;


    public Country(String code, String name, String capital, String currencySymbol, String currencyName) {

        this.code = code;
        this.name = name;
        this.capital = capital;
        this.currencySymbol = currencySymbol;
        this.currencyName = currencyName;
    }

    @Override
    public String toString() {
        return "Country {" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", currencySymbol='" + currencySymbol + '\'' +
                ", currencyName='" + currencyName + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public String getCurrencyName() {
        return currencyName;
    }


}
