package Altert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class altert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("Kanchan");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		alt.accept();
		
		//alt.dismiss();
		//String bc=alt.getText();
		//System.out.println(bc);
		
		Alert bc=driver.switchTo().alert();
		String a=bc.getText();
		//System.out.println(a);
		
		
		

	}

}
