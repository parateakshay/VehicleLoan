package com.vehicleloan.appl.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleloan.appl.beans.Vehicle;
import com.vehicleloan.appl.service.VehicleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/vehicleloan")
public class VehicleController 
{
	@Autowired()
	private VehicleService vehicleService;
	
	@PostMapping(path="/addVehicle",produces="application/json")
	public void addVehicle(@RequestBody Vehicle vehicle)
	{
		String msg = vehicleService.addVehicle(vehicle);
		System.out.println(msg);
	}
	
	@GetMapping(path = "/get-vehicle/{customerId}",produces="application/json")
	public Vehicle getEligibility(@PathVariable(value="customerId") int customerId)
	{
		return vehicleService.getVehicleDetailsByCustomerId(customerId);
	}

}
