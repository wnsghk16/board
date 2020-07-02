package com.board.web.controllers;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.board.web.domains.Person;
import com.board.web.enums.Messenger;
import com.board.web.services.PersonService;

@RestController
@RequestMapping("/person")
@SessionAttributes({"session"})
public class PersonController {
	@Autowired PersonService personService;
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@PostMapping("/users")
	public Messenger join(@RequestBody Person person) {
		System.out.println("넘어온 회원정보"+person.toString());
		return Messenger.SUCCESS;
	}
	
	@PostMapping("/users/{userid}")
	public Person login(HttpSession session,@PathVariable String userid, @RequestBody Person person) {
		System.out.println("넘어온 회원정보"+person.toString());
		Person returnPerson = personService.findByUseridAndPasswd(person);
		session.setAttribute("session", returnPerson);
		return returnPerson;
	}
	
}
