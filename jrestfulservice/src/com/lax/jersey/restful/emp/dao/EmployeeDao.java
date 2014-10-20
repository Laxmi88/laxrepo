/**
 * 
 */
package com.lax.jersey.restful.emp.dao;

import com.lax.jersey.restful.emp.dao.action.GetEmployeeDetailsAction;
import com.lax.jersey.restful.emp.model.Employee;

/**
 * @author xssim
 *
 */
public class EmployeeDao {

	public Employee getEmployeeDetails(){
		return new GetEmployeeDetailsAction().getEmployeeDetails();
	}
}
