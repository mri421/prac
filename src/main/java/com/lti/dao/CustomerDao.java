package com.lti.dao;

import java.util.List;

import com.lti.beans.Customer;
import com.lti.beans.Scheme;

public interface CustomerDao {
	public Customer getCustomerDetails(int custId);
	public Scheme getSchemeDetails(int schemeId);	
	public List<Customer> getCustList();
}
