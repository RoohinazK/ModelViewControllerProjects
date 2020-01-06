package com.mindtree.travelbooking.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;

	@Column
	private String fromPlace;

	@Column
	private String toPlace;

	@Column
	private Date doj;

	@Column
	private int distance;

	@Column
	private String foodPreference;

	@Column
	private int price;

	@Column
	private String travelWith;

	public Booking(int bookingId, String fromPlace, String toPlace, Date doj, int distance, String foodPreference,
			int price, String travelWith) {
		super();
		this.bookingId = bookingId;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.doj = doj;
		this.distance = distance;
		this.foodPreference = foodPreference;
		this.price = price;
		this.travelWith = travelWith;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getFoodPreference() {
		return foodPreference;
	}

	public void setFoodPreference(String foodPreference) {
		this.foodPreference = foodPreference;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTravelWith() {
		return travelWith;
	}

	public void setTravelWith(String travelWith) {
		this.travelWith = travelWith;
	}
}