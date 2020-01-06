package com.mindtree.vehicleregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.vehicleregistration.entity.User;
import com.mindtree.vehicleregistration.entity.Vehicle;
import com.mindtree.vehicleregistration.service.UserService;
import com.mindtree.vehicleregistration.service.VehicleService;

@Controller
public class UserVehicleController {

	@Autowired
	private UserService userService;

	@Autowired
	private VehicleService vehicleService;

	@RequestMapping("/")
	public String first() {
		return "menu";
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/save")
	public String saveDetails(User user) {
		userService.saveDetails(user);
		return "menu";
	}

	@RequestMapping("/add")
	public String add(Model model) {
		List<User> usersList = userService.getAllUsers();
		model.addAttribute("usersList", usersList);
		return "add";
	}

	@PostMapping("/vehicle")
	public String saveVehicleDetails(int userId, Vehicle vehicle) {
		vehicleService.saveVehicleDetails(userId, vehicle);
		return "menu";
	}

	@RequestMapping("/view")
	public String view(Model model) {
		List<User> userList = userService.getAllUsers();
		model.addAttribute("userList", userList);
		return "view";
	}

}