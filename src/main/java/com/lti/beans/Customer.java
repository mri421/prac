package com.lti.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_MTM")
public class Customer {
	@Id
	private int custId;
	private String custName;
	private String address;
	private String mobile;
	
	// Association
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_schemes", 
	joinColumns = { @JoinColumn(name = "CUSTID") }, 
	inverseJoinColumns = {@JoinColumn(name = "SCHEMEID") })
	private List<Scheme> schemes;
	
	
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}

	public Customer() {
		super();
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public List<Scheme> getSchemes() {
		return schemes;
	}

	public void setSchemes(List<Scheme> schemes) {
		this.schemes = schemes;
	}
// Don't include scheme - 
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + ", mobile=" + mobile
				+ "]";
	}

	
}