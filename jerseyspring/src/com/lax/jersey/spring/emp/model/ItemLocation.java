/**
 * 
 */
package com.lax.jersey.spring.emp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Lax
 *
 */
@XmlRootElement(name="ItemLocation")
@XmlType(propOrder={"itemNbr","locationNbr","price"})
public class ItemLocation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer itemNbr;
	private Integer locationNbr;
	private double price;
	
	/**
	 * @return the itemNbr
	 */
	public Integer getItemNbr() {
		return itemNbr;
	}
	/**
	 * @param itemNbr the itemNbr to set
	 */
	public void setItemNbr(Integer itemNbr) {
		this.itemNbr = itemNbr;
	}
	/**
	 * @return the locationNbr
	 */
	public Integer getLocationNbr() {
		return locationNbr;
	}
	/**
	 * @param locationNbr the locationNbr to set
	 */
	public void setLocationNbr(Integer locationNbr) {
		this.locationNbr = locationNbr;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		sb.append(" ItemNbr: ");
		sb.append(this.itemNbr);
		sb.append(" LocationNbr: ");
		sb.append(this.locationNbr);
		sb.append(" Price: ");
		sb.append(this.price);
		sb.append("\n");
		
		return sb.toString();
	}
	

}
