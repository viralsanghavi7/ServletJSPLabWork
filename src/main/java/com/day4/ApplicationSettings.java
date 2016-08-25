package com.day4;

import java.util.List;

/**
 * Created by vsanghav on 8/25/2016.
 */
public class ApplicationSettings {

     private List<Country> countries;

    ApplicationSettings(List<Country> countries)
    {
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
