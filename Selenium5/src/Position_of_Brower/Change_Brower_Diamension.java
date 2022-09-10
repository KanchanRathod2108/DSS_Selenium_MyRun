package Position_of_Brower;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Change_Brower_Diamension {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://gaana.com");
		Dimension dem = new Dimension(150,750);
		driver.manage().window().setSize(dem);
		
		

	}

}
