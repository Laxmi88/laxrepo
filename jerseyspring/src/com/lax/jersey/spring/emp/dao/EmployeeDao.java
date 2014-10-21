/**
 * 
 */
package com.lax.jersey.spring.emp.dao;

import com.lax.jersey.spring.emp.dao.action.GetEmployeeDetailsAction;
import com.lax.jersey.spring.emp.model.Employee;

/**
 * @author xssim
 *
 */
public class EmployeeDao {

	public Employee getEmployeeDetails(){
		return new GetEmployeeDetailsAction().getEmployeeDetails();
	}
}
