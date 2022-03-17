package studentAPITest;

import org.testng.annotations.Test;

import apiConfig.APIPath;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPITests extends BaseTest{
	
	@Test
	public void getAPITest() {
		
		//This is one way to do it
		//RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_POSTS).then().log().all().statusCode(200);
		
		//Another way of doing it is
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_POSTS);
		
		System.out.println(response.getBody().asString());
		
		System.out.println(response.statusCode());
		System.out.println(response.getCookies());
		System.out.println(response.getTime());
	}
}
