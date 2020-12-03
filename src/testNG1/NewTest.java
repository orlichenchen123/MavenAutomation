package testNG1;

import org.testng.annotations.Test;

import pages.Home;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	Home hp;
	String url = "https://www.timeanddate.com/";
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OrliCohen\\Desktop\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		hp = new Home(driver);
		System.setProperty("org.uncommons.reportng.escape-output", "false");
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get(url);
	}

	@Test
	public void test1() {
		hp.serchCity("israel");
		Reporter.log("is good  test1!!");
		//Reporter.getCurrentTestResult().setStatus(ITestResult.SUCCESS);
	}

	@AfterMethod
	public void afterMethod() {
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
