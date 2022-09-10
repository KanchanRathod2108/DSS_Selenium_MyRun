package list_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://techcanvass.com/Examples/multi-select.html");
		    
		 driver.manage().window().maximize();
		    
		    WebElement a12 = driver.findElement(By.id("multiselect"));
		    
		    Select s = new Select(a12);
		    
		    s.selectByIndex(3);
		    s.selectByValue("hyundai");
		    s.selectByVisibleText("Volvo");
		    
		    Thread.sleep(3000);
		    
		    
		    s.deselectByIndex(3);
		    s.deselectByValue("hyundai");
		    s.deselectByVisibleText("Volvo");

	}

}
