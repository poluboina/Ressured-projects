package com.crm.rmgyantra.CURDOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;

public class CreatingProjectTest {

	@Test

	public void creatingProjectTest() {

		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "SA123545");
		jobj.put("projectName", "SDET4739");
		jobj.put("status", "created");
		jobj.put("teamSize", 9);


		given()
		.contentType("application/json")
		.body(jobj)
	    .when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}

}
