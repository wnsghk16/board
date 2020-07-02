package com.board.web.mappers;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.board.web.domains.Person;

@Repository
public interface TxMapper {
	@Insert("insert into user (userid, passwd, name, email)"
			+ " values #{userid},#{passwd},#{name},#{email}")
	public void insertUser(Person user);
}
