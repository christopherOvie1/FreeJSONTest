import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;

public class TestOnLFreeJSON {
	
	
	
	
	
	//@Test
	public void get() {
		
		
		baseURI="http://localhost:3000";
		given().get("/users").then().statusCode(200).log().all();
		
	}
	//@Test
	public void post() {
		
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", "mike");
		request.put("lastName", "jinm");
		request.put("subjectId", 5);
		

		baseURI="http://localhost:3000";
		
		given().contentType(ContentType.JSON)
		.accept(ContentType.JSON).body(request.toJSONString())
		.when()
		.post("/users")
		.then().statusCode(201).log().all();
	}
	
	//@Test
	public void put() {
		
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", "hausa");
		request.put("lastName", "DOE");
		request.put("subjectId", 2);
		

		baseURI="http://localhost:3000";
		
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put("/users/4")
		.then()
		.statusCode(200);
	}
	//@Test
public void patch() {
		JSONObject request = new JSONObject();
		
		request.put("firstName", "danial");
		baseURI="http://localhost:3000";
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("/users/8")
		.then()
		.statusCode(200);
}
@Test
public void delete() {
	baseURI="http://localhost:3000";
	when()
	.delete("/users/6")
	.then().statusCode(200);
	
}
}