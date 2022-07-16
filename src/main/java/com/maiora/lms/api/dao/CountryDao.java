package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.Country;

public interface CountryDao {

	public List<Country> readAllCountry(int from, int pagesize, String filtertext);

	public Country addCountry(Country countryModel);

	public Country updateTheExistingCountry(Country countryModel);

	public List<Country> getAllData();

}
