package bBot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SouthwestAirlines {
public static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shawn\\eclipse-workspace\\selenium_java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	
		
	    driver.get("https://www.southwest.com/"); //goes to southwest airlines website  
		
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
		WebElement departureInput = driver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode"));
		WebElement arrivalInput = driver.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode"));
		WebElement departureDate = driver.findElement(By.id("LandingAirBookingSearchForm_departureDate"));
		WebElement returnDate = driver.findElement(By.id("LandingAirBookingSearchForm_returnDate"));
		WebElement searchBtn = driver.findElement(By.id("LandingAirBookingSearchForm_submit-button"));
		
		
		String textInsideDeparture = departureInput.getAttribute("value");
		String textInsideArrival = arrivalInput.getAttribute("value");
		String textInsideDepartureDate = departureDate.getAttribute("value");
		
		if(textInsideDeparture.isEmpty()) {   //check if element has text in it
			departureInput.sendKeys("ATL");
			departureInput.sendKeys(Keys.ENTER);
			System.out.println("Text box is empty");
		}
		
		else 
			System.out.println("text box is not empty");
			departureInput.click();
			departureInput.sendKeys(Keys.BACK_SPACE);
			//departureInput.clear();
			departureInput.sendKeys("ATL");
			departureInput.sendKeys(Keys.ENTER);
			
			
		
		//read and write a file into this so I can print off the destinations with the prices I grab from the website 
		
		arrivalInput.click();
		arrivalInput.sendKeys("BWI");
		arrivalInput.sendKeys(Keys.ENTER);
		
		if(textInsideDepartureDate.isEmpty()) {
			departureDate.sendKeys("9/2");
			returnDate.sendKeys("9/5");
			searchBtn.click();
			
		}
		
		else 
			departureDate.click();
			departureDate.sendKeys(Keys.BACK_SPACE);
			departureDate.sendKeys("9/2");
			returnDate.sendKeys("9/5");
			searchBtn.click();
			
			
		WebElement searchBtn2 = driver.findElement(By.id("form-mixin--submit-button"));
		
		searchBtn2.click();
		
}
}