package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.PricingDao;
import com.maiora.lms.api.model.Pricing;

@Service
public class PricingServiceImpl implements PricingService {

	@Autowired
	private PricingDao pricingDao;

	@Override
	public List<Pricing> readAllPricing(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return pricingDao.readAllPricing(from,  pagesize,  filtertext);
	}

	@Override
	public Pricing addPricing(Pricing pricingModel) {
		// TODO Auto-generated method stub
		return pricingDao.addPricing(pricingModel);
	}

	@Override
	public Pricing updateTheExistingPricing(Pricing pricingModel) {
		// TODO Auto-generated method stub
		return pricingDao.updateTheExistingPricing(pricingModel);
	}

	@Override
	public List<Pricing> getAllData() {
		// TODO Auto-generated method stub
		return pricingDao.getAllData();
	}
}
