package com.vinodh.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinodh.model.User;
import com.vinodh.service.UserDetailService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private UserDetailService userDetailService;

	@PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
	public User addUser( @RequestBody User user)
	{
		logger.info("add user :"+user);
		return userDetailService.saveUser(user);
	}
	
	@GetMapping(path= "/findByUsername/{username}")
	public List<User> findByUsername( @PathVariable(name = "username") String username)
	{
		logger.info("findByUsername :"+username);
		return userDetailService.findByUsername(username);
	}

}
