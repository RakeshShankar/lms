package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "typespayment")
public class TypesPayment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "typespaymentid")
	@JsonIgnore
	private int typespaymentid;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "paymentid", insertable = true, nullable=true)
//	//@JsonBackReference
//	private PaymentModel paymentModel;

	public int getTypespaymentid() {
		return typespaymentid;
	}

	public void setTypespaymentid(int typespaymentid) {
		this.typespaymentid = typespaymentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TypesPayment [typespaymentid=" + typespaymentid + ", name=" + name + ", description=" + description
				+ "]";
	}

}
