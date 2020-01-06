package com.mindtree.travelbooking.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.travelbooking.entity.Booking;
import com.mindtree.travelbooking.entity.User;
import com.mindtree.travelbooking.service.BookingService;
import com.mindtree.travelbooking.service.UserService;

@Controller
public class TravelBookingController {

	@Autowired
	private UserService userService;

	@Autowired
	private BookingService bookingService;

	int bookingId1 = 0;
	int userId1 = 0;

	@RequestMapping("/")
	public String first() {
		return "first";
	}

	@RequestMapping("/userregistration")
	public String registerUser() {
		return "registerUser";
	}

	@PostMapping("/insertuser")
	public String insertUser(User user) {
		userService.insertUser(user);
		return "first";
	}

	@RequestMapping("/booking")
	public String booking(Model model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "booking";
	}

	@PostMapping("/insertbooking")
	public String insertBooking(Booking booking, @RequestParam int userId) {
		bookingService.insertBooking(booking, userId);
		return "first";
	}

	@RequestMapping("/display")
	public String display(Model model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "display";
	}

	@PostMapping("/getbookings")
	public String getBookings(int userId, Date fromDate, Model model) {
		userId1 = userId;
		List<Booking> bookings = bookingService.getBookings(userId, fromDate);
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		model.addAttribute("bookings", bookings);
		return "display";
	}

	@PostMapping("/update")
	public String update(Model model, int bookingId) {
		bookingId1 = bookingId;
		Booking booking = bookingService.getBookings(bookingId);
		model.addAttribute("booking", booking);
		return "update";
	}

	@PostMapping("/update1")
	public String update1(String fromPlace, String toPlace, int distance,Model model) {
		bookingService.update1(fromPlace, toPlace, distance, bookingId1, userId1);
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "first";
	}

}