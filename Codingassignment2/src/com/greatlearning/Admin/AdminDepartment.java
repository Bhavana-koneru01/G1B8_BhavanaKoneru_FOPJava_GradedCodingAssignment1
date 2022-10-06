package com.greatlearning.Admin;

import com.greatlearning.department.SuperDepartment;

public class AdminDepartment extends SuperDepartment{
	public String Departname() {
		String Departname="AdminDepartment";
		return Departname;
	}
	public String getTodaysWork() {
		String getTodaysWork="Complete your Document Submission";
		return getTodaysWork;
	}
	public String getWorkDeadline() {
		String getWorkDeadline="Complete by EOD";
		return getWorkDeadline;
			
	}

}

