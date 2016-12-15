package com.hibernateaOracle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =configuration.buildSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		PersonAddress personAddress = new PersonAddress();
		personAddress.setAddressId("123");
		personAddress.setPersonId("124");
		
		Person person = new Person();
		person.setPersonId(12);
		person.setFirstName("teegala");
		person.setLastName("gangareddy");
		
		Address address = new Address();
		address.setAddressId("123");
		address.setCity("hyderabad");
        address.setTown("kompally");
        
        session.save(personAddress);
        session.save(person);
        session.save(address);
        transaction.commit();
        session.close();
        sessionFactory.close();
		
	}

}
