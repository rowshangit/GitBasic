import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Driver\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://the-internet.herokuapp.com/dropdown");
		browser.manage().window().maximize();
		
		Select dropdown = new Select(browser.findElement(By.id("dropdown")));
		
		//dropdown.selectByvalue("Option1")
		//dropdown.selectByIndex(2)
		//dropdown.selectByVisible Text("Option1")
		
		
		dropdown.selectByVisibleText("Option 1");
		
		
		
		
			
	
	
		
		

	}

}
