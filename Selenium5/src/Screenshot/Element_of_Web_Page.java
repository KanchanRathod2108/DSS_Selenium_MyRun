package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_of_Web_Page {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
		    
		    WebDriver driver=new ChromeDriver();
		        
		    driver.get("https://demo.nopcommerce.com/");
		        
		    driver.manage().window().maximize();
		      
		    Thread.sleep(2000);
		    
		    WebElement ele=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		    File s = ele.getScreenshotAs(OutputType.FILE);
	        
		    File d = new File("C:/Users/Aakash/Pictures/logo.bmp");
		        
		    FileUtils.copyFile(s, d);
		    
	}

}
