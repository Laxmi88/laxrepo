/**
 * 
 */
package com.lax.jersey.spring.retek.config;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.core.PackagesResourceConfig;

/**
 * @author xssim
 *
 */
public class MediaTypesExtensionConfig extends PackagesResourceConfig {
	
	public MediaTypesExtensionConfig(Map<String, Object> props){
		super(props);
	}
	
	@Override
	public Map<String, MediaType> getMediaTypeMappings(){
		Map<String, MediaType> mediaTypeMap = new HashMap<String, MediaType>();
		mediaTypeMap.put("json", MediaType.APPLICATION_JSON_TYPE);
		mediaTypeMap.put("xml", MediaType.APPLICATION_XML_TYPE);
		mediaTypeMap.put("csv", MediaType.valueOf("application/csv"));
		mediaTypeMap.put("txt", MediaType.TEXT_PLAIN_TYPE);
		mediaTypeMap.put("html", MediaType.TEXT_HTML_TYPE);
		return mediaTypeMap;
	}

}
