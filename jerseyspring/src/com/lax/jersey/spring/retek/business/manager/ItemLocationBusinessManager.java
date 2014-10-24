/**
 * 
 */
package com.lax.jersey.spring.retek.business.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lax.jersey.spring.retek.dao.ItemLocationDao;
import com.lax.jersey.spring.retek.model.ItemLocation;

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
