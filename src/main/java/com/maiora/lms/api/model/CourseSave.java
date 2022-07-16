package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coursesave")
public class CourseSave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "courseid")
	private int courseid;

	@Column(name = "course_name")
	private String course_name;

	@Column(name = "course_full_name")
	private String course_full_name;

	@Column(name = "description")
	private String description;

	@Column(name = "course_image")
	private String course_image;

	@Column(name = "price")
	private int price;

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_full_name() {
		return course_full_name;
	}

	public void setCourse_full_name(String course_full_name) {
		this.course_full_name = course_full_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCourse_image() {
		return course_image;
	}

	public void setCourse_image(String course_image) {
		this.course_image = course_image;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CourseSave [courseid=" + courseid + ", course_name=" + course_name + ", course_full_name="
				+ course_full_name + ", description=" + description + ", course_image=" + course_image + ", price="
				+ price + "]";
	}

}
