package ReusableComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCloseApplication extends ReusableComponents.WebDriverDefinition{
	
	public void LaunchApplication () 
	{
		
		  File file = new File("./Resources/Config.properties");
	      FileInputStream fileInput = null;
      
			try 
			{
          		fileInput = new FileInputStream(file);
      		} catch (FileNotFoundException e) {e.printStackTrace();}
      
			Properties prop = new Properties();
			//load properties file
			try 
			{
				prop.load(fileInput);
			} catch (IOException e){e.printStackTrace();}
		
			
			String ApplURL = prop.getProperty("LoginPage");
			
		    driver.get(ApplURL);
	}
	
	
	public void CloseApplication () 
	{
		driver.close();
	}

}
