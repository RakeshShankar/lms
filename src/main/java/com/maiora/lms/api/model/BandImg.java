package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bandimg")
public class BandImg {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bandimgid")
	private Long bandimgid;

	@Column(name = "name")
	private String name;

	@Column(name = "last_modified")
	private String lastModified;

	@Column(name = "webkit_relative_path")
	private String webkitRelativePath;

	@Column(name = "size")
	private int size;

	
	public String getName() {
		return name;
	}

	public Long getBandimgid() {
		return bandimgid;
	}

	public void setBandimgid(Long bandimgid) {
		this.bandimgid = bandimgid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastModified() {
		return lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public String getWebkitRelativePath() {
		return webkitRelativePath;
	}

	public void setWebkitRelativePath(String webkitRelativePath) {
		this.webkitRelativePath = webkitRelativePath;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


}
