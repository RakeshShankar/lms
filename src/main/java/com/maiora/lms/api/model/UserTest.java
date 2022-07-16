

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;

import javax.persistence.*;
/**
 * Entity implementation class for Entity: UserTest
 *
 */
@Entity
@Table(name="lm_usertest")
public class UserTest implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_tset_id")
	private int user_tset_id;
//	@Column(name = "test_id")
//	private int test_id;
	@Column(name = "total_questions")
	private int total_questions;
	@Column(name = "currect_answered")
	private int currect_answered;
	@Column(name = "wrong_answered")
	private int wrong_answered;
	@Column(name = "skipped")
	private int skipped;
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

	@ManyToOne
	@JoinColumn(name = "id", nullable = false)
	private Users users;
	
	@ManyToOne
	@JoinColumn(name = "test_id", nullable = false)
	private Test lm_test;
	
	public UserTest() {
		super();
	}   
	
	public Test getLm_test() {
		return lm_test;
	}

	public void setLm_test(Test lm_test) {
		this.lm_test = lm_test;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getUser_tset_id() {
		return this.user_tset_id;
	}

	public void setUser_tset_id(int user_tset_id) {
		this.user_tset_id = user_tset_id;
	}     
	public int getTotal_questions() {
		return this.total_questions;
	}

	public void setTotal_questions(int total_questions) {
		this.total_questions = total_questions;
	}   
	public int getCurrect_answered() {
		return this.currect_answered;
	}

	public void setCurrect_answered(int currect_answered) {
		this.currect_answered = currect_answered;
	}   
	public int getWrong_answered() {
		return this.wrong_answered;
	}

	public void setWrong_answered(int wrong_answered) {
		this.wrong_answered = wrong_answered;
	}   
	public int getSkipped() {
		return this.skipped;
	}

	public void setSkipped(int skipped) {
		this.skipped = skipped;
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
