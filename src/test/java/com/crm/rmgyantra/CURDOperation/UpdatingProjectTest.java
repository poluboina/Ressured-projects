package com.crm.rmgyantra.CURDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;



public class UpdatingProjectTest {
	
	@Test
	
	public void updatingProject() {
		
		JSONObject obj1= new JSONObject();
		obj1.put("name", "saikrishnayadav");
		
		RequestSpecification reqSp = RestAssured.given();
		reqSp.body(obj1);
		Response resp = reqSp.patch("https://reqres.in/api/users/2");
		
		ValidatableResponse vlresp = resp.then();
		
		vlresp.assertThat().statusCode(200);
		vlresp.assertThat().contentType(ContentType.JSON);
		
	
	}

}
