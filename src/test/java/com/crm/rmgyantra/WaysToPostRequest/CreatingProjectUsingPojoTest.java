package com.crm.rmgyantra.WaysToPostRequest;

import org.testng.annotations.Test;

import com.crm.rmgyantra.POJOLibrary.Pojo;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

public class CreatingProjectUsingPojoTest {

	@Test
	public void creatingProjectUsingPojoTest() {
		Pojo p = new Pojo("sai","saikrishna776","createdby",67);
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();
		
		
		
	}
	
	
	
}
