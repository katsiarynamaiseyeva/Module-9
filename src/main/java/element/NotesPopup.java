package element;

import core.UiElement;
import org.openqa.selenium.By;
import page.OtherFormsOpenTabPage;

public class NotesPopup extends UiElement {

  private static final By COMMENT_AREA_LOCATOR = By.xpath("//textarea[@name='comment']");
  private static final By SAVE_BUTTON_LOCATOR = By.xpath("//button[text()='save']");

  public OtherFormsOpenTabPage addComment(String commentText) {
    highlightElement(COMMENT_AREA_LOCATOR);
    driver.findElement(COMMENT_AREA_LOCATOR).sendKeys(commentText);
    unHighlightElement(COMMENT_AREA_LOCATOR);
    driver.findElement(SAVE_BUTTON_LOCATOR).click();
    return new OtherFormsOpenTabPage();
  }
}
