package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer  {
    int retryLimit=3;
    int count=0;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<retryLimit) {
			count++;
			return true;
		}
		return false;
	}

}
