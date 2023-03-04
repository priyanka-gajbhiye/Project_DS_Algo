package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigfileReader;

public class Array {
	
	public static WebDriver driver=BrowserManager.getdriver();
	String homeurl = ConfigfileReader.getHomePage();
	String arraybackurl = ConfigfileReader.getarrayprevious();
	
	@FindBy (xpath = "//a[@href='array']") WebElement arrays;
	@FindBy (xpath = "//a[text()='Arrays in Python']") WebElement arraypython ;
	@FindBy (xpath = "//a[text()='Try here>>>']") WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement printcode ;
	@FindBy (xpath = "//button[text()='Run']") WebElement run;
	@FindBy (xpath = "//a[text()='Practice Questions']") WebElement practicequestion;
	@FindBy (xpath = "//a[text()='Search the array']") WebElement searcharray;
	@FindBy (xpath = "//textarea[@tabindex='0']") WebElement practicequeText;
	
    public Array() {
    	
    	PageFactory.initElements(driver, this);
    }
    
    public void getstartedarray() {
    	arrays.click();
    }
	 public void arrayPython() {
		 arraypython.click();
	 }
    public void tryhere() {
    	tryhere.click();
    }
	public void printcode() {
		printcode.sendKeys("print'Array'");
	}
    public void runaaray() throws Exception {
    	run.click();
    	Thread.sleep(2000);
    }
	 public void back() {
		 driver.get(arraybackurl);
	 }
	public void practisequestion() {
		practicequestion.click();
	}
	
	public void searcharray() {
		searcharray.click();
	}
//	public void cleartextarea() {
//		practicequeText.clear();
//	}
//	public void printpractice() {
//		practicequeText.sendKeys("print'Hello world'");
//	}
//	public void runpracticearray() {
//		run.click();
//	}
	public void homepage() {
		driver.get(homeurl);
	}

}
