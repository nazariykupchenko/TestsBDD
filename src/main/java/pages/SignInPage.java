package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "auth-email-missing-alert")
    private WebElement alertMessage;

    @FindBy(className = "a-button-input")
    private WebElement continueButton;

    @FindBy(id = "ap_email")
    private WebElement loginField;

    @FindBy(id = "auth-error-message-box")
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
