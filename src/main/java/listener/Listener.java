package listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import utils.Screenshoter;

public class Listener extends TestListenerAdapter {

  @Override
  public void onTestFailure(ITestResult tr) {
    System.out.println("Test " + tr.getName() + " is failed");
    Screenshoter.takeScreenshot();
  }

  @Override
  public void onTestSkipped(ITestResult tr) {
    System.out.println("Test " + tr.getName() + " is skipped");
  }

  @Override
  public void onTestSuccess(ITestResult tr) {
    System.out.println("Test " + tr.getName() + " is passed");
  }
}
