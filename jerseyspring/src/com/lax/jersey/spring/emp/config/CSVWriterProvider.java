/**
 * 
 */
package com.lax.jersey.spring.emp.config;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.lax.jersey.spring.emp.constants.JRestfulConstants;
import com.lax.jersey.spring.emp.model.ItemLocation;

/**
 * @author Lax
 *
 */
@Produces(JRestfulConstants.MIME_TYPE_CSV)
@Provider
public class CSVWriterProvider implements MessageBodyWriter<List<ItemLocation>>{

	@Override
	public long getSize(List<ItemLocation> arg0, Class<?> arg1, Type arg2,
			Annotation[] arg3, MediaType arg4) {
		return -1;
	}

	@Override
	public boolean isWriteable(Class<?> arg0, Type arg1, Annotation[] arg2,
			MediaType arg3) {
		return true;
	}

	@Override
	public void writeTo(List<ItemLocation> itemLocationBeanList, Class<?> arg1, Type arg2,
			Annotation[] arg3, MediaType arg4,
			MultivaluedMap<String, Object> arg5, OutputStream outputStream)
			throws IOException, WebApplicationException {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Item Number,Location Number,Price");
		sb.append("\n");
		
		for (ItemLocation itemLocationBean : itemLocationBeanList) {
			sb.append(itemLocationBean.getItemNbr());
			sb.append(JRestfulConstants.COMMA_DELIMITER);
			sb.append(itemLocationBean.getLocationNbr());
			sb.append(JRestfulConstants.COMMA_DELIMITER);
			sb.append(itemLocationBean.getPrice());
			sb.append("\n");
		}
		
		outputStream.write(sb.toString().getBytes());		
	}

}
