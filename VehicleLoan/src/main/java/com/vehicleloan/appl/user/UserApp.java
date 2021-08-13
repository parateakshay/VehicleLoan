package com.vehicleloan.appl.user;


import java.util.List;
import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vehicleloan.appl.beans.CheckEligibility;
import com.vehicleloan.appl.beans.Customer;
import com.vehicleloan.appl.beans.Vehicle;
import com.vehicleloan.appl.service.CheckEligibilitySerivce;
import com.vehicleloan.appl.service.CustomerService;
import com.vehicleloan.appl.service.LoginService;
import com.vehicleloan.appl.service.VehicleService;

public class UserApp 
{
	public static void main(String[] args) throws Exception
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Config.xml");
		LoginService Loginservice = ctx.getBean("Login_Service",LoginService.class);
		CustomerService customerService = ctx.getBean("Customer_Service",CustomerService.class);
		VehicleService vehicleService = ctx.getBean("VehicleService",VehicleService.class);
		CheckEligibilitySerivce checkEligibilitySerivce = ctx.getBean("checkEligibilityService",CheckEligibilitySerivce.class);
		
		Customer cp = new Customer();
		String msg ="";
		String email = "";
		String password = "";
		Scanner sc = new Scanner(System.in);
		
		
		
		
		while(true)
		{
			System.out.println("Enter your choice:\n1)Register customer\n2)Login customer\n3)Change Password\n4)show customer\n");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				Customer cp1 = new Customer();
				System.out.println("Enter name");
				cp1.setCustomerName(sc.next());
				System.out.println("Enter email");
				cp1.setCustomerEmail(sc.next());
				System.out.println("Enter password");
				cp1.setCustomerPassword(sc.next());
				System.out.println("Enter phone number");
				cp1.setCustomerPhone(sc.nextLong());
				System.out.println("Enter DOB");
				cp1.setDOB(sc.next());
				System.out.println("Enter address");
				cp1.setAddress(sc.next());
				 msg = customerService.registerCustomer(cp1);
				System.out.println(msg);
				break;
			case 2:
//				System.out.println("Enter email");
//				 email = sc.next();
//				System.out.println("Enter password");
//				 password = sc.next();
//				 msg = Loginservice.loginCustomer(email, password);
//				System.out.println(msg);
				break;
			case 3:
//				System.out.println("Enter Email");
//				email = sc.next();
//				System.out.println("Enter old password");
//				password = sc.next();
//				System.out.println("Enter new password");
//				msg = Loginservice.changePassword(email, password, sc.next());
				break;
			case 4:
//				System.out.println("showing customer");
//				List<Customer> customerList = Loginservice.sendCustomerCredentials();
//				for(Customer c:customerList)
//				{
//					System.out.println(c);
//					
//				}
				break;
			case 5:
				System.out.println("enter email");
				Customer c = Loginservice.getCustomerByEmail(sc.next());
				System.out.println(c);
				break;
			case 6:
//				Vehicle vehicle = new Vehicle();
//				System.out.println("Enter customer id");
//				vehicle.setCustomerId(sc.nextInt());
//				System.out.println("Enter vehicle maker");
//				vehicle.setVehicleMaker(sc.next());
//				System.out.println("Enter vehicle model");
//				vehicle.setVehicleModel(sc.next());
//				System.out.println("Enter ex show room price");
//				vehicle.setVehicleExShowroomPrice(sc.nextInt());
//				System.out.println("Enter on road price");
//				vehicle.setVehiclePrice(sc.nextInt());
//				vehicleService.addVehicle(vehicle);
				
				Vehicle vehicle = new Vehicle();
				System.out.println("Enter customer id");
				vehicle.setCustomerId(1000);
				System.out.println("Enter vehicle maker");
				vehicle.setVehicleMaker("honda");
				System.out.println("Enter vehicle model");
				vehicle.setVehicleModel("city");
				System.out.println("Enter ex show room price");
				vehicle.setVehicleExShowroomPrice(1000000);
				System.out.println("Enter on road price");
				vehicle.setVehiclePrice(1200000);
				vehicleService.addVehicle(vehicle);
				break;
			case 7:
//				Customer c1 = new Customer();
//				CheckEligibility check = new CheckEligibility(c1,"salaried",500000,"no","","","","");
//				Customer c1 = new Customer();
				System.out.println("Enter customer id");
				int tempCustomerId = sc.nextInt();
				CheckEligibility check = new CheckEligibility();
				System.out.println("Enter type of employment");
				check.setCustomerEmployment("salaried");
				System.out.println("Existing emi yes/no");
				check.setExistingEmi("no");
				System.out.println("yearly salary");
				check.setAnnualSalary(0);
//				System.out.println(checkEligibilitySerivce.addCustomerDetails(check,tempCustomerId));
				break;
			case 8:
				CheckEligibility check1 = checkEligibilitySerivce.getEligibilityDetailsByCustomerId(1003);
				System.out.println(check1);
			default:
				System.out.println("Enter correct choice");
				break;
			}
			
			
		}
		
		
	}

}
