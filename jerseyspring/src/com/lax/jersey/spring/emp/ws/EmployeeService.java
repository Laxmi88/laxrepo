/**
 * 
 */
package com.lax.jersey.spring.emp.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lax.jersey.spring.emp.business.manager.EmployeeBusinessManager;
import com.lax.jersey.spring.emp.constants.JRestfulConstants;
import com.lax.jersey.spring.emp.model.Employee;

/**
 * @author Lax
 *
 */
@Component
@Path(JRestfulConstants.EMPLOYEE_RESTFUL_URI)
public class EmployeeService {
	
	@Autowired
	EmployeeBusinessManager employeeBusinessManager;
	
	@GET
	@Path("/employeeId/{empId}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Employee getEmployeeDetails(@PathParam("empId") Integer employeeId){
		return employeeBusinessManager.getEmployeeDetails();
	}
}
