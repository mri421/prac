package com.lti.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserApp {
public static void main(String[] args) {
	
	Student s = new Student("Singh",520);
	System.out.println(s);
/*
	Student s1= new Student();
	s1.setStuName("Khandelwal");
	s1.setScore(100);
*/	
	

	//EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
	
//EntityManager em =factory.createEntityManager();
	//em.persist(s);
	
	
EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
EntityManager em =factory.createEntityManager();
	
em.getTransaction().begin();
	
em.persist(s);
	
	System.out.println("Record Added");
	
	em.getTransaction().commit();
	
	

	em.getTransaction().begin();

	Student tempStu = em.find(Student.class,108);
	System.out.println("student found"+tempStu);
	
	em.getTransaction().commit();

	//update 
	/*em.getTransaction().begin();
		tempStu.setScore(10);
		em.merge(tempStu);
		
em.getTransaction().commit();
*/
	// delete
	// em.getTransaction().begin();
	// em.remove(tempStu);
	// em.getTransaction().commit();
				
				
em.close();
factory.close();

}
}
