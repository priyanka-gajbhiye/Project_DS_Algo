package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigfileReader;

public class Linked_List {
	public static WebDriver driver=BrowserManager.getdriver();
	String homeurl = ConfigfileReader.getHomePage();
	String linkedlistbackurl= ConfigfileReader.getLinkedListpreviuos();
	
	@FindBy (xpath  = "//a[@href='linked-list']") WebElement getstartedLinkedList ;
	@FindBy (xpath = "//a[@href='introduction']") WebElement introbutton;
	@FindBy (xpath = "//a[text()='Try here>>>']")static WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement printLL ;
	@FindBy (xpath = "//button[text()='Run']") WebElement run;
	@FindBy (xpath = "//a[text()='Creating Linked LIst']")static WebElement createLL;
	
	
	public Linked_List() {
		PageFactory.initElements(driver, this);
	}
	
	public void getstartedLL() {
		getstartedLinkedList.click();
	}
	public void introduction() {
		introbutton.click();
	}
	public void tryhere() {
		tryhere.click();
	}
	public void printstatement() {
		printLL.sendKeys("print'Linked List Introduction'");
	}
	public void run() {
		run.click();
	}
	public void backLL() {
		driver.get(linkedlistbackurl);
	}
	public void createlinkedlist() {
		createLL.click();
	}
	public void tryhereLL() {
		tryhere.click();
	}
	public void printstatementLL() {
		printLL.sendKeys("print'Creating Linked List'");
	}
	public void runLL() throws Exception {
		run.click();
		Thread.sleep(1000);
	}
	public void homeurl() {
		driver.get(homeurl);
	}

}
