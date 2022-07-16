package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.EnquiryDetails;

public interface EnquireDetailsService {

	public List<EnquiryDetails> readAllEnquiryDetails(int from, int pagesize, String filtertext);

	public EnquiryDetails addEnquiryDetails(EnquiryDetails enquiryDetailModel);

	public EnquiryDetails updateTheExistingEnquiryDetails(EnquiryDetails enquiryDetailModel);

	public List<EnquiryDetails> getAllData();

}
