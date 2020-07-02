package com.board.web.mappers;

import java.util.HashMap;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.board.web.domains.Person;

@Repository
public interface PersonMapper {
	public void insertUser(Person user);
	public Person selectByUseridAndPasswd(Person user);
	public int existId(String userid);
	public int countUsers();
	public void createDB(HashMap<String, String> paramMap);
	public void createUser(HashMap<String, String> paramMap);
	public void dropUser(HashMap<String, String> paramMap);
	public void truncatePerson(HashMap<String, String> paramMap);
}
