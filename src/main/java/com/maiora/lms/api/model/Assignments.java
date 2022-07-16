
package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;

import javax.persistence.*;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Assignments
 *
 */
@Entity
@Table(name = "lm_assignment")
public class Assignments implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "assignment_id")
	private int assignment_id;
	@Column(name = "assignment")
	private String assignment;
	@Column(name = "description")
	private String description;
	@Column(name = "max_time")
	private Timestamp max_time;
	@Column(name = "total_namrks")
	private int total_namrks;
	@Column(name = "passing_marks")
	private int passing_marks;
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
	@JoinColumn(name = "chapter_id", nullable = false)
	private Chapters lm_chapter;
	
	public Assignments() {
		super();
	}

	public Chapters getLm_chapter() {
		return lm_chapter;
	}

	public void setLm_chapter(Chapters lm_chapter) {
		this.lm_chapter = lm_chapter;
	}

	public int getAssignment_id() {
		return this.assignment_id;
	}

	public void setAssignment_id(int assignment_id) {
		this.assignment_id = assignment_id;
	}

	public String getAssignment() {
		return this.assignment;
	}

	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getMax_time() {
		return this.max_time;
	}

	public void setMax_time(Timestamp max_time) {
		this.max_time = max_time;
	}

	public int getTotal_namrks() {
		return this.total_namrks;
	}

	public void setTotal_namrks(int total_namrks) {
		this.total_namrks = total_namrks;
	}

	public int getPassing_marks() {
		return this.passing_marks;
	}

	public void setPassing_marks(int passing_marks) {
		this.passing_marks = passing_marks;
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
