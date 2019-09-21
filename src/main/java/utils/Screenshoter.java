package utils;

import core.CustomWebDriver;
import core.DriverSingleton;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

public class Screenshoter {

  private static final String SCREENSHOTS_NAME_TPL = "screenshots/scr";

  public static void takeScreenshot() {
    CustomWebDriver driver = DriverSingleton.getDriver();
    File screenshot = driver.getScreenshotAs(OutputType.FILE);
    try {
      String screenshotName = SCREENSHOTS_NAME_TPL + System.nanoTime() + ".png";
      File copy = new File(screenshotName);
      FileUtils.copyFile(screenshot, copy);
      System.out.println("Saved screenshot: " + screenshotName);
    } catch (IOException e) {
      System.out.println("Failed to make screenshot");
    }
  }
}
