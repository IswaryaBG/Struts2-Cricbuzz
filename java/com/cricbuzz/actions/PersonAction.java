package com.cricbuzz.actions;

import java.util.List;

import com.cricbuzz.model.Person;
import com.cricbuzz.services.PersonService;

import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {
	 
	 private static final long serialVersionUID = 1L;
	 private List<Person> personList;
	 private Person person;
	 private PersonService personService;
	 public PersonAction() {
	  personService = new PersonService();
	 }
	 
	 public String execute() {
	  setPersonList(personService.getPersons());
	  System.out.println(personService.getPersons());
	  return SUCCESS;
	 }
	 
	 public String addPerson() {
			personService.addPerson(person);
			System.out.println("Person added successfully");
			return SUCCESS;
	 }
  
	 public Person getPerson() {
		return person;
	 }

	 public void setPerson(Person person) {
		this.person = person;
	 }

	public List<Person> getPersonList() {
	  return personList;
	 }

	 public void setPersonList(List<Person> personList) {
	  this.personList = personList;
	 }
	 

	}
