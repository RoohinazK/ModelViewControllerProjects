package com.mindtree.vehicleregistration.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@Column
	private String userName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Vehicle> vehicles;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, List<Vehicle> vehicles) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.vehicles = vehicles;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

}
