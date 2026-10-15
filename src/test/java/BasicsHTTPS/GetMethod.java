package BasicsHTTPS;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class GetMethod {
	
	@Test
	public void getMethod() {

	    RestAssured.baseURI = "http://localhost:3000";

	    Response response =
	        given()
	        .when()
	        .get("/employees");

	    // Response details
	    System.out.println("Status Code: " + response.getStatusCode());
	    System.out.println("Response Body: " + response.getBody().asString());
	    System.out.println("Response Body: " + response.jsonPath().getString("id[0]"));

	    // Validations
	    response.then()
	            .statusCode(200)
	            .body("id[0]", equalTo("101"));
	}

}
