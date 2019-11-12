package StepDefinition;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import ReusableComponents.LaunchCloseApplication;

public class Hooks extends ReusableComponents.WebDriverDefinition{
		
    LaunchCloseApplication lc = new LaunchCloseApplication ();
    
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");  
	LocalDateTime now = LocalDateTime.now();  
	String strDate = dtf.format(now);  		
	String SreenShotName ;
    
	 //Hook
   @Before()
   public void BeforeScenario()
   {
      System.out.println("**Before every scenario**"); 
       lc.LaunchApplication();
      
   }
       
   @After
   public void afterscn(Scenario snrName)
	 {
		 System.out.println("**After every scenario**");
		
		 
		 	 SreenShotName	= snrName.getName() + "_" + strDate;
		 	 Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE).withName(SreenShotName).save("./Screenshot");
		 	
		 lc.CloseApplication();
	 }

}
