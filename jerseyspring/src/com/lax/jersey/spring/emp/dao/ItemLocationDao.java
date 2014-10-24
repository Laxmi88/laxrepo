/**
 * 
 */
package com.lax.jersey.spring.emp.dao;

import java.util.List;

import com.lax.jersey.spring.emp.dao.action.GetItemLocationDetailsAction;
import com.lax.jersey.spring.emp.model.ItemLocation;

/**
 * @author Lax
 *
 */
public class ItemLocationDao {
	
	public List<ItemLocation> getItemLocDetails(
			List<Integer> itemNbrs,
			List<Integer> locNbrs){
		GetItemLocationDetailsAction dbActionObj = new GetItemLocationDetailsAction();
		return dbActionObj.execute(itemNbrs,locNbrs);
	}

}
