package com.greatlearning.Hr;

import com.greatlearning.department.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	public String Departname() {
		String Departmentname="HrDepartment";
		return Departmentname;
	}
	public String getTodaysWork() {
		String getTodaysWork="Fill today's timesheet and mark your attendance";
		return getTodaysWork;
	}
	public String getWorkDeadline() {
		String getWorkDeadline="Complete by EOD";
		return getWorkDeadline;
	}
	public String doActivity() {
		String doActivity="Team Lunch";
		return doActivity;
			
	}

}
