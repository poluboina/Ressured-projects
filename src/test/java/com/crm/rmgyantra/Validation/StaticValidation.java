package com.crm.rmgyantra.Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticValidation {
	
	@Test
	public void staticValidation() {
		
		Response rsps = when()
		.get("http://localhost:8084/projects/TY_PROJ_1204");
		String actData =rsps.jsonPath().getString("projectName");
		String expData ="sai456323";
		Assert.assertEquals(actData, expData);
		rsps.then()
		.log().all();
		
		
	}

}
