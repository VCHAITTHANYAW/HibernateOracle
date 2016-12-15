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
		personAddress.setAddressId("flat no:4");
		personAddress.setPersonId("5689");
		
		Person person = new Person();
		person.setPersonId(256);
		person.setFirstName("V");
		person.setLastName("CHAITTHANYAW");
		Person person1 = new Person();
		person1.setPersonId(257);
		person1.setFirstName("java");
		person1.setLastName("prog");
		
		Address address = new Address();
		address.setAddressId("flat no:4");
		address.setCity("hyderabad");
        address.setTown("MOTINAGAR");
        
        session.save(personAddress);
        session.save(person);
        session.save(person1);
        session.save(address);
        transaction.commit();
        session.close();
        sessionFactory.close();
		
	}

}
