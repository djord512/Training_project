package Berry;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import Common.Browsers;

public class application extends Browsers implements ITestListener{
	public void onFinish() {
		
	}
	
	public void onTestSuccess(ITestResult result)  {
		try{
			screenshots();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void onTestFailure(ITestResult result) {
		try {
			screenshots();
		} catch (IOException e) {
			e.printStackTrace();
			
		}

	}

	
	

}
