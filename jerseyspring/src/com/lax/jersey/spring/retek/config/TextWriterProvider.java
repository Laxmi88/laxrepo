/**
 * 
 */
package com.lax.jersey.spring.retek.config;

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

import com.lax.jersey.spring.retek.model.ItemLocation;

/**
 * @author Lax
 *
 */
@Produces(MediaType.TEXT_PLAIN)
@Provider
public class TextWriterProvider implements MessageBodyWriter<List<ItemLocation>>{

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
		
		for (ItemLocation itemLocationBean : itemLocationBeanList) {
			sb.append(itemLocationBean.toString());
			sb.append("\n");
		}
		
		outputStream.write(sb.toString().getBytes());		
	}

}
