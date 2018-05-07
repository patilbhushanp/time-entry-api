package com.sanbhu.api.utility;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.Base64Utils;

public class ApplicationUtility {

	public static final String getBasicAuthorizationValue(final String username, final String password) {
		return Base64Utils.encodeToString((username + ":" + password).getBytes());
	}
	
	public static final Map<String, String> createHeaderParametersMap(String headerString) {
		Map<String, String> headerParametersMap = new ConcurrentHashMap<String, String>();
		String[] headerArray = headerString.split(";");
		for(String header : headerArray) {
			String headerKey = header.substring(0, header.indexOf(":")).trim();
			String headerValue = header.substring(header.indexOf(":") + 1).trim();
			headerParametersMap.put(headerKey, headerValue);
		}
		return headerParametersMap;
	}
}
