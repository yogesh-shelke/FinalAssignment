package RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;


public class RestAssuredTest {
  @Test
  public void restAssured()
  {
      Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=Delhi,uk&appid=b6907d289e10d714a6e88b30761fae22");
      System.out.println("Value of Responce-->"+resp.getStatusCode());
  
  }
  
  @Test
  public void restAssured_String()
  {
      //Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
      Response resp = RestAssured.get("http://restcountries.eu/rest/v1/name/India");
      String  strdata = resp.asString();
      System.out.println("Value of data Responce(string)-->"+strdata);
      System.out.println("ResponceTime -->"+resp.getTime());
  
  }
  
  
}
