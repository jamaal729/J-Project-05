package com.teamtreehouse.countriesLib.model;

import java.text.NumberFormat;
import java.util.List;

public class Country {
    private String countryName;
    private long population;
    private String capital;
    private List<String> languages;

    public Country(String countryName, long population, String capital, List<String> languages) {
        this.countryName = countryName;
        this.population = population;
        this.capital = capital;
        this.languages = languages;
    }

    public String getCountryName() {
        return countryName;
    }

    public long getPopulation() {
        return population * 1000;
    }

    public String getPopulationString() {
        String populationString = NumberFormat.getIntegerInstance().format(getPopulation());
        return populationString;
    }

    public String getCapital() { return capital; }

    public List<String> getLanguages() { return languages; }

    public void setCountryName(String countryName) { this.countryName = countryName; }

    public void setPopulation(long population) { this.population = population; }

    public void setCapital(String capital) { this.capital = capital; }

    public void setLanguages(List<String> languages) { this.languages = languages; }
}
