package com.maiora.lms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.lms.api.dao.UniversitiesDao;
import com.maiora.lms.api.model.universities;

@Service
public class UniversitiesServiceImpl implements UniversitiesService{

	@Autowired
	private UniversitiesDao universitiesDao;

	@Override
	public List<universities> readAlluniversitiesService(int from, int pagesize, String filtertext) {
		// TODO Auto-generated method stub
		return universitiesDao.readAlluniversitiesService(from,  pagesize,  filtertext);
	}

	@Override
	public universities addUniversity(universities universityModel) {
		// TODO Auto-generated method stub
		return universitiesDao.addUniversity(universityModel);
	}

	@Override
	public universities updateTheExistingUniversity(universities universityModel) {
		// TODO Auto-generated method stub
		return universitiesDao.updateTheExistingUniversity(universityModel);
	}

	@Override
	public List<universities> getAllData() {
		// TODO Auto-generated method stub
		return universitiesDao.getAllData();
	}
}
