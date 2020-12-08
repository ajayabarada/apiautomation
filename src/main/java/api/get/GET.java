package api.get;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GET {
	
	@Test
	
	public void getrequest()
	{
		Response response=given()
				.when()
				.get("http://dummy.restapiexample.com/api/v1/employees")
				.thenReturn();
		
		System.out.println(response.statusCode());
		
				
	}

}
