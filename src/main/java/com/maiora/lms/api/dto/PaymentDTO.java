package com.maiora.lms.api.dto;

import java.security.Timestamp;
import java.sql.Date;

public class PaymentDTO {

	private int payment_id;
	private int amount;
	private int card_number;
	private int cvv;
	private Date expiry_data;
	private String payment_status;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getPayment_id() {
		return payment_id;
	}
	public int getAmount() {
		return amount;
	}
	public int getCard_number() {
		return card_number;
	}
	public int getCvv() {
		return cvv;
	}
	public Date getExpiry_data() {
		return expiry_data;
	}
	public String getPayment_status() {
		return payment_status;
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
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setCard_number(int card_number) {
		this.card_number = card_number;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public void setExpiry_data(Date expiry_data) {
		this.expiry_data = expiry_data;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
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
