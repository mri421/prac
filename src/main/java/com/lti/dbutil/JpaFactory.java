package com.lti.dbutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaFactory {
	private EntityManagerFactory factory;
	private EntityManager manager;
	
	public JpaFactory(){
		factory = Persistence.createEntityManagerFactory("JPA-PU");
		manager = factory.createEntityManager();
	}

	public EntityManagerFactory getFactory(){
		return factory;
	}
	
	public EntityManager getManager(){
		return manager;
	}
	
	public EntityTransaction getTransaction(){
		return manager.getTransaction();
	}
	
	/*@Override
	protected void finalize() throws Throwable {
		if (manager != null){
			manager.close();
		}
		
		if (factory != null){
			factory.close();
		}
		super.finalize();
	}*/
}
