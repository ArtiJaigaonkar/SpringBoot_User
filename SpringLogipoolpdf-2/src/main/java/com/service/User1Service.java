package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.User1;

@Service
public interface User1Service {
	
	User1 addUser1(User1 user);
		List<User1> getUsers1();
			
		}


