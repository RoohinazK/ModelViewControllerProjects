package com.mindtree.vehicleregistration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class Vehicle {

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vehicleId, String vehicleName, String vehicleCode, String vehicleState, String vehicleCountry,
			User user) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.vehicleCode = vehicleCode;
		this.vehicleState = vehicleState;
		this.vehicleCountry = vehicleCountry;
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicleId;

	@Column
	private String vehicleName;

	@Column
	private String vehicleCode;

	@Column
	private String vehicleState;

	@Column
	private String vehicleCountry;

	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleCode() {
		return vehicleCode;
	}

	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

	public String getVehicleState() {
		return vehicleState;
	}

	public void setVehicleState(String vehicleState) {
		this.vehicleState = vehicleState;
	}

	public String getVehicleCountry() {
		return vehicleCountry;
	}

	public void setVehicleCountry(String vehicleCountry) {
		this.vehicleCountry = vehicleCountry;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}