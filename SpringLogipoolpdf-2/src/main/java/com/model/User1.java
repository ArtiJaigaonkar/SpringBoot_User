package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class User1 {
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public User1(String city) {
		super();
		this.city = city;
	}
	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", city=" + city + "]";
	}
	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static List<User1> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public static User1 save(User1 user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
