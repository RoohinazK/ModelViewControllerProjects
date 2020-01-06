package com.mindtree.vehicleregistration.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.vehicleregistration.entity.User;
import com.mindtree.vehicleregistration.repository.UserRepository;
import com.mindtree.vehicleregistration.repository.VehicleRepository;
import com.mindtree.vehicleregistration.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public void saveDetails(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}
