/**
 * 
 */
package com.lax.jersey.spring.emp.business.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lax.jersey.spring.emp.dao.EmployeeDao;
import com.lax.jersey.spring.emp.model.Employee;

/**
 * @author xssim
 *
 */
@Component
public class EmployeeBusinessManager {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public Employee getEmployeeDetails(){
		return employeeDao.getEmployeeDetails();
	}

}
