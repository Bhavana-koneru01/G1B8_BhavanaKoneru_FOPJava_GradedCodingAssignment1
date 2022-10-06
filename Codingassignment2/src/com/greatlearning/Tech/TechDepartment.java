package com.greatlearning.Tech;

import com.greatlearning.department.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	public String Departname() {
		String Departname="TechDepartment";
		return Departname;
	}
	public String getTodaysWork() {
		String getTodaysWork="Complete coding of module 1";
		return getTodaysWork;
	}
	public String getWorkDeadline() {
		String getWorkDeadline="Complete by EOD";
		return getWorkDeadline;
	}
	public String getTechStackInformation() {
		String getTechStackInformation="Core Java";
		return getTechStackInformation;
    }
	
}
