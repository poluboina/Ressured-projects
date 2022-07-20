package com.crm.rmgyantra.CURDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreatingProjectTest {
	@Test
	
	public void creatingProjecTest() {
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "SA123");
		jobj.put("projectName", "SDET###");
		jobj.put("status", "created");
		jobj.put("teamSize", 9);
		
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(jobj);
		
					Response resp = reqSpec.post("http://localhost:8084/addProject");
					ValidatableResponse vresp = resp.then();
						vresp.log().all();
						vresp.assertThat().statusCode(201);
	}
	

}
