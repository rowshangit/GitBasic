import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Driver\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://the-internet.herokuapp.com/login");
		browser.manage().window().maximize();
		
		
		browser.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		browser.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
		browser.findElement(By.cssSelector("#login > button > i")).click();
		browser.findElement(By.cssSelector("#content > div > a > i")).click();
		

	}

}
