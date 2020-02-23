package Com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"nav-logo\"]/a[1]")
	WebElement TryPrime;
	
	
	public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	
	public void Try() {
		TryPrime.click();

	}

}
