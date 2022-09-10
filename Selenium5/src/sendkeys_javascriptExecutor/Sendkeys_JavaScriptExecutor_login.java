package sendkeys_javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_JavaScriptExecutor_login {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
	    
	    WebDriver driver=new ChromeDriver();
	        
	    driver.get("https://www.facebook.com/login/");
	        
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("Kanchan");
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("document.getElementById('pass').value='Kanchan123';");
	    driver.findElement(By.id("loginbutton")).click();
	    //for user id code
	    //("document.getElementById('Email').value='SoftwareTestingMaterial.com';");

	}

}
