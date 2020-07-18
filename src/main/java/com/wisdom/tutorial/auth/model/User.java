package com.wisdom.tutorial.auth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	
	@Id
	@GeneratedValue
	private Integer userId;
	
	@Column(name = "USER_NAME", length = 40, nullable = false)
	private String username;
	
	@Column(name = "PASSWORD", length = 40, nullable = false)
	private String password;
	
	@Column(name = "EMAIL", length = 60, nullable = false)
	private String email;
	
	@Column(name = "ACTIVE")
	private Boolean active;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	
	
	
}
