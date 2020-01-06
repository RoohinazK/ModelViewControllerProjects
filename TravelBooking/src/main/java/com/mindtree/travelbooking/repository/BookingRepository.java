package com.mindtree.travelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.travelbooking.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
