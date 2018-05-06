import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class FacebookLoginLogut {

	/**
	 * @param args
	 * @throws InterruptedException 
	 //args[0]--->path to chrome .exe location
	//args[1]-->Facebook login username
	//args[2]-->Facebook login password
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", args[0]);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");
		    driver.findElement(By.id("email")).sendKeys(args[1]);
		    driver.findElement(By.id("pass")).sendKeys(args[2]);
		    driver.findElement(By.id("loginbutton")).click();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    WebElement logout1 = driver.findElement(By.cssSelector("#userNavigationLabel"));
		    logout1.click();
		    Thread.sleep(3000);
		    WebElement logout2 = driver.findElement(By.cssSelector("a[data-gt*='menu_logout']>span>span._54nh"));
		    logout2.click();
		    		
		    		
		    		
		    

driver.close();
	}

}
