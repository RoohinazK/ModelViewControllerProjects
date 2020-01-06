package com.mindtree.vehicleregistration.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.vehicleregistration.entity.User;
import com.mindtree.vehicleregistration.entity.Vehicle;
import com.mindtree.vehicleregistration.repository.UserRepository;
import com.mindtree.vehicleregistration.repository.VehicleRepository;
import com.mindtree.vehicleregistration.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public void saveVehicleDetails(int userId, Vehicle vehicle) {

		User user = userRepository.getOne(userId);
		vehicle.setUser(user);
		String vehicleName = vehicle.getVehicleName();
		char name = vehicleName.charAt(0);
		String vehicleState = vehicle.getVehicleState();
		char state = vehicleState.charAt(0);
		char state1 = vehicleState.charAt(1);
		String vehicleCountry = vehicle.getVehicleCountry();
		char country = vehicleCountry.charAt(0);
		String vehicleCode = " ";
		StringBuilder string = new StringBuilder();
		string.append(name);
		string.append(state);
		string.append(state1);
		string.append(country);
		vehicleCode = string.toString();
		vehicle.setVehicleCode(vehicleCode);
		vehicleRepository.save(vehicle);
	}
}