/**
 * 
 */
package com.lax.jersey.restful.emp.business.manager;

import com.lax.jersey.restful.emp.dao.EmployeeDao;
import com.lax.jersey.restful.emp.model.Employee;

/**
 * @author xssim
 *
 */
public class EmployeeBusinessManager {
	
	public Employee getEmployeeDetails(){
		return new EmployeeDao().getEmployeeDetails();
	}

}
