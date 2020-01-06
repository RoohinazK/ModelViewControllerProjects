package com.mindtree.travelbooking.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.travelbooking.entity.User;
import com.mindtree.travelbooking.repository.BookingRepository;
import com.mindtree.travelbooking.repository.UserRepository;
import com.mindtree.travelbooking.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private BookingRepository bookingRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public void insertUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
