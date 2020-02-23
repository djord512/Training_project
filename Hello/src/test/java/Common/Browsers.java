package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Browsers {
	public static WebDriver driver;
	
  @BeforeClass
  @Parameters({"url","browser"})
	  public void beforeClass(String website, String br) {
		  if(br.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver","/Users/dorinajordanov/Downloads/chromedriver");
			  driver= new ChromeDriver();
			  driver.navigate().to(website);
		  }else if (br.equalsIgnoreCase("firefox")) {
		 
		  System.setProperty("webdriver.gecko.driver","/Users/dorinajordanov/Downloads/geckodriver");
		  driver= new FirefoxDriver();
		  driver.navigate().to(website);
		  
		  }else {
			  System.out.println("Please check name");
		  
  }
	  }

  @AfterClass
  public void afterClass() {
  }
 public void screenshots() throws IOException {	  
	  File shots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(shots, new File("/Users/dorinajordanov/Desktop/PeopleNTechSchool/"+timestamp()+"screen.png"));
  }
  public  String timestamp() {
	  return new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
  }

}
