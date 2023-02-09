package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2_Page2_SelectOption{
	
	@FindBy(xpath="//button[text()='Create your Career Page!']")
	private WebElement OTIN;
	public void Options() {
		
		OTIN.click();
	}
	
	public POM2_Page2_SelectOption(WebDriver driver ){
		
		PageFactory.initElements(driver, this);
	}

}
