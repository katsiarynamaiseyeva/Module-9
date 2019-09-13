package core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class UiElement extends RemoteWebElement {

  protected WebDriver driver = DriverContainer.getDriver();

  protected void highlightElement(By locator) {
    WebElement element = driver.findElement(locator);
    ((JavascriptExecutor) driver)
        .executeScript("arguments[0].style.border='3px solid green'", element);
  }

  protected void unHighlightElement(By locator) {
    ((JavascriptExecutor) driver)
        .executeScript("arguments[0].style.border='0px'", driver.findElement(locator));
  }

  public void switchToFrame() {

    driver.switchTo().frame("ADMIN_CENTER").switchTo().frame("SPA_CENTER");
  }
}
