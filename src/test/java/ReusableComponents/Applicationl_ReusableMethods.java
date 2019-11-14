package ReusableComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Applicationl_ReusableMethods {
	
	// Method for wait for element
	  public static boolean waitForElement(WebDriver driver, String item) 
	  {
		    WebDriverWait wait = new WebDriverWait(driver,30);
		    WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(item)));
		    return element.isDisplayed();	    
	  }
	  

	  
	  // Method for Custom Wait with different Locator method

	    public static WebElement isElementPresnt(WebDriver driver,String LocatorMethod, String tag, String obj , int time)
	    {
	        WebElement ele = null;
	        
	        for(int i=0;i<time;i++)
	        {
	            try{
	                System.out.println("***Inside custom wait***");
	                
	                if (LocatorMethod.equals("xpath")) 
	                	ele=driver.findElement(By.xpath(".//*[@" + tag +"='"+ obj +"']"));
	                else if (LocatorMethod.equals("cssSelector"))
	                	ele=driver.findElement(By.cssSelector("[" + tag + "="+ obj + "]"));
	                else 
	                	System.out.println("object not found please check the idetifier");
	        }
	        catch(Exception e)
	        {
	        try 
	        {
	            Thread.sleep(1000);
	        }
	        
	        catch (InterruptedException e1) 
	        {
	            System.out.println("Waiting for element to appear on DOM");
	        }
	        
	        }
	    }
	    return ele;
	    
	    }
	  
	  
}
