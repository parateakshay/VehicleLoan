package com.vehicleloan.appl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleloan.appl.beans.Vehicle;
import com.vehicleloan.appl.dao.VehicleDao;

@Service("VehicleService")
public class VehicleServiceImpl implements VehicleService
{
	@Autowired()
	private VehicleDao vehicleDao;
	

	
	public VehicleDao getVehicleDao() {
		return vehicleDao;
	}



	public void setVehicleDao(VehicleDao vehicleDao) {
		this.vehicleDao = vehicleDao;
	}



	public String addVehicle(Vehicle vehicle) 
	{
		boolean flag = vehicleDao.addVehicle(vehicle);
		if(flag)
		{
			return "succesfull";
			
		}
		else
		{
			return "try again";
			
		}
		
	}

}
