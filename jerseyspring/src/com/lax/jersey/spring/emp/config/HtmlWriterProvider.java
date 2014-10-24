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

import com.lax.jersey.spring.emp.model.ItemLocation;

/**
 * @author Lax
 *
 */
@Produces(MediaType.TEXT_HTML)
@Provider
public class HtmlWriterProvider implements MessageBodyWriter<List<ItemLocation>> {

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
		sb.append("<html>\n" + "<body>\n" + "<table border=\"1\">\n");
		sb.append("<tr>\n");
		sb.append("<thead>\n");
		sb.append("<th> Item Number </th> <th> Location Number </th> <th> Price </th>");
		sb.append("</thead>\n");
		sb.append("<tbody>\n");
		sb.append("</tr>\n");
		
		for (ItemLocation itemLocationBean : itemLocationBeanList) {
			sb.append("<tr>\n");
			sb.append("<td>");
			sb.append(itemLocationBean.getItemNbr());
			sb.append("</td>");
			sb.append("<td>");
			sb.append(itemLocationBean.getLocationNbr());
			sb.append("</td>");
			sb.append("<td>");
			sb.append(itemLocationBean.getPrice());
			sb.append("</td>");
			sb.append("</tr>\n");
		}
		
		sb.append("</tbody>\n");
		sb.append("</table>");
		sb.append("</html>");
		
		outputStream.write(sb.toString().getBytes());		
	}

}
