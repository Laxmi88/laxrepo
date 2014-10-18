/**
 * 
 */
package com.lax.jersey.restful.emp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Lax
 *
 */
@XmlRootElement
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer employeeId;
	private int employeeAge;
	private String employeeName;
	private String employeeAdress;
	
	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeAge
	 */
	public int getEmployeeAge() {
		return employeeAge;
	}
	/**
	 * @param employeeAge the employeeAge to set
	 */
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the employeeAdress
	 */
	public String getEmployeeAdress() {
		return employeeAdress;
	}
	/**
	 * @param employeeAdress the employeeAdress to set
	 */
	public void setEmployeeAdress(String employeeAdress) {
		this.employeeAdress = employeeAdress;
	}

}
