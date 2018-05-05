import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class GetFontColorAlign {

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
				  // driver.get("https://www.facebook.com/");
        
			        
			        driver.get("https://www.jotform.com/form-templates/category/registration");
			    	Thread.sleep(3000);
			        driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
			    	Thread.sleep(3000);
			    	driver.findElement(By.xpath("//button[@id='jfHeader_signupButton']")).click();
			    	Thread.sleep(3000);
			       String textalign= driver.findElement(By.xpath("//form[@id='jfHeader_registrationForm']/div[1]/label")).getCssValue("text-align");
			       String fontcolor= driver.findElement(By.xpath("//form[@id='jfHeader_registrationForm']/div[1]/label")).getCssValue("color");
			      String fontsize=  driver.findElement(By.xpath("//form[@id='jfHeader_registrationForm']/div[1]/div")).getCssValue("font-size");
			      System.out.println("Font color " + fontcolor);
			        System.out.println("Font size " + fontsize);
			        System.out.println("text align " + textalign);
			        
			        driver.close();
		        
			        
			        
		
				
				

	}

}
