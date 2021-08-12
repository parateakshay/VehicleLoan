package com.vehicleloan.appl.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "vehicle")
public class Vehicle 
{
	@Column(name = "customer_id")
	private int customerId;
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "HB_VEHICLE_SEQ")
	@SequenceGenerator(name = "HB_VEHICLE_SEQ",sequenceName = "vehid_seq",allocationSize=1)
	@Column(name = "vehicle_id")
	@Id
	private int vehicleId;
	@Column(name = "vehicle_make")
	private String vehicleMaker;
	@Column(name = "vehicle_model")
	private String vehicleModel;
	@Column(name = "vehicle_onrdprice")
	private int vehiclePrice;
	@Column(name = "vehicle_exprice")
	private int vehicleExShowroomPrice;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CUSTOMER_ID")
//	private Customer customer;
//	public Customer getCustomer() {
//		return customer;
//	}
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleMaker() {
		return vehicleMaker;
	}
	public void setVehicleMaker(String vehicleMaker) {
		this.vehicleMaker = vehicleMaker;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public int getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(int vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public int getVehicleExShowroomPrice() {
		return vehicleExShowroomPrice;
	}
	public void setVehicleExShowroomPrice(int vehicleExShowroomPrice) {
		this.vehicleExShowroomPrice = vehicleExShowroomPrice;
	}
	@Override
	public String toString() {
		return "Vehicle [customerId=" + customerId + ", vehicleId=" + vehicleId + ", vehicleMaker=" + vehicleMaker
				+ ", vehicleModel=" + vehicleModel + ", vehiclePrice=" + vehiclePrice + ", vehicleExShowroomPrice="
				+ vehicleExShowroomPrice + "]";
	}
	

}
