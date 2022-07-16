package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.EnquiryDetailsDao;
import com.maiora.lms.api.model.EnquiryDetails;

@Service
public class EnquireDetailsServiceImpl implements EnquireDetailsService {

	@Autowired
	private EnquiryDetailsDao enquiryDetailDao;

	@Override
	public List<EnquiryDetails> readAllEnquiryDetails(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return enquiryDetailDao.readAllEnquiryDetails(from,  pagesize,  filtertext);
	}

	@Override
	public EnquiryDetails addEnquiryDetails(EnquiryDetails enquiryDetailModel) {
		// TODO Auto-generated method stub
		return enquiryDetailDao.addEnquiryDetails(enquiryDetailModel);
	}

	@Override
	public EnquiryDetails updateTheExistingEnquiryDetails(EnquiryDetails enquiryDetailModel) {
		// TODO Auto-generated method stub
		return enquiryDetailDao.updateTheExistingEnquiryDetails(enquiryDetailModel);
	}

	@Override
	public List<EnquiryDetails> getAllData() {
		// TODO Auto-generated method stub
		return enquiryDetailDao.getAllData();
	}
}
