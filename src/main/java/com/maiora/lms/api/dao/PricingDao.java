package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.Pricing;

public interface PricingDao {

	public List<Pricing> readAllPricing(int from, int pagesize, String filtertext);

	public Pricing addPricing(Pricing pricingModel);

	public Pricing updateTheExistingPricing(Pricing pricingModel);

	public List<Pricing> getAllData();

}
