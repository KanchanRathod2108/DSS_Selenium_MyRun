package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys_Arrow_Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
	    
	    WebElement a1 = driver.findElement(By.id("searchDropdownBox"));
	    a1.click();
	    
	    Actions a = new Actions(driver);
	    
	    for(int i=1;i<=10;i++) {
	    a.sendKeys(Keys.ARROW_DOWN).build().perform();
	    Thread.sleep(1000);
	    
	    }
	    Thread.sleep(2000);
	    
	    for(int i=1;i<=5;i++) {
	      a.sendKeys(Keys.ARROW_UP).build().perform();
	      Thread.sleep(1000);
	      }
	    a.sendKeys(Keys.ENTER).build().perform();
	    
	    driver.findElement(By.id("nav-search-submit-button")).click();

	}

	}
