package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.CountryDao;
import com.maiora.lms.api.model.Country;

@Service
public class CountyServiceImpl implements CountyService{

	@Autowired
	private CountryDao countryDao;

	@Override
	public List<Country> readAllCountry(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return countryDao.readAllCountry(from,  pagesize,  filtertext);
	}

	@Override
	public Country addCountry(Country countryModel) {
		// TODO Auto-generated method stub
		return countryDao.addCountry(countryModel);
	}

	@Override
	public Country updateTheExistingCountry(Country countryModel) {
		// TODO Auto-generated method stub
		return countryDao.updateTheExistingCountry(countryModel);
	}

	@Override
	public List<Country> getAllData() {
		// TODO Auto-generated method stub
		return countryDao.getAllData();
	}
}
