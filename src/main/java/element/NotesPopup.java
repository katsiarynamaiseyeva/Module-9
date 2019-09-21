package element;

import core.UiElement;
import org.openqa.selenium.By;
import page.OtherFormsOpenTabPage;

public class NotesPopup extends UiElement {

  private static final By COMMENT_AREA_LOCATOR = By.xpath("//textarea[@name='comment']");
  public static final String BUTTON_TEXT_PATTERN = "//button[text()='%s']";
  public static final String SAVE_BUTTON = String.format(BUTTON_TEXT_PATTERN, "save");

  public OtherFormsOpenTabPage addComment(String commentText) {
    highlightElement(COMMENT_AREA_LOCATOR);
    driver.findElement(COMMENT_AREA_LOCATOR).sendKeys(commentText);
    unHighlightElement(COMMENT_AREA_LOCATOR);
    driver.findElement(By.xpath(SAVE_BUTTON)).click();
    return new OtherFormsOpenTabPage();
  }
}
