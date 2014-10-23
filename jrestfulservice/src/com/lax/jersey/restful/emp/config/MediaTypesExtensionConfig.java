/**
 * 
 */
package com.lax.jersey.restful.emp.config;

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
		return mediaTypeMap;
	}

}
