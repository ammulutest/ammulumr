package ammulu1_1;

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

public class TesngCase1 {
	WebDriver Brow;
	WebDriverWait wait;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tnvmk\\OneDrive\\Desktop\\drivers\\chromedriver.exe");
		Brow=new ChromeDriver();
		wait=new WebDriverWait(Brow,60);
		Brow.manage().window().maximize();
		
	}
	@AfterClass
	public void shutdown()
	{
		Brow.close();
		Brow.quit();
	}
	@Test
	public void VerifyOrangeHRM() {
		Brow.get("http://apps.qaplanet.in/hrm/login.php");
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//verify hompage
		if(Brow.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			Reporter.log("Home Page Displayed");
		}
		else {
			Reporter.log("Home Page is not Displayed");
		}
		//create Webelement for username,password,login,clear
		WebElement UName=Brow.findElement(By.name("txtUserName"));
		WebElement Pass=Brow.findElement(By.name("txtPassword"));
		WebElement login=Brow.findElement(By.name("Submit"));
		WebElement clear=Brow.findElement(By.name("clear"));
		//verify username and pass
		if(UName.isDisplayed() && Pass.isDisplayed()) {
			Reporter.log("Username and password is displayed");
			
		}
		//verify login and clear
		if(login.isDisplayed() && clear.isDisplayed()) {
			Reporter.log("login and clear is displayed");
		}
		//type UName Pass
		UName.sendKeys("qaplanet1");
		Pass.sendKeys("lab1");
		//click on login
		login.click();
		//wait for orange hrm
		wait.until(ExpectedConditions.titleIs("OrangeHRM"));
		//verify orangehrm
		if(Brow.getTitle().equals("OrangeHRM")) {
			Reporter.log("OrangeHrm is displayed");
		}
		//get welcome Text
		String Swel=Brow.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
		//verify Welcomtext
		if(Swel.equals("Welcome qaplanet1")) {
			Reporter.log("Welcome qaplanet1 is displayed");
			}
		//create Webelement for logout
		WebElement logout=Brow.findElement(By.linkText("Logout"));
		//click on logout
		logout.click();
		//wait for homepage
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//verify homepage
		if(Brow.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			Reporter.log("homepage is displayed");
		}
		
		
		
	}
	
	

}

