package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigfileReader;

public class Graph {
	
	public static WebDriver driver=BrowserManager.getdriver();
	String homeurl = ConfigfileReader.getHomePage();
	String graphbackurl= ConfigfileReader.getgraphprevious();
	
	@FindBy (xpath="//a[text()='Get Started'][@href='graph']") WebElement getstartedgraph;
	@FindBy (xpath="//ul//a[text()='Graph']") WebElement graphbtn;
	@FindBy (xpath = "//a[text()='Try here>>>']") WebElement tryhere;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea" )WebElement textcode;
	@FindBy (xpath= "//button[text()='Run']") WebElement runbtn;
	@FindBy (xpath = "//a[text()='Graph Representations']") WebElement graphRepresentation;
	@FindBy (xpath = "//a[text()='Sign out']") WebElement Signout;
	
		public Graph() {
	PageFactory.initElements(driver,this);
		}
		
		public void getstartedgraph() {
			getstartedgraph.click();
		}
		public void Graphbtn(){
	graphbtn.click();
		}
		
		public void tryhere() {
	tryhere.click();
		}
		
		public void print() {
	textcode.sendKeys("print'Graph'");
		}
		
		public void run() throws Exception {
	runbtn.click();
	Thread.sleep(1000);
		}
		
		public void back() {
			driver.get(graphbackurl);
		}
		public void Gpresentation() {
	graphRepresentation.click();
		}
		public void tryGpresentation() {
	tryhere.click();
		}
		public void printcode() {
	textcode.sendKeys("print'Graph Representation'");
		}
		public void runbtn() throws Exception {
	runbtn.click();
	Thread.sleep(1000);
		}
		public void homepage() {
			driver.get(homeurl);
		}
		public void signout() {
			Signout.click();
		}
		
		}



