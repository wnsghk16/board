package com.board.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.web.domains.PersonDTO;
import com.board.web.enums.Messenger;

@Controller
@RequestMapping("/person")
public class PersonController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@PostMapping("/users")
	public Messenger join(@RequestBody PersonDTO person) {
		System.out.println("넘어온 회원정보"+person.toString());
		return Messenger.SUCCESS;
	}
}
