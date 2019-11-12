package ReusableComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverDefinition 
{
public static WebDriver driver = null;
    
    public WebDriverDefinition()
    {
        if(driver == null)
        {
              //Mention path of chrome driver of your system
              String exePath = "./Resources/chromedriver.exe";
              System.setProperty("webdriver.chrome.driver", exePath);
              driver = new ChromeDriver();
              System.out.println("**Chrome driver initiated successfully**");
        }
        else
        {
            System.out.println("**Using already instantiated chrome driver**");
        }
    }
    
    public static WebDriver getdriver()
    {
        if (driver == null){
            return driver;
            }else{
            return driver;
            }
    }

}



