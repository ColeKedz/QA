package testngWithRestAssured;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import static io.restassured.RestAssured.given;

public class CatsFreeAPI {

		@Test
		public void verify200Status() {
			
			RestAssured.baseURI = "https://catfact.ninja";
			
			int statusCode = given().when().get("https://catfact.ninja/breeds?limit=1").getStatusCode();
			
			ResponseBody<?> response = given().when().get("https://catfact.ninja/breeds?limit=1").getBody();
			
			Assert.assertEquals(200, statusCode);

			Reporter.log(response.asPrettyString());
			
		}
	
}
