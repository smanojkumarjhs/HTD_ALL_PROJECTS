package com.restassureddemo.tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ReqResTest {
	Response response;

	@BeforeTest
	public void baseurl() {

		baseURI = "https://reqres.in/";
	}

	public void ResponseOutput() {
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());

	}

	@Test
	public void toGetData() {

		Response res = given().get("/api/users?page=2");
		System.out.println(res.asPrettyString());

	}

	@Test
	public void toGetSingleUser() {
		Response res = given().get("api/users/2");

		System.out.println(res.asPrettyString());

	}

	@Test
	public void toGetSingleUserNotFound() {
		Response res = given().get("/api/users/23");
		System.out.println(res.getStatusLine());
		System.out.println(res.getStatusCode());
		System.out.println(res.asPrettyString());
	}

	@Test
	public void toGetListOfResources() {
		Response res = given().get("/api/unknown");
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.asPrettyString());

	}

	@Test
	public void toGetSingleResource() {
		Response res = given().get("/api/unknown/2");
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.asPrettyString());

	}

	@Test
	public void toGetSingleResourceNotFound() {
		Response res = given().get("/api/unknown/23");
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.asPrettyString());

	}

	@Test
	public void toCreateUser() {

		String jsonBody = "{ \"name\": \"manoj\", \"job\": \"tester\" }";
		Response response = given().contentType(ContentType.JSON) // Specify content type as JSON
				.body(jsonBody) // Add the JSON body
				.post("/api/users");

		// Print response status and body
		System.out.println("Status Code: " + response.getStatusCode());
		System.out.println("Response Body: " + response.asPrettyString());

	}

	@Test
	public void toUpdateUser() {
		// JSONObject jsonBody = new JSONObject();
		// jsonBody.put("name", "kumar");
		// jsonBody.put("job", "engineer");
		Response response = given().log().all()
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}").when()
				.put("/api/users/2");
		// then().assertThat().statusCode(200);
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());

	}

	@Test
	public void toPartialUpdate() {
		response = given().log().all()
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}").when()
				.patch("/api/users/2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());
	}

	@Test
	public void toRegisterUserSuccessfull() {
		response = given().log().all()
				.body("{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"pistol\"\r\n" + "}")
				.when().post("/api/register");
		ResponseOutput();

	}

	@Test
	public void toRegisterUnsuccessfull() {
		response = given().log().all().body("{\r\n" + "    \"email\": \"sydney@fife\"\r\n" + "}").when()
				.post("/api/register");
		ResponseOutput();
	}

	@Test
	public void toLoginSuccessfull() {
		Response response = given().log().all().body(
				"{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"cityslicka\"\r\n" + "}")
				.when().post("/api/login");

		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());

	}

}
