

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;
import java.util.Set;

import javax.persistence.*;

import net.bytebuddy.implementation.bind.annotation.AllArguments.Assignment;

import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Chapters
 *
 */
@Entity
@Table(name="lm_chapter")
public class Chapters implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "chapter_id")
	private int chapter_id;
	@Column(name = "chapter_name")
	private String chapter_name;
	@Column(name = "description")
	private String description;
	@Column(name = "hours")
	private Timestamp hours;
	@Column(name = "chapter_image")
	private String chapter_image;
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

	@OneToMany(mappedBy ="lm_chapter")
	private Set<Assignments> lm_assignment;
	
	@OneToMany(mappedBy ="lm_chapter")
	private Set<SubChapters> lm_subchapter;
	
	@ManyToOne
	@JoinColumn(name = "lession_id", nullable = false)
	private Lessons lm_lessons;
	
	public Chapters() {
		super();
	}   
	
	public Set<Assignments> getLm_assignment() {
		return lm_assignment;
	}

	public Set<SubChapters> getLm_subchapter() {
		return lm_subchapter;
	}

	public Lessons getLm_lessons() {
		return lm_lessons;
	}

	public void setLm_assignment(Set<Assignments> lm_assignment) {
		this.lm_assignment = lm_assignment;
	}

	public void setLm_subchapter(Set<SubChapters> lm_subchapter) {
		this.lm_subchapter = lm_subchapter;
	}

	public void setLm_lessons(Lessons lm_lessons) {
		this.lm_lessons = lm_lessons;
	}

	public int getChapter_id() {
		return this.chapter_id;
	}

	public void setChapter_id(int chapter_id) {
		this.chapter_id = chapter_id;
	}   
	public String getChapter_name() {
		return this.chapter_name;
	}

	public void setChapter_name(String chapter_name) {
		this.chapter_name = chapter_name;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Timestamp getHours() {
		return this.hours;
	}

	public void setHours(Timestamp hours) {
		this.hours = hours;
	}   
	public String getChapter_image() {
		return this.chapter_image;
	}

	public void setChapter_image(String chapter_image) {
		this.chapter_image = chapter_image;
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
