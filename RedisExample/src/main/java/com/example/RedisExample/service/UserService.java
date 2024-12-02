package com.example.RedisExample.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.RedisExample.model.UserInfo;
import com.example.RedisExample.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo repo;
	
//	@CachePut(value = "userinfo",key="#user.id")
	public UserInfo saveUser(UserInfo user)
	{
		user.setId(UUID.randomUUID().toString());
		
		return repo.save(user);
	}
	
	
	@Cacheable(value = "userinfo",key = "#noteID")
	public UserInfo getUserById(String noteID)
	{
		return repo.findById(noteID).get();
	}
	
	public void deleteById(String noteId)
	{
		repo.deleteById(noteId);
	}
//	public 
}
