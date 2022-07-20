package com.crm.rmgyantra.CURDOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GettingProjectTest {
	@Test
	public void getProjectTest() {
		
		Response reps = RestAssured.get("http://localhost:8084/projects");
		
//		System.out.println(reps.toString());
		
//		reps.prettyPrint();
		
		ValidatableResponse vreps = reps.then();
		
		vreps.assertThat().statusCode(200);
		
//		vreps.assertThat().contentType("Application/json");
		
		//instead of that we can use contantType
		
		vreps.assertThat().contentType(ContentType.JSON);
		
		//it will print all 
		vreps.log().all();
		
		
	}

}
