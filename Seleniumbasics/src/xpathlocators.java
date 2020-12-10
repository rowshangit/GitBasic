import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocators {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Driver\\chromedriver.exe");
	WebDriver browser = new ChromeDriver();
	browser.get("https://the-internet.herokuapp.com/login");
	browser.manage().window().maximize();
	
	
	browser.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith");
	browser.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");
	browser.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
	browser.findElement(By.xpath("//*[@id=\"content\"]/div/a/i")).click();
	


	}

}
