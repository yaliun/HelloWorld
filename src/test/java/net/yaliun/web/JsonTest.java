package net.yaliun.web;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.yaliun.vo.User;

public class JsonTest {

	@Test
	public void jsonTest_1() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("-------------------JSON String 을 MAP 으로 변환-----------------------");
		ObjectMapper mapper = new ObjectMapper();
		String json = "{ \"name\" : \"mkgil\" , \"age\" : 25 }";

		Map<String, Object> map = new HashMap<String, Object>();
		map = mapper.readValue(json, new TypeReference<Map<String, String>>() {
		});

		System.out.println(map);
		System.out.println(map.get("name"));
	}

	@Test
	public void jsonTest_2() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			String json = "{\"name\":\"mkyong\", \"age\":29, \"messages\" : [\"msg 1\",\"msg 2\",\"msg 3\"] }";

			Map<Object, Object> map = new HashMap<Object, Object>();

			// convert JSON string to Map
			map = mapper.readValue(json, new TypeReference<Map<Object, Object>>() {
			});
			System.out.println(map);

			ArrayList aL = (ArrayList) map.get("messages");
			System.out.println(aL.get(2));

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void jsonTest_3(){
		try {
			System.out.println("-------------------MAP을 JSON String으로 변환-----------------------"); 
		
			ObjectMapper mapper = new ObjectMapper(); 
			
			String json2 = "";
			
			Map<String, Object> map2 = new HashMap<String, Object>();
			map2.put("name", "mkgil"); 
			map2.put("age", 25); 
			
			//json2 = mapper.writeValueAsString(map2); 
			json2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map2); 
			
			System.out.println(json2);
		} catch (JsonGenerationException e) { 
			e.printStackTrace();
		} catch (JsonMappingException e) { 
			e.printStackTrace(); 
		} catch (IOException e) { 
			e.printStackTrace(); 
		}		
	}
}
