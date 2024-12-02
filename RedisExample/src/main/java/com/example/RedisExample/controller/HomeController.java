package com.example.RedisExample.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RedisExample.model.UserInfo;
import com.example.RedisExample.service.UserService;

@RestController
public class HomeController {

	@Autowired
	UserService service;

	@PostMapping("/save")
	public ResponseEntity<UserInfo> saveUSers(@RequestBody UserInfo u) {
		return new ResponseEntity<UserInfo>(service.saveUser(u), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<UserInfo> getUSerById(@PathVariable("id") String id)
	{
//		ResponseEntity.ok(service.getUserById(id));
		return new ResponseEntity<UserInfo>(service.getUserById(id), HttpStatus.OK);

	}

	
//	
//	@GetMapping("/getAllUsers")
//	public ResponseEntity<List<UserInfo>> getUSerById()
//	{
//		return new ResponseEntity<List<UserInfo>>(service.ge, HttpStatus.OK);
//
//	}
	
	
	
}
