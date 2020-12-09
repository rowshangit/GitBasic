package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PTests {

	@BeforeTest

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Driver\\chromedriver.exe");

	}

	@Test
	public void loginTest() {

		WebDriver browser = new ChromeDriver();
		browser.get("https://the-internet.herokuapp.com/login");
		browser.manage().window().maximize();
		browser.findElement(By.id("username")).sendKeys("tomsmith");
		browser.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
		browser.findElement(By.cssSelector("#login > button > i")).click();
		System.out.println("Logout Button Visible");
		browser.close();
	}

	@AfterTest
	public void quit() {
		System.out.println("Browser Closed");

	}

}
