package Practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section_of_page {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
	    
	    WebDriver driver=new ChromeDriver();
	        
	    driver.get("https://www.amazon.in/");
	        
	    driver.manage().window().maximize();
	      
	    Thread.sleep(2000);
	    WebElement section=driver.findElement(By.xpath("//div[@id='hwDZI2_I6gRtu_e0iuvKpw']"));
	    
	    File s = section.getScreenshotAs(OutputType.FILE);
        
	    File d = new File("C:/Users/Aakash/Pictures.bmp");
	        
	    FileUtils.copyFile(s, d);
	    
	}

}
