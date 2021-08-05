package com.vinodh.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinodh.model.User;
import com.vinodh.repository.UserRepository;

@Service
public class UserDetailService {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(UserDetailService.class);

	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		logger.info("add user : "+user);
		return userRepository.save(user);	
	}

	public List<User> findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
