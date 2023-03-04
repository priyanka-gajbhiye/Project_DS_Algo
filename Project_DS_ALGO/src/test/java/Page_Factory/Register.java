package Page_Factory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigfileReader;
import utilities.ScreenShots_Utils;
import utilities.registerExcelReader;

public class Register {
	
	public static WebDriver driver=BrowserManager.getdriver();
	String url=ConfigfileReader.getApplicationUrl();
	registerExcelReader RER = new registerExcelReader();
	
	@FindBy (xpath  = "//a/button") WebElement getstarted ;
	@FindBy (xpath = "//a[text()=' Register ']") WebElement registerlink;
	@FindBy (xpath = "//input[@name='username']")static WebElement username;
	@FindBy (xpath = "//input[@name='password1']") WebElement password ;
	@FindBy (xpath = "//input[@name='password2']") WebElement confirmpassword;
	@FindBy (xpath = "//input[@value='Register']") WebElement registerbtn;
	@FindBy (xpath = "//a[text()='Sign out']") WebElement Signout;
	
	public Register() {
		PageFactory.initElements(driver, this);
	}
	public void url() {
		driver.get(url);
	}
	public void getstarted() {
	   	getstarted.click();		
	   }
	public void register() {
		registerlink.click();
	}
	public void emptyfeilds() throws Exception {
		registerbtn.click();
		Thread.sleep(2000);
		
	}
	
	public void takescreenshot(String filename) throws Exception {
		ScreenShots_Utils.capturescreenshots(driver,filename);
	}
	
	public void invalidusernameonly() throws Exception {
	   	String excelusername=RER.getregisterusername(1); 	
	   	username.sendKeys(excelusername);
	   	Thread.sleep(3000);	
	   }
	public void registerclick() throws Exception {
		registerbtn.click();
			
	}
	public void invalidpassword() throws Exception {
		String excelusername=RER.getregisterusername(2); 	
	   	username.sendKeys(excelusername);
	   	String excelpassword=RER.getregisterpassword(2); 	
	   	password.sendKeys(excelpassword);
	   	Thread.sleep(2000);	
	   	
	   }
	public void mismatchdata() throws Exception {
		String excelusername=RER.getregisterusername(3); 	
	   	username.sendKeys(excelusername);
	   	String excelpassword=RER.getregisterpassword(3); 	
	   	password.sendKeys(excelpassword);
	   	String excelconfirmpassword=RER.getregisterconfirmpassword(3); 	
	   	confirmpassword.sendKeys(excelconfirmpassword);
	   	Thread.sleep(2000);	
	   }
	public void validdata() throws Exception {
		String excelusername=RER.getregisterusername(4); 	
	   	username.sendKeys(excelusername);
	   	String excelpassword=RER.getregisterpassword(4); 	
	   	password.sendKeys(excelpassword);
	   	String excelconfirmpassword=RER.getregisterconfirmpassword(4); 	
	   	confirmpassword.sendKeys(excelconfirmpassword);
	   	Thread.sleep(3000);	
	   }
	public void signout() {
		Signout.click();
	}

	
	

}
