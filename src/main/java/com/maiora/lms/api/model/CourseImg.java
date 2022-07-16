package com.maiora.lms.api.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "courseimg")
public class CourseImg {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "imgid")
	private int imgid;

	@Column(name = "last_modified")
	private int lastModified;

	@Column(name = "last_modified_date")
	private Date lastModifiedDate;

	@Column(name = "name")
	private String name;

	@Column(name = "size")
	private int size;

	@Column(name = "type")
	private String type;

	@Column(name = "webkit_relative_path")
	private String webkitRelativePath;

	public int getImgid() {
		return imgid;
	}

	public void setImgid(int imgid) {
		this.imgid = imgid;
	}

	public int getLastModified() {
		return lastModified;
	}

	public void setLastModified(int lastModified) {
		this.lastModified = lastModified;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWebkitRelativePath() {
		return webkitRelativePath;
	}

	public void setWebkitRelativePath(String webkitRelativePath) {
		this.webkitRelativePath = webkitRelativePath;
	}

	@Override
	public String toString() {
		return "CourseImg [imgid=" + imgid + ", lastModified=" + lastModified + ", lastModifiedDate=" + lastModifiedDate
				+ ", name=" + name + ", size=" + size + ", type=" + type + ", webkitRelativePath=" + webkitRelativePath
				+ "]";
	}

}
