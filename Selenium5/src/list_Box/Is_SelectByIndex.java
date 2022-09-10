package list_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_SelectByIndex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		WebElement a=driver.findElement(By.id("multiselect"));
		Select s=new Select(a);
		s.selectByIndex(2);
		s.selectByValue("hyundai");
		s.selectByVisibleText("Audi");
		

	}

}
