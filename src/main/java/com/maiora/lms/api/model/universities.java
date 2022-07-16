

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;

import javax.persistence.*;
/**
 * Entity implementation class for Entity: universities
 *
 */
@Entity
@Table(name="lm_university")
public class universities implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "university_id")
	private int university_id;
	@Column(name = "university_name")
	private String university_name;
	@Column(name = "country")
	private String country;
	@Column(name = "description")
	private String description;
	@Column(name = "unversity_type")
	private  boolean unversity_type;
	@Column(name = "website")
	private String website;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile")
	private int mobile;
	@Column(name = "address")
	private String address;
	@Column(name = "founded_year")
	private Timestamp founded_year;
	@Column(name = "CGPA")
	private int CGPA;
	@Column(name = "university_image")
	private String university_image;
	@Column(name = "cover_pic")
	private String cover_pic;
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
	
	public universities() {
		super();
	}  
	
	public Country getLm_country() {
		return lm_country;
	}

	public void setLm_country(Country lm_country) {
		this.lm_country = lm_country;
	}

	public int getUniversity_id() {
		return this.university_id;
	}

	public void setUniversity_id(int university_id) {
		this.university_id = university_id;
	}   
	public String getUniversity_name() {
		return this.university_name;
	}

	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}   
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	
	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
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
	public Timestamp getFounded_year() {
		return this.founded_year;
	}

	public void setFounded_year(Timestamp founded_year) {
		this.founded_year = founded_year;
	}   
	public int getCGPA() {
		return this.CGPA;
	}

	public void setCGPA(int CGPA) {
		this.CGPA = CGPA;
	}   
	public String getUniversity_image() {
		return this.university_image;
	}

	public void setUniversity_image(String university_image) {
		this.university_image = university_image;
	}   
	public String getCover_pic() {
		return this.cover_pic;
	}

	public void setCover_pic(String cover_pic) {
		this.cover_pic = cover_pic;
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
	public boolean isUnversity_type() {
		return unversity_type;
	}
	public Timestamp getUpdated_on() {
		return updated_on;
	}
	public void setUnversity_type(boolean unversity_type) {
		this.unversity_type = unversity_type;
	}
	public void setUpdated_on(Timestamp updated_on) {
		this.updated_on = updated_on;
	}   

   
}
