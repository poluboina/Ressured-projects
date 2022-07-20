package com.crm.rmgyantra.CURDOpertionWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class CreatingProjectTest {

	@Test

	public void creatingProjectTest() {

		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "SA123545");
		jobj.put("projectName", "SDET456");
		jobj.put("status", "created");
		jobj.put("teamSize", 9);


		given()
		.contentType(ContentType.JSON)
		.body(jobj)
	    .when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}

}
