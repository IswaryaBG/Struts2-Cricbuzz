package com.cricbuzz.services;

import java.util.List;

import javax.persistence.RollbackException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cricbuzz.dao.DAOUtil;
import com.cricbuzz.model.Person;

public class PersonService {
	
	List<Person> personList;
	Session session;
	
	public PersonService() {
		session = DAOUtil.getSession();
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public List<Person> getPersons() {
		
		Query query=session.createQuery("from Person");
		personList=query.list();
		return personList;
	}
	public void addPerson(Person person) {
		
		try {
			Session session=DAOUtil.getSession();
			Transaction transaction=session.beginTransaction();
			session.save(person);
			transaction.commit();
			session.close();
			}
			catch(IllegalStateException e) {
				System.out.println(e);
			}
			catch(RollbackException e) {
				System.out.println(e);
			}
	}
}
