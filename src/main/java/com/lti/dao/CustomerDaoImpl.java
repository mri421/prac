package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.lti.beans.Customer;
import com.lti.beans.Scheme;
import com.lti.dbutil.JpaFactory;


public class CustomerDaoImpl implements CustomerDao {
	private EntityManager manager;
	private JpaFactory factory;// DbUtil util 
	
	public CustomerDaoImpl(){
		factory = new JpaFactory();  // util= new JPAUtil
		manager = factory.getManager(); // manager= util.getEntityManager();
	}
	@Override
	public Customer getCustomerDetails(int custId) {
		manager.getTransaction().begin();
		Customer cust = manager.find(Customer.class, custId);
		manager.getTransaction().commit();
		return cust;
	}
	@Override
	public Scheme getSchemeDetails(int schemeId) {
		Scheme scheme = manager.find(Scheme.class, schemeId);
		return scheme;
	}
	@Override
	public List<Customer> getCustList() {
		Query qry = manager.createQuery("from Customer");
//		qry.setFirstResult(0);
//		qry.setMaxResults(1);
		return qry.getResultList();
	}	
}
