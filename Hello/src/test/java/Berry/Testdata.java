package Berry;

import org.testng.annotations.Test;

import Common.Browsers;
import Com.pages.Try3;
import org.testng.annotations.DataProvider;

public class Testdata extends Browsers {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {  
	  Try3 prime2=new Try3(driver);
	  prime2.part1();
	  prime2.part2();
	  prime2.part3();
	  
			  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "dorinajordanov@gmail.com", "a" },
      new Object[] { "yanabedulina@gmail.com", "b" },
      new Object[] {"hello@yahoo.com", "c"},
    };
  }
}
