package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	WebDriver driver;
	
	public Home(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean serchCity(String cityName) {
		boolean isFind = true;
		WebElement element = driver.findElement(By.xpath("//*[@id='main-content']/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/form/input"));
		element.sendKeys(cityName);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/form/button"));
		element2.click();
		return isFind;
	}

}
