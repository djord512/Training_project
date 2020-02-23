package Com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class try_prime {


		WebDriver driver;
		@FindBy(xpath="//*[@id=\"prime-header-CTA\"]/span/input")
		WebElement TryPrimeButton2;


		public try_prime(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		public void Prime() {
			TryPrimeButton2.click();

	}

}
