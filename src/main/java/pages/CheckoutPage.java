package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

  @FindBy(id = "sc-buy-box-ptc-button")
  private WebElement proceedToCheckoutButton;
  @FindBy(xpath = "//*[@id=\"sw-gtc\"]/span")
  private WebElement goToCartButton;
  @FindBy(xpath = "//*[@id=\"sw-atc-details-single-container\"]/div[2]/div[1]/span")
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
