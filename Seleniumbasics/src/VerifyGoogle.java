import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGoogle {

	public static void main(String[] args) {

		/*
		 * Exercise 
		 * 1. Open Google Chrome 
		 * 2. Get Title 
		 * 3. Verify if the title is "Google"
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Driver\\chromedriver.exe");
		WebDriver rdriver = new ChromeDriver();
		rdriver.get("https://www.google.ca/");
		String actualtitle = rdriver.getTitle();
		if(actualtitle.equals("Google")) {
			System.out.println("Verification is complete, Actual Result is as expected");
		} else {
			System.out.println("The verification has failed, the actual title was: " + actualtitle);
		}
		

	}

}
