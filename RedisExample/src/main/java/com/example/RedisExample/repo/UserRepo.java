package com.example.RedisExample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RedisExample.model.UserInfo;

@Repository
public interface UserRepo extends JpaRepository<UserInfo, String> {

}
