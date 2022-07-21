package com.crm.rmgyantra.POJOLibrary;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Dataprovider_MulitipleData {
	
	@Test(dataProvider ="getData")
	public void multipleData(String createdBy,String projectName,String status,int teamSize) {
		
		
		Pojo p = new Pojo("createdBy","projectName","status",teamSize);
		given()
		.contentType(ContentType.JSON)
		.body(p)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();
		
		
		
	}
	
	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] objArr=new Object[2][4];
		
		objArr[0][0]="saikrishna";
		objArr[0][1]="SDET_75";
		objArr[0][2]="created";
		objArr[0][3]=30;
		
		objArr[1][0]="saikrishna123";
		objArr[1][1]="SDET7-65";
		objArr[1][2]="created";
		objArr[1][3]=34;
		
		return objArr;
	}
	
	
	
}



