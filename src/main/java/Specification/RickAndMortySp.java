package Specification;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

public class RickAndMortySp {
    public static void createRMspecif(String baseURL){
        RestAssured.requestSpecification= new RequestSpecBuilder()
                .setRelaxedHTTPSValidation()
                .setBaseUri(baseURL)
                .setContentType(ContentType.JSON)
                .build();
        RestAssured.responseSpecification=new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }
}
