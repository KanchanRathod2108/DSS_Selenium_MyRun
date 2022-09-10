package day1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testt1 {

	
			public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(1000);
			Point p = new Point(100,100);
			driver.manage().window().setPosition(p);
			}
			


	}


