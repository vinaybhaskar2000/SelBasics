package basics;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:/New_Selenium_June 2017/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--start-maximized");
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://google.com");
		
	List<WebElement> langages = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
	System.out.println(langages.size());	
	
	 for (int i = 0; i < langages.size(); i++) 
	 {
	   String languages = langages.get(i).getText();
	   System.out.println(languages);
	 }
		
	}
}
