package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.ContactUs;

public interface ContactUsDao {

	public List<ContactUs> readAllContactUs(int from, int pagesize, String filtertext);

	public ContactUs addContactUs(ContactUs contactUsModel);

	public ContactUs updateTheExistingContactUs(ContactUs contactUsModel);

	public List<ContactUs> getAllData();

}
