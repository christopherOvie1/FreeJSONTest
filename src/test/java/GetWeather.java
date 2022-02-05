import org.testng.annotations.Test;

import io.restassured.RestAssured;

//import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class GetWeather {
	
	
	@Test
	public void getRequest() {
		
		RestAssured.get("https://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=f6e2b9cb21529365dfaf141c7071350c");
	
	
		
		
	}



}
