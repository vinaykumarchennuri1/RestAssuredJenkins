package BasicsHTTPS;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class PostMethod {
	
	@Test
	public void postMethod()
	{
		RestAssured.baseURI = "http://localhost:3000";
		
		given()
		.body("{\r\n"
				+ "    \"id\": \"1200\",\r\n"
				+ "    \"name\": \"Test123\"\r\n"
				+ "  }")
		.when()
		.post("/employees")
		.then()
		.statusCode(201)
		.log().all();
	}

}
