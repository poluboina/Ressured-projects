package com.crm.rmgyantra.WaysToPostRequest;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreatingProjectUsingFileTest {
	@Test
	
	public void creatingProjectUsingFileTest() {
		
		File fs = new File("./jsondataforCurd1.json");
		given()
		.contentType(ContentType.JSON)
		.body(fs)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();
		
	}
	

}
