package com.greatlearning.driver;

//importing all the departments

import com.greatlearning.department.SuperDepartment; 
import com.greatlearning.Hr.HrDepartment;
import com.greatlearning.Admin.AdminDepartment;
import com.greatlearning.Tech.TechDepartment;

public class Driverclass {

	public static void main(String[] args) {
		//Declaring Objects
		SuperDepartment sd=new SuperDepartment(); //constructor
		AdminDepartment ad=new AdminDepartment();
		HrDepartment hd=new HrDepartment();
		TechDepartment td=new TechDepartment();
		//outputs
		System.out.println("Welcome to "+ad.Departname());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.IsTodayAHoliday() +"\n\n");
		System.out.println("Welcome to "+hd.Departname());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.doActivity());
		System.out.println(hd.IsTodayAHoliday() +"\n\n");
		System.out.println("Welcome to "+td.Departname());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.IsTodayAHoliday() +"\n\n");
					
	}

}
