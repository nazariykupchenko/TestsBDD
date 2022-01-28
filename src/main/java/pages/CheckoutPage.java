package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

  @FindBy(id = "sc-buy-box-ptc-button")
  private WebElement proceedToCheckoutButton;
  @FindBy(css = "#sw-gtc")
  private WebElement goToCartButton;
  @FindBy(css = "div.a-section.a-spacing-none.a-padding-none")
  private WebElement addToCartPopupHeader;

  public CheckoutPage(WebDriver driver) {
    super(driver);
  }

  public String getAddToCartPopupHeaderText() {
    return addToCartPopupHeader.getText();
  }

  public boolean isGoToCartButtonVisible() {
    return goToCartButton.isDisplayed();
  }

  public boolean isProceedToCheckoutButtonVisible() {
    return proceedToCheckoutButton.isDisplayed();
  }
}
