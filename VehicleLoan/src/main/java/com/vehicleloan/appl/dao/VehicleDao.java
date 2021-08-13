package com.vehicleloan.appl.dao;

import com.vehicleloan.appl.beans.Vehicle;

public interface VehicleDao 
{
	public boolean addVehicle(Vehicle vehicle);
	public Vehicle getVehicleDetailsByCustomerId(int customerId);
}
