package com.maiora.lms.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "coursedetails")
public class CourseDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@JsonIgnore
	@Column(name = "course_id")
	private int courseId;
	
	@Column(name = "category")
	private String category;
	
	@OneToOne
//	@JsonIgnore
	@JoinColumn(name = "imgid")
	private CourseImg courseImg;
	
	@Column(name = "course_level")
	private String course_level;
	
	@Column(name = "course_name")
	private String course_name;
	
	@OneToMany(mappedBy = "coursedetail")
	private List<RequirementAdds> requirementAdds;
	
	@OneToMany(mappedBy = "coursedetail")
	private List<WhatYouLearn> whatYouLearn;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public CourseImg getCourseImg() {
		return courseImg;
	}

	public void setCourseImg(CourseImg courseImg) {
		this.courseImg = courseImg;
	}

	public String getCourse_level() {
		return course_level;
	}

	public void setCourse_level(String course_level) {
		this.course_level = course_level;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public List<RequirementAdds> getRequirementAdds() {
		return requirementAdds;
	}

	public void setRequirementAdds(List<RequirementAdds> requirementAdds) {
		this.requirementAdds = requirementAdds;
	}

	public List<WhatYouLearn> getWhatYouLearn() {
		return whatYouLearn;
	}

	public void setWhatYouLearn(List<WhatYouLearn> whatYouLearn) {
		this.whatYouLearn = whatYouLearn;
	}

	@Override
	public String toString() {
		return "CourseDetails [courseId=" + courseId + ", category=" + category + ", courseImg=" + courseImg
				+ ", course_level=" + course_level + ", course_name=" + course_name + ", requirementAdds="
				+ requirementAdds + ", whatYouLearn=" + whatYouLearn + "]";
	}
	
	
	
	
	
	
	

}
