package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section_page_Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
	    
	    WebDriver driver=new ChromeDriver();
	        
	    driver.get("https://www.flipkart.com/");
	        
	    driver.manage().window().maximize();
	      
	    Thread.sleep(2000);
	    WebElement section=driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]"));
	    
	    File s = section.getScreenshotAs(OutputType.FILE);
        
	    File d = new File("C:/Users/Aakash/Pictures/Saved Pictures.bmp");
	        
	    FileUtils.copyFile(s, d);
	    
	}

}
