package com.crm.rmgyantra.CURDOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeletingProjectTest {
	@Test
	public void deleteProjectTest() {
		
		Response reps = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_826");
//		reps.prettyPrint();
		
		ValidatableResponse vreps = reps.then();
		
		vreps.assertThat().statusCode(204);
		
		vreps.assertThat().contentType(ContentType.JSON);
		
		vreps.log().all();
	}

}
