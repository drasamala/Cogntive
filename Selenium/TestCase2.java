import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class TestCase2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", args[0]);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");
		    //driver.findElement(By.id("email")).sendKeys("9502953794");
		    
		    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(args[1]);
		  //.findElement(By.id("pass")).sendKeys("9985474900");
		    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(args[2]);
		  //  driver.findElement(By.id("loginbutton")).click();
		    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.get("https://www.facebook.com/arthi.rasamala");
		    WebElement postbox=driver.findElement(By.xpath("//div[@role=\"presentation\"]/div/div/div/div[@role=\"textbox\"]"));
		    postbox.click();
		    postbox.sendKeys("HI Testing");
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//button[contains(.,'Post')]")).click();		  	    
		    Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@id='logoutMenu']/a/div[@id='userNavigationLabel']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//ul[@class='_54nf']/li/a/span/span[@class='_54nh']/form/..")).click();

driver.close();
	}

}
