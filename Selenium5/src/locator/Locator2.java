package locator;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) throws  InterruptedException 
	{
		System.setProperty("webdriver.chorme.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.office.com/mail/");
		
		Thread.sleep(2000);
		Point p = new Point(100,100);
		driver.manage().window().setPosition(p);
		
		
		

	}

}
