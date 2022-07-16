package com.maiora.lms.api.model;

import java.util.List;

import javax.persistence.OneToMany;

public class IntroModel {
	
	

	
	@OneToMany(mappedBy = "introduction")
	private List<Lessons> lessons;
}
