package com.maiora.lms.api.service;

import java.util.List;

import com.maiora.lms.api.model.universities;

public interface UniversitiesService {

	public List<universities> readAlluniversitiesService(int from, int pagesize, String filtertext);

	public universities addUniversity(universities universityModel);

	public universities updateTheExistingUniversity(universities universityModel);

	public List<universities> getAllData();

}
