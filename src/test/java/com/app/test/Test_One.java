package com.app.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import model.User;

public class Test_One {
	
	public static void main(String[] args) {
		
		try {
			String apiResponse = "{\"id\":1,\"name\":\"John Doe\",\"email\":\"john.doe@example.com\"}";
			
			  // jackson 
			ObjectMapper objMap = new ObjectMapper(); 
			User user =  objMap.readValue(apiResponse, User.class); 
			System.out.println(user.getId());
			  System.out.println(user.getName());
			 
			
			// Gson
			
			  Gson gson = new Gson(); 
			  User fromJson = gson.fromJson(apiResponse,User.class);
			  System.out.println(fromJson.getEmail());
			  System.out.println(fromJson.getId());
			  
			 
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
