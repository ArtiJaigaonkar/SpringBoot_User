package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.user1Repository;
import com.model.User1;
@Service
public class User1ServiceImpl implements User1Service{
	
	@Autowired
	user1Repository user1Repo;

	@Override
	public User1 addUser1(User1 user1) {
		// TODO Auto-generated method stub
		return user1Repo.save(user1);
	}

	@Override
	public List<User1> getUsers1() {
		// TODO Auto-generated method stub
		return user1Repo.findAll();
	}

}
