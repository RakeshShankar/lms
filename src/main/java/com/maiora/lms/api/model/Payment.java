

package com.maiora.lms.api.model;

import java.io.Serializable;
import java.lang.String;
import java.security.Timestamp;
import java.sql.Date;
import java.util.Set;

import javax.persistence.*;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Payment
 *
 */
@Entity
@Table(name="lm_payment")
public class Payment implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_id")
	private int payment_id;
	@Column(name = "amount")
	private int amount;
	@Column(name = "card_number")
	private int card_number;
	@Column(name = "cvv")
	private int cvv;
	@Column(name = "expiry_data")
	private Date expiry_data;
	@Column(name = "payment_status")
	private String payment_status;
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
	@JoinColumn(name = "id", nullable = false)
	private Users users;
	
	public Payment() {
		super();
	}   
	
	@OneToMany(mappedBy ="lm_payment")
	private Set<Transactions> lm_transactions;
	
	
	public Set<Transactions> getLm_transactions() {
		return lm_transactions;
	}

	public void setLm_transactions(Set<Transactions> lm_transactions) {
		this.lm_transactions = lm_transactions;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getPayment_id() {
		return this.payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}   
	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}   
	public int getCard_number() {
		return this.card_number;
	}

	public void setCard_number(int card_number) {
		this.card_number = card_number;
	}   
	public int getCvv() {
		return this.cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}   
	public Date getExpiry_data() {
		return this.expiry_data;
	}

	public void setExpiry_data(Date expiry_data) {
		this.expiry_data = expiry_data;
	}   
	public String getPayment_status() {
		return this.payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
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
