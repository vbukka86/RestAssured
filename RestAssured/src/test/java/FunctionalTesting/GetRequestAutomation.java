package FunctionalTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.*;
import io.restassured.response.Response;


public class GetRequestAutomation {
	
	//Simple GET request automation when base URL, query is provided
	@Test
	public void getRequestAutomation_1() {
		
		
		//To define Base URL
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		//To provide query params as Key, Value pairs
		RestAssured.given().param("page", "2")
			.when()
			.get()
			.then()
			.assertThat()
			.log()
			.all()
			.statusCode(200);
		
		//When .log and .all is provided it will print entire headers and response body
		
	}
	
	@Test
	public void getRequestAutomation() {
		
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		Response response = RestAssured.given().param("page", "2").when().get();
		
		System.out.println(response.getBody().asString());
		System.out.println("Status Code: " + response.getStatusCode());
		System.out.println("Content Type: "+ response.contentType());
		System.out.println("Cookie Type: "+ response.getCookies());
		System.out.println(response.prettyPrint());
		
	}

}
