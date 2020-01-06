package com.mindtree.travelbooking.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.travelbooking.entity.Booking;

@Service
public interface BookingService {

	public void insertBooking(Booking booking, int userId);

	public List<Booking> getBookings(int userId, Date fromDate);

	public Booking getBookings(int bookingId);

	public void update1(String fromPlace, String toPlace, int distance, int userId1,int bookingId1);

}
