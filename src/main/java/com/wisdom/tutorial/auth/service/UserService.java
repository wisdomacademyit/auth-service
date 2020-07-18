package com.wisdom.tutorial.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisdom.tutorial.auth.model.User;
import com.wisdom.tutorial.auth.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public User createUser(User user) throws Exception{
		return userRepository.save(user);
	}

	@Transactional
	public User updateUser(User user) throws Exception{
		if (userRepository.existsById(user.getUserId()))
			return userRepository.save(user);
		else
			return null;
	}

	@Transactional
	public void deleteUser(Integer userId) throws Exception{
		userRepository.deleteById(userId);
	}

	@Transactional(readOnly = true)
	public User getUser(Integer userId) throws Exception {
		return userRepository.getOne(userId);
	}

	@Transactional(readOnly = true)
	public List<User> getAllUsers() throws Exception {
		return userRepository.findAll();
	}
}
