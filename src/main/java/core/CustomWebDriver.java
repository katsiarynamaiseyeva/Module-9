package core;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

public class CustomWebDriver implements WebDriver, JavascriptExecutor, TakesScreenshot {

  private WebDriver driver;
  private Actions actions;

  public CustomWebDriver(WebDriver driver) {
    this.driver = driver;
    actions = new Actions(driver);
  }

  @Override
  public void get(String s) {
    System.out.println("Get url: " + s);
    driver.get(s);
  }

  @Override
  public String getCurrentUrl() {
    System.out.println("Get current url");
    return driver.getCurrentUrl();
  }

  @Override
  public String getTitle() {
    String title = driver.getTitle();
    System.out.println("Got title: " + title);
    return title;
  }

  @Override
  public List<WebElement> findElements(By by) {
    List<WebElement> webElementList = driver.findElements(by);
    System.out.println("Got " + webElementList.size() + " elements");
    return webElementList;
  }

  @Override
  public WebElement findElement(By by) {
    System.out.println("Find element: " + by);
    return driver.findElement(by);
  }

  @Override
  public String getPageSource() {
    System.out.println("Get page source");
    return driver.getPageSource();
  }

  @Override
  public void close() {
    System.out.println("Driver closes");
    driver.close();
  }

  @Override
  public void quit() {
    System.out.println("Driver quits");
    driver.quit();
  }

  @Override
  public Set<String> getWindowHandles() {
    System.out.println("Get window handles");
    return driver.getWindowHandles();
  }

  @Override
  public String getWindowHandle() {
    System.out.println("Get window handle");
    return driver.getWindowHandle();
  }

  @Override
  public TargetLocator switchTo() {
    System.out.println("Switch to");
    return driver.switchTo();
  }

  @Override
  public Navigation navigate() {
    System.out.println("Navigate");
    return driver.navigate();
  }

  @Override
  public Options manage() {
    return driver.manage();
  }

  @Override
  public Object executeScript(String s, Object... objects) {
    System.out.println("Execute script");
    return ((JavascriptExecutor) driver).executeScript(s, objects);
  }

  @Override
  public Object executeAsyncScript(String s, Object... objects) {
    System.out.println("Execute async script");
    return ((JavascriptExecutor) driver).executeAsyncScript(s, objects);
  }

  @Override
  public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
    return ((TakesScreenshot) driver).getScreenshotAs(outputType);
  }
}
