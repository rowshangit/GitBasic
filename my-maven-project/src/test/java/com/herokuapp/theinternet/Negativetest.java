package com.herokuapp.theinternet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Negativetest {
	@BeforeTest
	public void setup () {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Driver\\chromedriver.exe");	
	}
	
	@Test
	public void NegativeTest () {
		
		WebDriver browser = new ChromeDriver();
		browser.get("https://the-internet.herokuapp.com/login");
		browser.manage().window().maximize();
		browser.findElement(By.cssSelector("#username")).sendKeys("tomsmith1");
		browser.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
		browser.findElement(By.cssSelector("#login > button > i")).click();
		browser.close();
	
	}
	
	@Test
	public void NegativeTest2 () {
		
		WebDriver browser = new ChromeDriver();
		browser.get("https://the-internet.herokuapp.com/login");
		browser.manage().window().maximize();
		browser.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		browser.findElement(By.cssSelector("#password")).sendKeys("1SuperSecretPassword!");
		browser.findElement(By.cssSelector("#login > button > i")).click();
		browser.close();
	}
	
	@AfterTest
	public void quit () {
		System.out.println("Browser Closed");
	}
	
	

}
