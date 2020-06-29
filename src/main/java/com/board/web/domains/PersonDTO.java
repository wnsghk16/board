package com.board.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class PersonDTO {
	private int userNo;
	private String userid,passwd,name,email;
}
