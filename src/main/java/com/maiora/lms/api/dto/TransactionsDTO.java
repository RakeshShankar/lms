package com.maiora.lms.api.dto;

import java.security.Timestamp;

public class TransactionsDTO {

	private int transaction_id;
	private int paid_amt;
	private int remaining_amt;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getTransaction_id() {
		return transaction_id;
	}
	public int getPaid_amt() {
		return paid_amt;
	}
	public int getRemaining_amt() {
		return remaining_amt;
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
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public void setPaid_amt(int paid_amt) {
		this.paid_amt = paid_amt;
	}
	public void setRemaining_amt(int remaining_amt) {
		this.remaining_amt = remaining_amt;
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
