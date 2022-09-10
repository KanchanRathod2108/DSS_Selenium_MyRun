package Function_of_webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//WebElement a =driver.findElement(By.linkText("Gmail"));
		//String b =a.getText();
		//System.out.println("b");
		//use any of the either upper one which is commented or the below one that is mentioned in notes. 
		String a=driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(a);
		
		
	}
	

}
