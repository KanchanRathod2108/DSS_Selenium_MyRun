package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linled_text {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.co.in/");
    driver.findElement(By.linkText("Gmail")).click();
	}

}
