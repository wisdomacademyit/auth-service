package com.wisdom.tutorial.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdom.tutorial.auth.model.User;
import com.wisdom.tutorial.auth.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public User createUser(@RequestBody User user) {
		try {
			return userService.createUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@PutMapping
	public User updateUser(@RequestBody User user) {
		try {
			return userService.updateUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Integer userId) {
		try {
			userService.deleteUser(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Integer userId) {
		try {
			return userService.getUser(userId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@GetMapping
	public List<User> getAllUsers() {
		try {
			return userService.getAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
