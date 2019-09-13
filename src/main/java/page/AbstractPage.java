package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static core.DriverContainer.getDriver;

public abstract class AbstractPage {

  protected WebDriver driver;

  private static final int WAIT_FOR_ELEMENT_TIMEOUT_SECONDS = 8;

  public AbstractPage() {
    this.driver = getDriver();
  }

  public void highlightElement(WebDriver driver, WebElement element) {
    String bg = element.getCssValue("backgroundColor");
    JavascriptExecutor js = ((JavascriptExecutor) driver);
    js.executeScript("arguments[0].style.backgroundColor = '" + "yellow" + "'", element);
    js.executeScript("arguments[0].style.backgroundColor = '" + bg + "'", element);
  }

  protected void jsElementClick(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) getDriver();
    js.executeScript("arguments[0].click();", element);
  }
}
