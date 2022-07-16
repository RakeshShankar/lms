

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;

import javax.persistence.*;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Transactions
 *
 */
@Entity
@Table(name="lm_transactions")
public class Transactions implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private int transaction_id;
	@Column(name = "paid_amt")
	private int paid_amt;
	@Column(name = "remaining_amt")
	private int remaining_amt;
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
	@JoinColumn(name = "payment_id", nullable = false)
	private Payment lm_payment;
	
	public Transactions() {
		super();
	}  
	
	public Payment getLm_payment() {
		return lm_payment;
	}

	public void setLm_payment(Payment lm_payment) {
		this.lm_payment = lm_payment;
	}

	public int getTransaction_id() {
		return this.transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}   
	public int getPaid_amt() {
		return this.paid_amt;
	}

	public void setPaid_amt(int paid_amt) {
		this.paid_amt = paid_amt;
	}   
	public int getRemaining_amt() {
		return this.remaining_amt;
	}

	public void setRemaining_amt(int remaining_amt) {
		this.remaining_amt = remaining_amt;
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
