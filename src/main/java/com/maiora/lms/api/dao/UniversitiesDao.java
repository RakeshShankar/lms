package com.maiora.lms.api.dao;

import java.util.List;

import com.maiora.lms.api.model.universities;

public interface UniversitiesDao {

	public List<universities> readAlluniversitiesService(int from, int pagesize, String filtertext);

	public universities addUniversity(universities universityModel);

	public universities updateTheExistingUniversity(universities universityModel);

	public List<universities> getAllData();

}
