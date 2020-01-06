package com.mindtree.travelbooking.service.serviceimpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.travelbooking.entity.Booking;
import com.mindtree.travelbooking.entity.User;
import com.mindtree.travelbooking.repository.BookingRepository;
import com.mindtree.travelbooking.repository.UserRepository;
import com.mindtree.travelbooking.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepository bookingRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public void insertBooking(Booking booking, int userId) {
		int price = booking.getDistance() * 10;
		User user = userRepository.findById(userId).get();
		if (user.getAge() > 30 && user.getAge() < 50) {
			price = (int) (price - price * (0.05));
		} else if (user.getAge() > 50) {
			price = (int) (price - price * (0.01));
		}
		booking.setPrice(price);
		List<Booking> bookings = user.getBookings();
		bookings.add(booking);
		user.setBookings(bookings);
		bookingRepository.save(booking);
		userRepository.save(user);
	}

	@Override
	public List<Booking> getBookings(int userId, Date fromDate) {
		User user = userRepository.findById(userId).get();
		List<Booking> bookings1 = new ArrayList<Booking>();
		List<Booking> bookings = user.getBookings();
		for (Booking booking : bookings) {
			if (booking.getDoj().after(fromDate) || booking.getDoj().equals(fromDate)) {
				bookings1.add(booking);
			}
		}
		return bookings1;
	}

	@Override
	public Booking getBookings(int bookingId) {
		return bookingRepository.findById(bookingId).get();
	}

	@Override
	public void update1(String fromPlace, String toPlace, int distance, int bookingId1, int userId1) {
		Booking booking = bookingRepository.findById(bookingId1).get();
		booking.setDistance(distance);
		booking.setToPlace(toPlace);
		int price = booking.getDistance() * 10;
		User user = userRepository.findById(userId1).get();
		if (user.getAge() > 30 && user.getAge() < 50) {
			price = (int) (price - price * (0.05));
		} else if (user.getAge() > 50) {
			price = (int) (price - price * (0.01));
		}
		booking.setPrice(price);
		bookingRepository.save(booking);
	}

}
