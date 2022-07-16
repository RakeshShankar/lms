

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pricing
 *
 */
@Entity
@Table(name="lm_pricing")
public class Pricing implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pricings_id")
	private int pricings_id;
	@Column(name = "amount")
	private int amount;
	@Column(name = "plan")
	private boolean plan;
	@Column(name = "name")
	private String name;
	@Column(name = "valid_from")
	private Date valid_from;
	@Column(name = "valid_to")
	private Date valid_to;
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

	public Pricing() {
		super();
	}   
	public int getPricings_id() {
		return this.pricings_id;
	}

	public void setPricings_id(int pricings_id) {
		this.pricings_id = pricings_id;
	}   
	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}   
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public Date getValid_from() {
		return this.valid_from;
	}

	public void setValid_from(Date valid_from) {
		this.valid_from = valid_from;
	}   
	public Date getValid_to() {
		return this.valid_to;
	}

	public void setValid_to(Date valid_to) {
		this.valid_to = valid_to;
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
	public boolean isPlan() {
		return plan;
	}
	public void setPlan(boolean plan) {
		this.plan = plan;
	}
   
}
