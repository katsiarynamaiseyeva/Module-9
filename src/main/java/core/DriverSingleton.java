package core;

import config.GlobalConfig;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class DriverSingleton {

  private static CustomWebDriver driver;

  public static CustomWebDriver getDriver() {
    if (Objects.isNull(driver)) {
      driver = initDriver();
    }
    return driver;
  }

  private static CustomWebDriver initDriver() {

    CustomWebDriver webDriver = null;
    DesiredCapabilities capabilities;
    String seleniumServerUrl = GlobalConfig.getSeleniumServerUrl();

    switch (GlobalConfig.getBrowserType()) {
      case CHROME:
        capabilities = DesiredCapabilities.chrome();
        capabilities.setPlatform(Platform.WINDOWS);
        try {
          webDriver =
              new CustomWebDriver(new RemoteWebDriver(new URL(seleniumServerUrl), capabilities));
        } catch (MalformedURLException e) {
          System.out.println("Can't connect to remote WebDriver with capabilities " + capabilities);
        }
        break;
      case FIREFOX:
        capabilities = DesiredCapabilities.firefox();
        capabilities.setPlatform(Platform.WINDOWS);
        try {
          webDriver =
              new CustomWebDriver(new RemoteWebDriver(new URL(seleniumServerUrl), capabilities));
        } catch (MalformedURLException e) {
          System.out.println("Can't connect to remote WebDriver with capabilities " + capabilities);
        }
        break;
    }
    webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    webDriver.manage().window().maximize();
    return webDriver;
  }
}
