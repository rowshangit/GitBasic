import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Othermethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Driver\\chromedriver.exe");
		WebDriver rdriver = new ChromeDriver();
		rdriver.get("https://www.google.ca/");
		
		//Get the current URL
		//System.out.println(rdriver.getCurrentUrl());
		String URL = rdriver.getCurrentUrl();
		System.out.println(URL);
		
		String Title = rdriver.getTitle();
		System.out.println(Title);
		
		//Maximize the screen
		rdriver.manage().window().maximize();

		//navigate
		rdriver.navigate().refresh();
		
			
		//Closing the current Chrome Browser that i opened
		rdriver.quit();
		
	}

}
