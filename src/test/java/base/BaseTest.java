package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseTest {

	protected RequestSpecification requestSpec;

	public BaseTest() 
	{
		requestSpec = new RequestSpecBuilder()
				      .setBaseUri("http://localhost:3000")
				      .build();
	}

}
