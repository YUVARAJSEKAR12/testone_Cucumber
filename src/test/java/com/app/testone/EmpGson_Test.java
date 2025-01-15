package com.app.testone;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EmpGson_Test {
	
	@Test
	public void getSerializationTest() {
		
		Employee emp = new Employee();
		emp.setFirstName("Yuvaraj");
		emp.setLastName("Sekar");
		emp.setEmailid("uv@gmail.com");
		
		Gson g = new Gson();
		String jsonpayload = g.toJson(emp);
		System.out.println(jsonpayload);
		
			Gson builder = new GsonBuilder().setPrettyPrinting().create();
			String json = builder.toJson(emp);
			System.out.println(json);
		
	}
	
	
	@Test
	public void getDetailsfromJson() {
		String payload= "{\r\n"
				+ "  \"firstName\": \"Aiite\",\r\n"
				+ "  \"lastName\": \"Java\",\r\n"
				+ "  \"emailid\": \"info@gmail.com\"\r\n"
				+ "}";
		
		Gson res = new Gson();
		Employee em = res.fromJson(payload, Employee.class);
		System.out.println(em.getFirstName());
		System.out.println(em.getLastName());
		System.out.println(em.getEmailid());
		
		
	}

}
