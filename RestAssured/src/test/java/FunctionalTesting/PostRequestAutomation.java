package FunctionalTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostRequestAutomation {
	
	@Test
	public void postRequestAutomation() {
		
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		String jsonBody = "{\n"
				+ "    \"name\": \"RA_Test\",\n"
				+ "    \"job\": \"Automation Engineer\"\n"
				+ "}";
		
		RestAssured.given().body(jsonBody).post().then().log().all().assertThat().statusCode(201);
		
	}

}
