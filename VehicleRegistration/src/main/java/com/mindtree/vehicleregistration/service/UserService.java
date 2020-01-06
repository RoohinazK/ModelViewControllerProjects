package com.mindtree.vehicleregistration.service;

import java.util.List;

import com.mindtree.vehicleregistration.entity.User;

public interface UserService {

	public void saveDetails(User user);

	public List<User> getAllUsers();

}
