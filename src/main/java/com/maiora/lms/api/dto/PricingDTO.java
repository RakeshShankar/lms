package com.maiora.lms.api.dto;

import java.security.Timestamp;
import java.sql.Date;

public class PricingDTO {

	private int pricings_id;
	private int amount;
	private boolean plan;
	private String name;
	private Date valid_from;
	private Date valid_to;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getPricings_id() {
		return pricings_id;
	}
	public int getAmount() {
		return amount;
	}
	public boolean isPlan() {
		return plan;
	}
	public String getName() {
		return name;
	}
	public Date getValid_from() {
		return valid_from;
	}
	public Date getValid_to() {
		return valid_to;
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
	public void setPricings_id(int pricings_id) {
		this.pricings_id = pricings_id;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setPlan(boolean plan) {
		this.plan = plan;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setValid_from(Date valid_from) {
		this.valid_from = valid_from;
	}
	public void setValid_to(Date valid_to) {
		this.valid_to = valid_to;
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
