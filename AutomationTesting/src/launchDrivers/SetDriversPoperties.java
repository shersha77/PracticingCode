package launchDrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetDriversPoperties {

	public static void main(String[] args) {
		
		//We can set a property in three ways.
		//1.System.setProperty("webdriver.gecko.driver","path we should give means where we store that path must be given")
		//2.We create folder in that we copy paste the driver directly
		//3.Directly we can copy paste into the the project
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\kalyani software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		//testing is nothing but each and every thing need to validate
		
		
		
		
		
		driver.close();

	}

}
