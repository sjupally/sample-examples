package com.example;

import java.util.Comparator;

public class CountrySortByIdComparator implements Comparator<Country> {

	@Override
	public int compare(Country country1, Country country2) {

		return (country1.getCountryId() < country2.getCountryId()) ? -1 : (country1.getCountryId() > country2.getCountryId()) ? 1 : 0;
	}

}