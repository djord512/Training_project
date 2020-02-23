package Com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Try3 {

WebDriver driver;

@FindBy(xpath="//*[@id=\"ap_email\"]")
WebElement Email;


@FindBy(xpath="//*[@id=\"continue\"]")
WebElement singin;

@FindBy(xpath="//*[@id=\"ap_password\"]")
WebElement Password;

	
public Try3(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
	
	public void part1() {
		Email.sendKeys("dorina@gmail.com");
	}
	
	public void part2() {
		Password.sendKeys("kitcat");
	}
	
	
	public void part3() {
		singin.click();
		
}
}