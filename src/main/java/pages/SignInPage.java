package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(text(),'email')]")
    private WebElement alertMessage;

    @FindBy(xpath = "//span[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement loginField;

    @FindBy(xpath = "//div[@id='auth-error-message-box']")
    private WebElement errorMessage;

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public boolean isErrorMessageVisible() {
        return errorMessage.isDisplayed();
    }

    public WebElement getLoginField() {
        return loginField;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public void isLoginFieldVisible() {
        loginField.isDisplayed();
    }

    public void isContinueButtonVisible() {
        continueButton.isDisplayed();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public boolean isAlertMessageVisible() {
        return alertMessage.isDisplayed();
    }

    public void enterKeywordToLoginField(final String keyword) {
        loginField.clear();
        loginField.sendKeys(keyword);
    }


}
