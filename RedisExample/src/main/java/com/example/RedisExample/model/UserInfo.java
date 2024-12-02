package com.example.RedisExample.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class UserInfo implements Serializable {
	@Id
	private String id;
	private String name;
	private String location;
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
