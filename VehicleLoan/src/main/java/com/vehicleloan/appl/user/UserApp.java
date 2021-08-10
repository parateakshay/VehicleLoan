package com.vehicleloan.appl.user;


import java.util.List;
import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vehicleloan.appl.beans.Customer;
import com.vehicleloan.appl.service.CustomerService;
import com.vehicleloan.appl.service.LoginService;

public class UserApp 
{
	public static void main(String[] args) throws Exception
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Config.xml");
		LoginService Loginservice = ctx.getBean("Login_Service",LoginService.class);
		CustomerService customerService = ctx.getBean("Customer_Service",CustomerService.class);
		
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
				System.out.println("Enter name");
				cp.setCustomerName(sc.next());
				System.out.println("Enter email");
				cp.setCustomerEmail(sc.next());
				System.out.println("Enter password");
				cp.setCustomerPassword(sc.next());
				System.out.println("Enter phone number");
				cp.setCustomerPhone(sc.nextLong());
				System.out.println("Enter DOB");
				cp.setDOB(sc.next());
				System.out.println("Enter address");
				cp.setAddress(sc.next());
				 msg = customerService.registerCustomer(cp);
				System.out.println(msg);
				break;
			case 2:
				System.out.println("Enter email");
				 email = sc.next();
				System.out.println("Enter password");
				 password = sc.next();
				 msg = Loginservice.loginCustomer(email, password);
				System.out.println(msg);
				break;
			case 3:
				System.out.println("Enter Email");
				email = sc.next();
				System.out.println("Enter old password");
				password = sc.next();
				System.out.println("Enter new password");
				msg = Loginservice.changePassword(email, password, sc.next());
				break;
			case 4:
				System.out.println("showing customer");
				List<Customer> customerList = Loginservice.sendCustomerCredentials();
				for(Customer c:customerList)
				{
					System.out.println(c);
					
				}
				break;
			case 5:
				System.out.println("enter email");
				Customer c = Loginservice.getCustomerByEmail(sc.next());
				System.out.println(c);
				break;
			default:
				System.out.println("Enter correct choice");
				break;
			}
			
		}
		
		
	}

}
