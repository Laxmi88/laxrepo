/**
 * 
 */
package com.lax.jersey.spring.retek.dao;

import java.util.List;

import com.lax.jersey.spring.retek.dao.action.GetItemLocationDetailsAction;
import com.lax.jersey.spring.retek.model.ItemLocation;

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
