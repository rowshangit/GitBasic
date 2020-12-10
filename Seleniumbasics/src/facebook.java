import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Driver\\chromedriver.exe");
		WebDriver facebook = new ChromeDriver();
		facebook.get("http://www.facebook.com/");
		facebook.manage().window().maximize();
		
		
//Validate the URL
		String ActualURL = facebook.getCurrentUrl();
		String ExpectedURL = "https://www.facebook.com/";
		
		if(ActualURL.equals(ExpectedURL)) {
			System.out.println("The URL is validated, Expected is equal is Actual");
		} else {
			System.out.println("The URL is not the same");
		}
		
		facebook.findElement(By.id("email")).sendKeys("m.s.shumona@gmail.com");
		facebook.findElement(By.id("pass")).sendKeys("rowshan");
		facebook.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		facebook.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[1]/ul/li[4]/span/div/a/span/svg/path")).click();
		facebook.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/i")).click();
		facebook.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		
		
		
	}

}
