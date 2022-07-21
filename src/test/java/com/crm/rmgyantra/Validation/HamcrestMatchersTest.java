package com.crm.rmgyantra.Validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class HamcrestMatchersTest {

	
	@Test
	public void hamcrest() {
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().time(Matchers.lessThan(500L), TimeUnit.MILLISECONDS)
		.assertThat().body("[1].projectName",Matchers.equalTo("sai456344"))
		.log().all();
	}
}
