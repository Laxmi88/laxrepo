/**
 * 
 */
package com.lax.jersey.spring.retek.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lax.jersey.spring.retek.business.manager.ItemLocationBusinessManager;
import com.lax.jersey.spring.retek.constants.JRestfulConstants;
import com.lax.jersey.spring.retek.model.ItemLocation;

/**
 * @author Lax
 *
 */
@Component
@Path(JRestfulConstants.ITEMLOC_RESTFUL_URI)
public class ItemLocationService {
	
	@Autowired
	ItemLocationBusinessManager itemLocationBusinessManager;
	
	@GET
	@Path("/itemLocDetails")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.TEXT_HTML,MediaType.TEXT_PLAIN,"application/csv"})
	public List<ItemLocation> getItemLocDetails(
			@QueryParam("itemNbr") List<Integer> itemNbrs,
			@QueryParam("locNbr")  List<Integer> locNbrs){
		try{
			return itemLocationBusinessManager.getItemLocDetails(itemNbrs,locNbrs);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
