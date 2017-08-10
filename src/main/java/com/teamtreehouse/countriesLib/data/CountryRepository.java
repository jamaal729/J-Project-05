package com.teamtreehouse.countriesLib.data;

import com.teamtreehouse.countriesLib.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(

            new Country("Kenya", 4404, "Nairobi", Arrays.asList("Swahili", "English")),
            new Country("Italy", 6148, "Rome", Arrays.asList("Italian")),
            new Country("India", 1220000, "New Delhi", Arrays.asList("Hindi, English")),
            new Country("France", 6995, "Paris", Arrays.asList("French")),
            new Country("Ecuador", 1544, "Quito", Arrays.asList("Spanish"))
    );

    public Country findByName(String name) {
        return ALL_COUNTRIES.stream().filter(country -> country.getCountryName().equals(name)).findFirst().orElseThrow(IllegalArgumentException::new);
    }

    public List<Country> getAllCountries() {
        return ALL_COUNTRIES;
    }

    public List<Country> sortByName() {
        return ALL_COUNTRIES.stream().sorted(Comparator.comparing(Country::getCountryName)).collect(Collectors.toList());
    }

    public List<Country> sortByPopulation() {
        return ALL_COUNTRIES.stream().sorted(Comparator.comparingLong(Country::getPopulation)).collect(Collectors.toList());
    }
}
