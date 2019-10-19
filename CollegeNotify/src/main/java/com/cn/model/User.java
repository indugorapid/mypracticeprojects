package com.cn.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	public Integer id;
	
	public String name;
	
	@Column(name = "EMAIL")
	public String email;
	
	@Column(name = "PASSWORD")
	public String password;
	
	@Column(name = "MOBILE")
	public String mobile;

	@Column(name = "ADDRESS")
	public String address;
	
	@Column(name = "STATE")
	public String state;
	
	@Column(name = "CITY")
	public String city;
	
	@Column(name = "GENDER")
	public String gender;
	
	@Column(name = "CAST")
	public String cast;
	
	@Column(name = "RELIGION")
	public String religion;
	
	
	@Column(name = "BOARD")
	public String board;
	
	@Column(name = "STREAMS")
	public String streams;
	
	@Column(name = "COURSE")
	public String course;
	
	@Column(name = "DOB")
	public Date dob;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String getStreams() {
		return streams;
	}

	public void setStreams(String streams) {
		this.streams = streams;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
		
		
	}
