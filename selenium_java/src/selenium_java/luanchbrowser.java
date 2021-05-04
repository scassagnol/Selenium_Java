package selenium_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class luanchbrowser {

	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shawn\\eclipse-workspace\\selenium_java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.get("https://www.google.com/");
		
		WebElement googleSearch = driver.findElement(By.name("q"));
		googleSearch.sendKeys("scassagnol.com");
		googleSearch.sendKeys(Keys.ENTER);
		
		//page waits 5 seconds for loading to load elements that may not appear right way
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//element was found by Xpath and clicked on to take us to page we desired 
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).click();
		//*[@id="rso"]/div[1]/div/div/div[1]/a/h3
		
		//System.out.println(present);
		
		
		
		
		//Actions actions = new Actions(driver);
		
		//actions.moveToElement(googleSearch);
		
	}

}
