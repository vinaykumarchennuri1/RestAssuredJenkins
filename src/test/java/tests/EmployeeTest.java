package tests;

import org.testng.annotations.Test;

import api.EmployeeApi;
import base.BaseTest;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;


public class EmployeeTest extends BaseTest {
	
	@Test
	public void getEmployeeTestDetails()
	{
		EmployeeApi empolyeeApi = new EmployeeApi(requestSpec);
		
		Response response = empolyeeApi.getAllEmployees();
		
		 System.out.println("Status Code: " +
		 response.getStatusCode());
		 
		 response
		 .then()
		 .body("id[0]", equalTo("101"));
	}

}
