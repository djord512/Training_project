package Berry;


import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Com.pages.Try3;

public class Home_Page_Test{
WebDriver driver;


@Test
public void f() {
	  driver.navigate().to("https://www.amazon.com");
      Try3 prime2=new Try3(driver);
	  prime2.part1();
	  prime2.part2();
	  prime2.part3();
	
}
}