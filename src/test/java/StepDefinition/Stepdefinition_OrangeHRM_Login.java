package StepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import Application_POMClasses.OrangeHRM_Login;


public class Stepdefinition_OrangeHRM_Login extends ReusableComponents.WebDriverDefinition

{

	@Given("^Login_to_HR_Application$")
	public void login_to_hr_application(DataTable dtLoginData) throws Throwable 
	{
		List<String> strlstLoginData = dtLoginData.asList(String.class);
	
		OrangeHRM_Login o_Login = new OrangeHRM_Login();
		driver = o_Login.loginToOrangeHRM(driver, strlstLoginData.get(0), strlstLoginData.get(1));		
	}

	
	@When("^Reached_to_landingpage$")
	public void reached_to_landingpage(DataTable dtPgTitle) throws Throwable {
    
		 List<String> strlstPgtitle = dtPgTitle.asList(String.class);
		 
		  String S = driver.getTitle();
		  if (S.equals(strlstPgtitle.get(0)))
		  {	
			  System.out.println ("page header is as expected " + S);

		  }
		  else
		  { 
			  System.out.println ("page header is not as expected " + driver.getTitle());
		  }
		  
	}

}
