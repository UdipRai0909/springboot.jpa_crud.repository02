package com.sursatech.people_mgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sursatech.people_mgmt.dao.PeopleMgmtDao;
import com.sursatech.people_mgmt.entities.Person;

@Service
public class PeopleMgmtService {

	@Autowired
	private PeopleMgmtDao peopleMgmtDao;

	public List<Person> getPersonsInfoByLastName(String lastName) {
		return peopleMgmtDao.findByLastName(lastName);
	}

	public List<Person> getPersonsInfoByFirstNameAndEmail(String firstName, String email) {
		
		return peopleMgmtDao.findByFirstNameAndEmail(firstName, email);
	}
	
	
}
