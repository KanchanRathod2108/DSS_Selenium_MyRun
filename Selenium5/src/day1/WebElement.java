package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement a=(WebElement) driver.findElement(By.id("multiselect"));
		Select s=new Select((org.openqa.selenium.WebElement) a);
		s.selectByIndex(0);
		s.selectByValue("audi");
		s.selectByVisibleText("Hyundai");
		
		Thread.sleep(2000);
		List<org.openqa.selenium.WebElement> b =s.getOptions();
		for(int i=0;i<b.size();i++)
		{
			String c=((org.openqa.selenium.WebElement) b.get(i)).getText();
			System.out.println(c);
			Thread.sleep(1000);
		}
		Thread.sleep(3000);
		driver.close();
	}

}
