package com.hcl.policies.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="hcl_polices")
public class Polices implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="policy_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	int id;
	
	@Column(name="policy_name")
	String plociName;
	
	@Column(name="max_maturity_age")
	int maxMaturityAge;
	
	@Column(name="policy_term")
	int policyTerm;

	@Column(name="min_premium")
	float minPremium;
	
	@Column(name="min_sum_assured")
	long minSumAssured;

	public String getPlociName() {
		return plociName;
	}

	public void setPlociName(String plociName) {
		this.plociName = plociName;
	}

	public int getMaxMaturityAge() {
		return maxMaturityAge;
	}

	public void setMaxMaturityAge(int maxMaturityAge) {
		this.maxMaturityAge = maxMaturityAge;
	}

	public int getPolicyTerm() {
		return policyTerm;
	}

	public void setPolicyTerm(int policyTerm) {
		this.policyTerm = policyTerm;
	}

	public float getMinPremium() {
		return minPremium;
	}

	public void setMinPremium(float minPremium) {
		this.minPremium = minPremium;
	}

	public long getMinSumAssured() {
		return minSumAssured;
	}

	public void setMinSumAssured(long minSumAssured) {
		this.minSumAssured = minSumAssured;
	}
	
	
}
