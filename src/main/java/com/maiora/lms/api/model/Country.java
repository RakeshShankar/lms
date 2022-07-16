

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Country
 *
 */
@Entity
@Table(name="lm_country")
public class Country implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id")
	private int country_id;
	@Column(name = "country")
	private String country;
	@Column(name = "country_code")
	private String country_code;
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

	@OneToMany(mappedBy ="lm_country")
	private Set<universities> lm_university;
	
	@OneToMany(mappedBy ="lm_country")
	private Set<EnquiryDetails> lm_enquirydetail;
	
	public Country() {
		super();
	}  
	
	
	public Timestamp getUpdated_on() {
		return updated_on;
	}


	public Set<universities> getLm_university() {
		return lm_university;
	}


	public Set<EnquiryDetails> getLm_enquirydetail() {
		return lm_enquirydetail;
	}


	public void setUpdated_on(Timestamp updated_on) {
		this.updated_on = updated_on;
	}


	public void setLm_university(Set<universities> lm_university) {
		this.lm_university = lm_university;
	}


	public void setLm_enquirydetail(Set<EnquiryDetails> lm_enquirydetail) {
		this.lm_enquirydetail = lm_enquirydetail;
	}


	public int getCountry_id() {
		return this.country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}   
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}   
	public String getCountry_code() {
		return this.country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}   
	public int getIs_deleted() {
		return this.is_deleted;
	}

	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
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

   
}
