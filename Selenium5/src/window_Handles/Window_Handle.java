package window_Handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		Set<String>s=driver.getWindowHandles();
		Iterator<String>it=s.iterator();
		it.next();
		String w2nd=it.next();
		driver.switchTo().window(w2nd);
		Thread.sleep(2000);
		driver.findElement(By.name("emailid")).sendKeys("kanchan123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click Here")).click();
		
	}

}
