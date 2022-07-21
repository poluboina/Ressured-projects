package com.crm.rmgyantra.Validation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import  static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicValidationTest {


	@Test
	public void dynamicValidation() {

		String expData="sai456344";
		Response rsps = when()
				.get("http://localhost:8084/projects");

		List <String> list = rsps.jsonPath().get("projectName");
		for(String act:list) {
			if(act.contains(expData)) {
				System.out.println(act+"Project is available");
				break;

			}
		}

		rsps.then().log().all();
	}

}
