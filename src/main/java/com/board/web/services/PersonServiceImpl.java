package com.board.web.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.web.domains.Person;
import com.board.web.mappers.PersonMapper;

@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	PersonMapper personMapper;
	@Autowired Person person;

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person findByUseridAndPasswd(Person param) {
		// TODO Auto-generated method stub
		return personMapper.selectByUseridAndPasswd(param);
	}

	@Override
	public void findByEmailOrUserId(String email, String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByCreatedAtBetween(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByAgeGraterThanEqual(int age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByNameLike(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByAccessCodeIsNull() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByGenerLike(String gender) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByEmailOrderByNameAsc(String email) {
		// TODO Auto-generated method stub
		
	}

}
