

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;
import java.util.Set;

import javax.persistence.*;


import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: courses
 *
 */
@Entity
@Table(name="lm_courses")
public class courses implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private int course_id;
	@Column(name = "course_name")
	private String course_name;
	@Column(name = "description")
	private String description;
	@Column(name = "course_image")
	private String course_image;
	@Column(name = "hours")
	private Timestamp hours;
	@Column(name = "is_deleted")
	private int is_deleted;
	@Column(name = "is_active")
	private int is_active;
	@Column(name = "created_by")
	private String created_by;
	@Column(name = "updated_by")
	private String updated_by;
	@Column(name = "created_on")
	private Timestamp created_on;
	@Column(name = "updated_on")
	private Timestamp updated_on;
	
	@OneToMany(mappedBy ="lm_courses")
	private Set<UserCourseandStatus> lm_usercourseandstatus;
	
	@OneToMany(mappedBy ="lm_courses")
	private Set<QuestionsAndAnswers> lm_qna;
	
	@OneToMany(mappedBy ="lm_courses")
	private Set<Lessons> lm_lessons;
	
	@ManyToOne
	@JoinColumn(name = "id", nullable = false)
	private Users users;
	
	private static final long serialVersionUID = 1L;

	public courses() {
		super();
	}   
	
	public Set<UserCourseandStatus> getLm_usercourseandstatus() {
		return lm_usercourseandstatus;
	}

	public Set<QuestionsAndAnswers> getLm_qna() {
		return lm_qna;
	}

	public Set<Lessons> getLm_lessons() {
		return lm_lessons;
	}

	public void setLm_usercourseandstatus(Set<UserCourseandStatus> lm_usercourseandstatus) {
		this.lm_usercourseandstatus = lm_usercourseandstatus;
	}

	public void setLm_qna(Set<QuestionsAndAnswers> lm_qna) {
		this.lm_qna = lm_qna;
	}

	public void setLm_lessons(Set<Lessons> lm_lessons) {
		this.lm_lessons = lm_lessons;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getCourse_id() {
		return this.course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}   
	public String getCourse_name() {
		return this.course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public String getCourse_image() {
		return this.course_image;
	}

	public void setCourse_image(String course_image) {
		this.course_image = course_image;
	}   
	public Timestamp getHours() {
		return this.hours;
	}

	public void setHours(Timestamp hours) {
		this.hours = hours;
	}   
	public int getIs_deleted() {
		return this.is_deleted;
	}

	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}   
	public int getIs_active() {
		return this.is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}   
	public String getCreated_by() {
		return this.created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}   
	public String getUpdated_by() {
		return this.updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}   
	public Timestamp getCreated_on() {
		return this.created_on;
	}

	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}   
	public Timestamp getUpdated_on() {
		return this.updated_on;
	}

	public void setUpdated_on(Timestamp updated_on) {
		this.updated_on = updated_on;
	}
   
}
