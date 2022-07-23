package com.lti.user;

import java.util.List;

import com.lti.beans.Customer;
import com.lti.beans.Scheme;
import com.lti.dao.CustomerDao;
import com.lti.dao.CustomerDaoImpl;

public class UserApp {

	public static void main(String[] args) {

		CustomerDao dao = new CustomerDaoImpl();

		Customer cust1 = dao.getCustomerDetails(101);
		System.out.println(cust1);
		System.out.println(cust1.getCustId() + " :" + cust1.getSchemes());

		Scheme scheme = dao.getSchemeDetails(1);
		System.out.println(scheme);
		System.out.println(scheme.getCustList());

		CustomerDao dao1 = new CustomerDaoImpl();
		List<Customer> custList = dao1.getCustList();
		System.out.println(custList);
		System.out.println("No of records" + custList.size());

		// Update Customer Address // update Scheme - name
		// updateCust(101,"Delhi");
		// accept cust id and new address from user

		// allow to delete customer/scheme
		// joins
		// Add new record in customer /scheme
	}
}
