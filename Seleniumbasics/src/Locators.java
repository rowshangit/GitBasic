import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		
		//Set up System property to open  webdriver and get an object for Chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Driver\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		//Open a Browser
		browser.get("https://the-internet.herokuapp.com/login");
		browser.manage().window().maximize();
		
		//To have Selenium point to the webelement
		browser.findElement(By.id("username")).sendKeys("tomsmith");
		browser.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		browser.findElement(By.className("radius")).click();
		browser.findElement(By.xpath("//*[@id=\"content\"]/div/a/i")).click();
		
		
		
		
		
		
		
	

	}

}
