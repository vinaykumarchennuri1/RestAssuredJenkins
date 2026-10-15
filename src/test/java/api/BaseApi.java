package api;

import io.restassured.specification.RequestSpecification;

public class BaseApi {
	
	protected RequestSpecification requestSpec;
	
	public BaseApi(RequestSpecification requestSpec)
	{
		this.requestSpec = requestSpec;
	}

}
