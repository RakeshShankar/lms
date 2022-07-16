

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;

import javax.persistence.*;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: EnquiryDetails
 *
 */
@Entity
@Table(name="lm_enquirydetail")
public class EnquiryDetails implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "enquiry_details_id")
	private int enquiry_details_id;
	@Column(name = "username")
	private String username;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile")
	private int mobile;
	@Column(name = "address")
	private String address;
	@Column(name = "DOB")
	private String DOB;
	@Column(name = "how_did_you_here")
	private String how_did_you_here;
	@Column(name = "referred_person")
	private String referred_person;
	@Column(name = "current_college")
	private String current_college;
	@Column(name = "course_interested")
	private String course_interested;
	@Column(name = "country_interested")
	private String country_interested;
	@Column(name = "start_date")
	private Timestamp start_date;
	@Column(name = "end_date")
	private Timestamp end_date;
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
	@JoinColumn(name = "country_id", nullable = false)
	private Country lm_country;
	
	public EnquiryDetails() {
		super();
	}  
	
	
	public Country getLm_country() {
		return lm_country;
	}


	public void setLm_country(Country lm_country) {
		this.lm_country = lm_country;
	}


	public int getEnquiry_details_id() {
		return this.enquiry_details_id;
	}

	public void setEnquiry_details_id(int enquiry_details_id) {
		this.enquiry_details_id = enquiry_details_id;
	}   
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public int getMobile() {
		return this.mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getDOB() {
		return this.DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}   
	public String getHow_did_you_here() {
		return this.how_did_you_here;
	}

	public void setHow_did_you_here(String how_did_you_here) {
		this.how_did_you_here = how_did_you_here;
	}   
	public String getReferred_person() {
		return this.referred_person;
	}

	public void setReferred_person(String referred_person) {
		this.referred_person = referred_person;
	}   
	public String getCurrent_college() {
		return this.current_college;
	}

	public void setCurrent_college(String current_college) {
		this.current_college = current_college;
	}   
	public String getCourse_interested() {
		return this.course_interested;
	}

	public void setCourse_interested(String course_interested) {
		this.course_interested = course_interested;
	}   
	public String getCountry_interested() {
		return this.country_interested;
	}

	public void setCountry_interested(String country_interested) {
		this.country_interested = country_interested;
	}   
	public Timestamp getStart_date() {
		return this.start_date;
	}

	public void setStart_date(Timestamp start_date) {
		this.start_date = start_date;
	}   
	public Timestamp getEnd_date() {
		return this.end_date;
	}

	public void setEnd_date(Timestamp end_date) {
		this.end_date = end_date;
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
