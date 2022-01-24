package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "sc-buy-box-ptc-button")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//*[@id='sw-gtc']/span")
    private WebElement goToCartButton;

    @FindBy(css = "span.a-size-medium-plus.a-color-base.sw-atc-text a-text-bold")
    private WebElement addToCartPopupHeader;


    public String getAddToCartPopupHeaderText(){
        return addToCartPopupHeader.getText();
    }

    public boolean isGoToCartButtonVisible(){
        return goToCartButton.isDisplayed();
    }

    public boolean isProceedToCheckoutButtonVisible(){
        return proceedToCheckoutButton.isDisplayed();
    }
}
