package com.board.web.domains;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@Lazy
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private String userid,passwd,name,birthday,gender,telephone,regdate,accessCode;
}
