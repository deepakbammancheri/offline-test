package com.apisel.qa.api.common;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.apisel.qa.api.mapper.SpaceXGet;

/**
 * Json mapper utility class
 *
 */
public class JsonMapperUtil {
	
	SpaceXGet spaceX;
	
	ObjectMapper mapper = new ObjectMapper();

	/**
	 * Method to map the Json output
	 * @param jsonString
	 * @return
	 */
	public SpaceXGet mappJson(String jsonString) {		
		try {
			spaceX = mapper.readValue(jsonString, SpaceXGet.class);
			System.out.println(spaceX);
			jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(spaceX);
			System.out.println(jsonString);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return spaceX;
	}

}
