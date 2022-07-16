

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;
import java.util.Set;

import javax.persistence.*;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Lessons
 *
 */
@Entity
@Table(name="lm_lessons")
public class Lessons implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lession_id")
	private int lession_id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
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
	@JoinColumn(name = "course_id", nullable = false)
	private courses lm_courses;
	
	@OneToMany(mappedBy ="lm_lessons")
	private Set<Chapters> lm_chapter;
	
	@OneToMany(mappedBy ="lm_lessons")
	private Set<Test> lm_test;
	
	public Lessons() {
		super();
	}   
	
	public courses getLm_courses() {
		return lm_courses;
	}

	public Set<Chapters> getLm_chapter() {
		return lm_chapter;
	}

	public Set<Test> getLm_test() {
		return lm_test;
	}

	public void setLm_courses(courses lm_courses) {
		this.lm_courses = lm_courses;
	}

	public void setLm_chapter(Set<Chapters> lm_chapter) {
		this.lm_chapter = lm_chapter;
	}

	public void setLm_test(Set<Test> lm_test) {
		this.lm_test = lm_test;
	}

	public int getLession_id() {
		return this.lession_id;
	}

	public void setLession_id(int lession_id) {
		this.lession_id = lession_id;
	}   
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Override
	public String toString() {
		return "Lessons [lession_id=" + lession_id + ", name=" + name + ", description=" + description + ", is_deleted="
				+ is_deleted + ", is_active=" + is_active + ", created_by=" + created_by + ", updated_by=" + updated_by
				+ ", created_on=" + created_on + ", updated_on=" + updated_on + ", lm_courses=" + lm_courses
				+ ", lm_chapter=" + lm_chapter + ", lm_test=" + lm_test + "]";
	}

	
	
	
   
}
