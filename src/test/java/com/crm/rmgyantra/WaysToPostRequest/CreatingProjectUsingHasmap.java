package com.crm.rmgyantra.WaysToPostRequest;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class CreatingProjectUsingHasmap {
	@Test
	public void creatingProjectHasmap() {
		
		HashMap hmap = new HashMap();
		hmap.put("createdBy", "SA123545");
		hmap.put("projectName", "SDET47334");
		hmap.put("status", "created");
		hmap.put("teamSize", 9);
		
		
		given()
		.contentType("application/json")
		.body(hmap)
	    .when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
		

			
		
		
	}

	
}
