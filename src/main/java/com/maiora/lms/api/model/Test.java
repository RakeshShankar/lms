

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Test
 *
 */
@Entity
@Table(name="lm_test")
public class Test implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "test_id")
	private int test_id;
	@Column(name = "test_type")
	private boolean test_type;
	@Column(name = "marks")
	private String marks;
	@Column(name = "time")
	private Timestamp time;
	@Column(name = "no_of_questions")
	private String no_of_questions;
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
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy ="lm_test")
	private Set<UserTest> lm_usertest;
	
	@ManyToOne
	@JoinColumn(name = "lession_id", nullable = false)
	private Lessons lm_lessons;
	
	public Set<UserTest> getLm_usertest() {
		return lm_usertest;
	}
	public Lessons getLm_lessons() {
		return lm_lessons;
	}
	public void setLm_usertest(Set<UserTest> lm_usertest) {
		this.lm_usertest = lm_usertest;
	}
	public void setLm_lessons(Lessons lm_lessons) {
		this.lm_lessons = lm_lessons;
	}
	public Test() {
		super();
	}   
	public int getTest_id() {
		return this.test_id;
	}

	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}   
 
	public String getMarks() {
		return this.marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}   
	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}   
	public String getNo_of_questions() {
		return this.no_of_questions;
	}

	public void setNo_of_questions(String no_of_questions) {
		this.no_of_questions = no_of_questions;
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
	public boolean isTest_type() {
		return test_type;
	}
	public void setTest_type(boolean test_type) {
		this.test_type = test_type;
	}
   
}
