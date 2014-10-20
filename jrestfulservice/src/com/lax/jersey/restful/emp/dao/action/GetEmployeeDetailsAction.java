/**
 * 
 */
package com.lax.jersey.restful.emp.dao.action;

import com.lax.jersey.restful.emp.model.Employee;

/**
 * @author xssim
 *
 */
public class GetEmployeeDetailsAction {

	public Employee getEmployeeDetails(){
		Employee emp = new Employee();
		emp.setEmployeeId(1145);
		emp.setEmployeeName("aus");
		emp.setEmployeeAge(30);
		emp.setEmployeeAdress("Aus");
		return emp;
	}
}
