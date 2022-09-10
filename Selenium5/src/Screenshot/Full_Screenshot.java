package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Full_Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
	    
	    WebDriver driver=new ChromeDriver();
	        
	    driver.get("https://www.facebook.com/login/");
	        
	    driver.manage().window().maximize();
	    File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File d= new File("C:/Users/Aakash/Desktop/Screenshot/k.bmp");
	    FileUtils.copyFile(s, d);
}
}