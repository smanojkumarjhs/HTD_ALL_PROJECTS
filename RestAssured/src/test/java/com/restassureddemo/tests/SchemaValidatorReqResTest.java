package com.restassureddemo.tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SchemaValidatorReqResTest {
	@BeforeTest
	public void baseurl() {

		baseURI = "https://reqres.in/";
	}
	@Test
	public void toGetData() throws FileNotFoundException {

		 given().log().all()
				.when().
				get("/api/user?page=2")
				.then().log().all()
//				.assertThat().body(matchesJsonSchemaInClasspath("Getlistschema.json")).extract().response();
		 		.assertThat().body(matchesJsonSchema(new FileInputStream("./src/test/resources/Getlistschema.json"))).extract().response();
		

	}
}


