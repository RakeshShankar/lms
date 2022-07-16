package com.maiora.lms.api.dto;

import java.security.Timestamp;

public class EnquiryDetailsDTO {

	private int enquiry_details_id;
	private String username;
	private String email;
	private int mobile;
	private String address;
	private String DOB;
	private String how_did_you_here;
	private String referred_person;
	private String current_college;
	private String course_interested;
	private String country_interested;
	private Timestamp start_date;
	private Timestamp end_date;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getEnquiry_details_id() {
		return enquiry_details_id;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public int getMobile() {
		return mobile;
	}
	public String getAddress() {
		return address;
	}
	public String getDOB() {
		return DOB;
	}
	public String getHow_did_you_here() {
		return how_did_you_here;
	}
	public String getReferred_person() {
		return referred_person;
	}
	public String getCurrent_college() {
		return current_college;
	}
	public String getCourse_interested() {
		return course_interested;
	}
	public String getCountry_interested() {
		return country_interested;
	}
	public Timestamp getStart_date() {
		return start_date;
	}
	public Timestamp getEnd_date() {
		return end_date;
	}
	public int getIs_deleted() {
		return is_deleted;
	}
	public int getIs_active() {
		return is_active;
	}
	public String getCreated_by() {
		return created_by;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public Timestamp getCreated_on() {
		return created_on;
	}
	public Timestamp getUpdated_on() {
		return updated_on;
	}
	public void setEnquiry_details_id(int enquiry_details_id) {
		this.enquiry_details_id = enquiry_details_id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public void setHow_did_you_here(String how_did_you_here) {
		this.how_did_you_here = how_did_you_here;
	}
	public void setReferred_person(String referred_person) {
		this.referred_person = referred_person;
	}
	public void setCurrent_college(String current_college) {
		this.current_college = current_college;
	}
	public void setCourse_interested(String course_interested) {
		this.course_interested = course_interested;
	}
	public void setCountry_interested(String country_interested) {
		this.country_interested = country_interested;
	}
	public void setStart_date(Timestamp start_date) {
		this.start_date = start_date;
	}
	public void setEnd_date(Timestamp end_date) {
		this.end_date = end_date;
	}
	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}
	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}
	public void setUpdated_on(Timestamp updated_on) {
		this.updated_on = updated_on;
	}
	
	
}
