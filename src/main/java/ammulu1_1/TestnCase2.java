package ammulu1_1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestnCase2 {
	WebDriver Browser;
	WebDriverWait wait;
	@BeforeClass
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tnvmk\\OneDrive\\Desktop\\drivers\\chromedriver.exe");
		Browser=new ChromeDriver();
		wait=new WebDriverWait(Browser,60);
		Browser.manage().window().maximize();
		
	}
	@AfterClass
	public void shutdown() {
		Browser.close();
		Browser.quit();
		
	}
	@Test
	public void VerifyOrangeHRM() {
		Browser.get("http://apps.qaplanet.in/hrm/login.php");
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//verify homepage
		assertEquals(Browser.getTitle(),"OrangeHRM - New Level of HR Management");
		Reporter.log("homepage is displayed");
		//create Webelement for username,password,
		WebElement UName=Browser.findElement(By.name("txtUserName"));
		WebElement Pass=Browser.findElement(By.name("txtPassword"));
		//verify Uname and pass
		assertTrue(UName.isDisplayed() && Pass.isDisplayed());
		Reporter.log("Username and password displayed");
		//type username and password
		String username="qaplanet1";
		UName.sendKeys(username);
		Pass.sendKeys("lab1");
		//click on login
		Browser.findElement(By.name("Submit")).click();
		//wait for orangehrm
		wait.until(ExpectedConditions.titleIs("OrangeHRM"));
		//verify orangehrm page
		assertEquals(Browser.getTitle(),"OrangeHRM");
		Reporter.log("OrangeHRM page is displayed");
		//get welcomtext
		String Swel=Browser.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
		//verify welcomtext
		assertEquals(Swel,"Welcome "+username);
		Reporter.log("Welcome"+username+"is displayed");
		//click on logout
		Browser.findElement(By.linkText("Logout")).click();
		//wait for homepage
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//verify homepage
		assertEquals(Browser.getTitle(),"OrangeHRM - New Level of HR Management");
		Reporter.log("home page is displayed and signoff is successfull");
		
		


		
		
	}
		
	
	
	

}
