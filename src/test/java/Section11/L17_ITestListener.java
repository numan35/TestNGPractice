package Section11;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class L17_ITestListener implements ITestListener {


    public void onTestFailure(ITestResult result) {
        System.out.println("Test has failed. This message is from ITestListener.");
    }


}
