/**
 * 
 */
package com.lax.jersey.restful.emp.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lax.jersey.restful.emp.business.manager.EmployeeBusinessManager;
import com.lax.jersey.restful.emp.constants.JRestfulConstants;
import com.lax.jersey.restful.emp.model.Employee;

/**
 * @author Lax
 *
 */
@Path(JRestfulConstants.EMPLOYEE_RESTFUL_URI)
public class EmployeeService {
	
	@GET
	@Path("/employeeId/{empId}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Employee getEmployeeDetails(@PathParam("empId") Integer employeeId){
		return new EmployeeBusinessManager().getEmployeeDetails();
	}
}
