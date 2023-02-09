package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1_Page1_ClickButton {
	
	
	public POM1_Page1_ClickButton(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//button[text()='I Understand']") 
	private WebElement BTN;
	public void POp()
	{
		BTN.click();
	}
	
	
	@FindBy(xpath="//button[text()='Access For Free']") private WebElement  CLK;
	public void ClickBTN() 
	{
		
			CLK.click();
	}
	

}
