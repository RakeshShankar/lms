
package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: UserCourseandStatus
 *
 */
@Entity
@Table(name="lm_usercourseandstatus")
public class UserCourseandStatus implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_course_status_id")
	private int user_course_status_id;
	@Column(name = "status")
	private String status;
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
	@JoinColumn(name = "course_id", nullable = false)
	private courses lm_courses;
	
	public UserCourseandStatus() {
		super();
	}   
	
	public courses getLm_courses() {
		return lm_courses;
	}

	public void setLm_courses(courses lm_courses) {
		this.lm_courses = lm_courses;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getUser_course_status_id() {
		return this.user_course_status_id;
	}

	public void setUser_course_status_id(int user_course_status_id) {
		this.user_course_status_id = user_course_status_id;
	}    
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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
