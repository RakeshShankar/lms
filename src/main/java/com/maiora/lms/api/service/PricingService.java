package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.Pricing;

public interface PricingService {

	public List<Pricing> readAllPricing(int from, int pagesize, String filtertext);

	public Pricing addPricing(Pricing pricingModel);

	public Pricing updateTheExistingPricing(Pricing pricingModel);

	public List<Pricing> getAllData();

}
