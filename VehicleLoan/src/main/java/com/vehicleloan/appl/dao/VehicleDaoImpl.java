package com.vehicleloan.appl.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.vehicleloan.appl.beans.Customer;
import com.vehicleloan.appl.beans.Vehicle;

@Repository("vehicleDao")
public class VehicleDaoImpl implements VehicleDao
{
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public boolean addVehicle(Vehicle vehicle) 
	{
		em.persist(vehicle);
		return true;
	}

}
