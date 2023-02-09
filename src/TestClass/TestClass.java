package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestClass {

	public WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\109\\chromedriver_win32\\chromedriver.exe");
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expertia.ai");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		
		
		POM1_Page1_ClickButton	page1 =new POM1_Page1_ClickButton(driver);
		page1.POp();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		page1.ClickBTN();
		
		POM2_Page2_SelectOption page2 =new POM2_Page2_SelectOption(driver);
		page2.Options();
			
		Page3_EnterCompanyName	page3=new Page3_EnterCompanyName(driver);
		page3.NameOfCompany();
		Thread.sleep(2000);
		WebElement 	Auto=driver.findElement(By.xpath("//div[@class='cursor-pointer hover:bg-[#e7f0fe]']"));
		Auto.click();
		
		Thread.sleep(3000);
		page3.confirm();
		
		POM4_Page4_CreateProfile page4=new POM4_Page4_CreateProfile(driver);
		page4.FirstName();
		page4.LastName();
		page4.PhoneNumber();
		page4.EmailID();
		page4.Password();
		page4.SingUp();
		
		
		
		
		
		
	}

}
