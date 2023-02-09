package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM4_Page4_CreateProfile {
	
	POM4_Page4_CreateProfile(WebDriver driver){
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@name='firstName']") 
	private WebElement FN;
	public void FirstName() {
		FN.sendKeys("Suhas");
	}

	@FindBy(xpath="//input[@name='lastName']") 
	private WebElement LN;
	public void LastName() {
		LN.sendKeys("Dhonddev");
	}
	
	@FindBy(xpath="//input[@name='phoneNumber']") 
	private WebElement PN;
	public void PhoneNumber() {
		PN.sendKeys("9309898824");
	}
	@FindBy(xpath="//input[@name='workEmail']") 
	private WebElement EM;
	public void EmailID() {
		EM.sendKeys("suhasd7574@gmail.com");
	}
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Pass;
	public void Password() {
		Pass.sendKeys("Suhas@123");
	}
	
	@FindBy(xpath="//button[text()='Sign Up For Free']") 
	private WebElement SUB;
	public void SingUp() {
		SUB.submit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
