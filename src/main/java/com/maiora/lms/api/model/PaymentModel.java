package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "paymentmodel")
public class PaymentModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paymentid")
	@JsonIgnore
	private int paymentid;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "intro_pay_id")
	private IntroPayment introduction;

	@OneToMany(targetEntity = TypesPayment.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "itpp_fk", referencedColumnName = "paymentid")
	private List<TypesPayment> types = new ArrayList<>();

	@OneToMany(targetEntity = PartsPayment.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ippp_fk", referencedColumnName = "paymentid")
	private List<PartsPayment> parts = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "results_pay_id")
	private ResultsPayment results;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "band_pay_id")
	private BandPayment bandDetails;

	public int getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}

	public IntroPayment getIntroduction() {
		return introduction;
	}

	public void setIntroduction(IntroPayment introduction) {
		this.introduction = introduction;
	}

	public List<TypesPayment> getTypes() {
		return types;
	}

	public void setTypes(List<TypesPayment> types) {
		this.types = types;
	}

	public List<PartsPayment> getParts() {
		return parts;
	}

	public void setParts(List<PartsPayment> parts) {
		this.parts = parts;
	}

	public ResultsPayment getResults() {
		return results;
	}

	public void setResults(ResultsPayment results) {
		this.results = results;
	}

	public BandPayment getBandDetails() {
		return bandDetails;
	}

	public void setBandDetails(BandPayment bandDetails) {
		this.bandDetails = bandDetails;
	}

	@Override
	public String toString() {
		return "PaymentModel [paymentid=" + paymentid + ", introduction=" + introduction + ", types=" + types
				+ ", parts=" + parts + ", results=" + results + ", bandDetails=" + bandDetails + "]";
	}

}
