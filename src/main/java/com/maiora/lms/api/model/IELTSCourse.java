package com.maiora.lms.api.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "IELTSCourse")
public class IELTSCourse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IELTSCourseid")
	private int IELTSCourseid;

//	@OneToMany(mappedBy = "introduction")
//	private Set<Introduction> introduction;

//	@OneToMany(mappedBy = "lm_lessons")
//	private List<Lessons> lessons;

}

// com.maiora.lms.api.model.Introduction.introduction in com.maiora.lms.api.model.IELTSCourse.introduction
