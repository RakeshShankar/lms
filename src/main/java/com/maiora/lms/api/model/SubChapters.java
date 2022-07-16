

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;

import javax.persistence.*;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubChapters
 *
 */
@Entity
@Table(name="lm_subchapter")
public class SubChapters implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sub_chapter_id")
	private int sub_chapter_id;
	@Column(name = "sub_chapters_name")
	private String sub_chapters_name;
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
	
	public Chapters getLm_chapter() {
		return lm_chapter;
	}
	public void setLm_chapter(Chapters lm_chapter) {
		this.lm_chapter = lm_chapter;
	}
	public SubChapters() {
		super();
	}   
	public int getSub_chapter_id() {
		return this.sub_chapter_id;
	}

	public void setSub_chapter_id(int sub_chapter_id) {
		this.sub_chapter_id = sub_chapter_id;
	}   
	public String getSub_chapters_name() {
		return this.sub_chapters_name;
	}

	public void setSub_chapters_name(String sub_chapters_name) {
		this.sub_chapters_name = sub_chapters_name;
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
