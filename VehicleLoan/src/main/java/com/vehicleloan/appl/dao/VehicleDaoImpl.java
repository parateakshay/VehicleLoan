package com.vehicleloan.appl.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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

	
	public Vehicle getVehicleDetailsByCustomerId(int customerId) 
	{
		TypedQuery<Vehicle> query = em.createQuery("select v from Vehicle v where v.customerId = "+customerId,Vehicle.class);
		Vehicle vehicle = query.getSingleResult();
		System.out.println(vehicle);
		return vehicle;
	}

}
