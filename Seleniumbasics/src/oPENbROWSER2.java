import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oPENbROWSER2 {

	public static void main(String[] args) {
         //OPEN A BROWSER
		//Step 1 : Set up the system property using Webdriver Key and Location
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Driver\\chromedriver.exe");
		
		//Step 2 : Create an Object for Chromedriver Class.
		
		WebDriver rdriver = new ChromeDriver();
		
		//Step 3: Use the Get method using the object.
		rdriver.get("https://www.google.ca/");
		
		
		

	}

}
