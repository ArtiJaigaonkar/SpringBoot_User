package com.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lowagie.text.DocumentException;
import com.model.User1;
import com.model.User1Pdf;
import com.service.User1ServiceImpl;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class user1 {
	
	@Autowired
	User1ServiceImpl user1Ser;
	
	@PostMapping("/addUser1")
	public User1 addUser1(@RequestBody User1 user1) {
		return user1Ser.addUser1(user1);
		
	}
	
	@GetMapping("/getUser1")
	public List<User1>getList(){
	return user1Ser.getUsers1();
	}
	
	@GetMapping("/User1Pdf")
	public void exportUser1(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("Application/pdf");
		
		List<User1> list=user1Ser.getUsers1();
		
		User1Pdf up=new User1Pdf(list);
		
		up.export(response);
	}
	

}


