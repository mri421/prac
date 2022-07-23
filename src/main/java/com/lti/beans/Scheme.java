package com.lti.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Schemes")
public class Scheme {
	@Id
	private int schemeId;
	private String schemeName;

	// Association
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_schemes", 
	joinColumns = { @JoinColumn(name = "schemeId") }, 
	inverseJoinColumns = {@JoinColumn(name = "custId") })
	private List<Customer> custList;

	public Scheme(int schemeId, String schemeName) {
		super();
		this.schemeId = schemeId;
		this.schemeName = schemeName;
	}

	public Scheme() {
		super();
	}

	public int getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public List<Customer> getCustList() {
		return custList;
	}

	public void setCustList(List<Customer> custList) {
		this.custList = custList;
	}

	@Override
	public String toString() {
		return "\n Scheme [schemeId=" + schemeId + ", schemeName=" + schemeName + "]";
	}
}