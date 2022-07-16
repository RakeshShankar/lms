package com.maiora.lms.api.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "resimg")
public class ResImg {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resid")
	private int resid;

	@Column(name = "name")
	private String name;
	
	@Column(name = "last_modified")
	private String lastmodified;
	
	@Column(name = "last_modified_date")
	private Date lastmodifieddate;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "size")
	private int size;

	public int getResid() {
		return resid;
	}

	public void setResid(int resid) {
		this.resid = resid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastmodified() {
		return lastmodified;
	}

	public void setLastmodified(String lastmodified) {
		this.lastmodified = lastmodified;
	}

	public Date getLastmodifieddate() {
		return lastmodifieddate;
	}

	public void setLastmodifieddate(Date lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "ResImg [resid=" + resid + ", name=" + name + ", lastmodified=" + lastmodified + ", lastmodifieddate="
				+ lastmodifieddate + ", type=" + type + ", size=" + size + "]";
	}
	




}
