package com.lax.jersey.spring.emp.dao.action;

import java.util.ArrayList;
import java.util.List;

import com.lax.jersey.spring.emp.model.ItemLocation;

public class GetItemLocationDetailsAction {
	public List<ItemLocation> execute(
			List<Integer> itemNbrs,
			List<Integer> locNbrs){
		List<ItemLocation> itemLocObjList = new ArrayList<ItemLocation>();
		
		for (Integer locNbr : locNbrs) {
			for (Integer itemNbr : itemNbrs) {
				ItemLocation itemLocObj = new ItemLocation();
				itemLocObj.setItemNbr(itemNbr);
				itemLocObj.setLocationNbr(locNbr);
				itemLocObj.setPrice(45.00);
				itemLocObjList.add(itemLocObj);
			}
		}
		
		return itemLocObjList;
	}

}
