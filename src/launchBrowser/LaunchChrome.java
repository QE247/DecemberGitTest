package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\quazi.elahee\\December2021_Selenium\\1st_Selenium_Session\\drivers\\chromedriver.exe");
		//object creation of WebDriver
		WebDriver driver = new ChromeDriver(); // object variable
		// go to the desired web site
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//driver.get("https://www.yahoo.com/");
		//driver.manage().window().maximize();
		//driver.get("https://www.prothomalo.com/");
		//driver.manage().window().maximize();
		//stop execution of an application
		Thread.sleep(3000);
		driver.close(); // close browser
		
		//object creation
		
		//inherit
		
		
	}
}
