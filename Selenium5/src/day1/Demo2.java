package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement a = driver.findElement(By.id("multiselect"));
		Select s= new Select(a);
		s.selectByIndex(0);
		s.selectByValue("audi");
		s.selectByVisibleText("Hyundai");
		Thread.sleep(5000);
		s.deselectByIndex(0);
		s.deselectByValue("audi");
		s.deselectByVisibleText("Hyundai");
		Thread.sleep(7000);
		driver.close();
	}
}
		
		
				
				



