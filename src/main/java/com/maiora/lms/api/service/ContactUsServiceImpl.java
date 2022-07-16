package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.ContactUsDao;
import com.maiora.lms.api.model.ContactUs;

@Service
public class ContactUsServiceImpl implements ContactUsService {

	@Autowired
	private ContactUsDao contactusDao;

	@Override
	public List<ContactUs> readAllContactUs(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return contactusDao.readAllContactUs(from,  pagesize,  filtertext);
	}

	@Override
	public ContactUs addContactUs(ContactUs contactUsModel) {
		// TODO Auto-generated method stub
		return contactusDao.addContactUs(contactUsModel);
	}

	@Override
	public ContactUs updateTheExistingContactUs(ContactUs contactUsModel) {
		// TODO Auto-generated method stub
		return contactusDao.updateTheExistingContactUs(contactUsModel);
	}

	@Override
	public List<ContactUs> getAllData() {
		// TODO Auto-generated method stub
		return contactusDao.getAllData();
	}
}
