import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {
	@Test
	void test_01() {
		
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		/*System.out.println("The time body is  "+ response.getBody());
		System.out.println("The string  is "+response.asString());
		System.out.println("The statuscode  is "+response.getStatusCode());
		System.out.println("The status line  is "+response.getStatusLine());
		
		System.out.println("The header is "+response.getHeader("content-type"));
		System.out.println("The time is "+response.getTime());*/
		
	int statusCode=	response.getStatusCode();
	
	System.out.println("i found "+statusCode);
	Assert.assertEquals(statusCode, 200);   
	
		
		
			
	}

}
