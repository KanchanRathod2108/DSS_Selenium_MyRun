package calender_date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender_date_pick_up {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.redbus.in/");
	    
	    driver.manage().window().maximize();
	    driver.findElement(By.id("src")).sendKeys("Pune");
	    driver.findElement(By.id("dest")).sendKeys("Digras(Yavatmal)");
	    driver.findElement(By.xpath("//label[contains(text(),'Date')]")).click();
	    
	    Thread.sleep(1000);
	    String month="Aug 2022";
	    while(true)
	    {
	    String text=driver.findElement(By.xpath("//td[contains(text(),'Aug 2022')]")).getText();
	    if(text.equals(month))
	    {
	    	break;
	    	
	    }
	    else
	    {
	    	driver.findElement(By.xpath("//button[@id='']")).click();
	    }
	}
         driver.findElement(By.xpath("//td[contains(text(),'21')]")).click();
         Actions a=new Actions(driver);
         a.sendKeys(Keys.TAB).build().perform();

         driver.findElement(By.cssSelector("#search_btn")).click();
         
}
	


	


	}


