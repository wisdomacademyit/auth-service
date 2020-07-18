package com.wisdom.tutorial.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wisdom.tutorial.auth.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
