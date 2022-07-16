package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.IELTSAboutDao;
import com.maiora.lms.api.model.IELTSAbout;
import com.maiora.lms.api.model.IELTSTest;
import com.maiora.lms.api.model.courses;
@Service
public class IELTSAboutServiceImpl implements IELTSAboutService{

	@Autowired
	private IELTSAboutDao ieltsAboutDao;
	
	@Override
	public IELTSAbout addAbout(IELTSAbout ieltsAbout) {
		System.out.println("Calling to DB");
		return ieltsAboutDao.addAboutInfo(ieltsAbout);
	}
	
	@Override
	public List<IELTSAbout> getAllData() {
		System.out.println("Calling to DB");
		return ieltsAboutDao.getAllData();
	}

	@Override
	public IELTSTest addTest(IELTSTest iELTSAbout) {
		// TODO Auto-generated method stub
		return ieltsAboutDao.CreatEtest(iELTSAbout);
	}

}
