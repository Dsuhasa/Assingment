package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3_EnterCompanyName {
	
	Page3_EnterCompanyName(WebDriver driver){	
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='Company-name']")
	private WebElement EN;
	public void NameOfCompany() 
	{
		EN.sendKeys("ACS Solutions");
	}
	@FindBy(xpath="//button[text()='Confirm & Continue']") 
	private WebElement CNM;
	public void confirm() {
		CNM.submit();
		}
}
