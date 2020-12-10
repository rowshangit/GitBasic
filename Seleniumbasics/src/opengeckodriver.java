import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class opengeckodriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Selenium Driver\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		browser.get("https://www.google.ca/");
		
		String actualtitle = browser.getTitle();
		if(actualtitle.equals("Google")) {
			System.out.println("Verification is complete, Actual Result is as expected");
		} else {
			System.out.println("The verification has failed, the actual title was: " + actualtitle);
		}
		
		browser.get("http://www.facebook.com/");
		browser.manage().window().maximize();
		
		String ActualURL = browser.getCurrentUrl();
		String ExpectedURL = "https://www.facebook.com/";
		
		if(ActualURL.equals(ExpectedURL)) {
			System.out.println("The URL is validated, Expected is equal is Actual");
		} else {
			System.out.println("The URL is not the same");
		}
		
		browser.findElement(By.id("email")).sendKeys("m.s.shumona@gmail.com");
		browser.findElement(By.id("pass")).sendKeys("0000");
		browser.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		
		//Wait for the page to load, we will use implicit wait
		

		//Validate the Error message
		String ActualError = browser.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[2]/div[2]")).getText();
		String ExpectedError = "The password you’ve entered is incorrect. Forgot Password?";
		
		if(ActualError.equals(ExpectedError)) {
			System.out.println("This is the correct error message");
		} else {
			System.out.println("Wrong error message");
		}
				
		browser.findElement(By.className("_97w4")).click();
		
		
	}

}
