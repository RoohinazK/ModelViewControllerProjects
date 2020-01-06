package com.mindtree.travelbooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.travelbooking.entity.User;

@Service
public interface UserService {

	public void insertUser(User user);

	public List<User> getUsers();

}
