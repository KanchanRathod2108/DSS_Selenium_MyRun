package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass1 {

	public class PomDemo1 {

	     @FindBy(name="q")  //Annotation
	     private WebElement SEARCH;//Encapsulation
	     
	     @FindBy(name="btnK")
	     private WebElement SButton;
	     
	   //  WebElement abc = driver.findElement(By.id("abc123"));
	     //abc.click();
	    
	    public PomDemo1(WebDriver driver)
	    {
	        PageFactory.initElements(driver,this) ;
	    }
	    
	    
	    public void search() {
	      
	      SEARCH.sendKeys("Selenium");

	            }
	    
	    public void sbutton() {
	      SButton.click();
	    }

	}

	}


