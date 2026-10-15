package api;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class EmployeeApi extends BaseApi {

    public EmployeeApi(RequestSpecification requestSpec) {
        super(requestSpec);
    }

    public Response getAllEmployees() {

        return given()
                .spec(requestSpec)
        .when()
                .get("/employees");
    }
}