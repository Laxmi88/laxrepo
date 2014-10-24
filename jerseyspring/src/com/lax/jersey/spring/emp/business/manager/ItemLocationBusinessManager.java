/**
 * 
 */
package com.lax.jersey.spring.emp.business.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lax.jersey.spring.emp.dao.ItemLocationDao;
import com.lax.jersey.spring.emp.model.ItemLocation;

/**
 * @author Lax
 *
 */
public class ItemLocationBusinessManager {

	@Autowired
	ItemLocationDao itemLocationDao;
	
	public List<ItemLocation> getItemLocDetails(
			List<Integer> itemNbrs,
			List<Integer> locNbrs){
		return itemLocationDao.getItemLocDetails(itemNbrs,locNbrs);
	}
}
