/**
 * 
 */
package com.lax.jersey.spring.emp.provider;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.lax.jersey.spring.emp.model.ItemLocation;

/**
 * @author Lax
 *
 */
@Produces(MediaType.TEXT_HTML)
@Provider
public class HtmlWriterProvider implements MessageBodyWriter<ItemLocation> {

	@Override
	public long getSize(ItemLocation arg0, Class<?> arg1, Type arg2,
			Annotation[] arg3, MediaType arg4) {
		return -1;
	}

	@Override
	public boolean isWriteable(Class<?> arg0, Type arg1, Annotation[] arg2,
			MediaType arg3) {
		return true;
	}

	@Override
	public void writeTo(ItemLocation itemLocObj, Class<?> arg1, Type arg2,
			Annotation[] arg3, MediaType arg4,
			MultivaluedMap<String, Object> arg5, OutputStream outputStream)
			throws IOException, WebApplicationException {
		 String result = "<html>\n" + "<body>\n" + "<table border=\"1\">\n"
         + "<tr>\n" + "<td> Item Number </td>\n" + "<td>"
         + itemLocObj.getItemNbr() + "</td>\n" + "</tr><tr>\n"
         + "<td> Location Number </td>\n" + "<td>" + itemLocObj.getLocationNbr()
         + "</td>\n" + "</tr><tr>\n" + "<td> Price </td>\n" + "<td>"
         + itemLocObj.getPrice() + "</td>\n" + "</tr>\n" + "</table>\n"
         + "</body>\n" + "</html>";

		 outputStream.write(result.getBytes());		
	}

}
