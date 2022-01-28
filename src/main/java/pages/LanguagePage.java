package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LanguagePage extends BasePage {

  @FindBy(css = "input[value='es_US']")
  private WebElement secondLanguage;
  @FindBy(id = "icp-btn-save")
  private WebElement saveChangesButton;
  @FindBy(id = "icp-btn-close")
  private WebElement cancelButton;
  @FindBy(css = "div.a-row.a-spacing-mini")
  private List<WebElement> languagesForSelect;

  public LanguagePage(WebDriver driver) {
    super(driver);
  }

  public List<WebElement> getLanguagesForSelect() {
    return languagesForSelect;
  }

  public boolean isLanguagesForSelectVisible() {
    return languagesForSelect.get(0).isDisplayed();
  }

  public void clickSecondLanguage() {
    secondLanguage.click();
  }

  public void clickSaveChangesButton() {
    saveChangesButton.click();
  }

  public void isSaveChangesButtonVisible() {
    saveChangesButton.isDisplayed();
  }

}
