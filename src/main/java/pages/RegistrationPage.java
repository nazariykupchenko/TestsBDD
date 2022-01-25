package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "ap_customer_name")
    private WebElement nameField;

    @FindBy(id = "ap_email")
    private WebElement emailAddressField;

    @FindBy(id = "ap_password")
    private WebElement passwordField;

    @FindBy(id = "ap_password_check")
    private WebElement passwordConfirmationField;

    @FindBy(id = "continue")
    private WebElement createNewAccountOnAmazonButton;

    @FindBy(id = "auth-email-invalid-email-alert")
    private WebElement warningMessage;

    public WebElement getWarningMessage(){
        return warningMessage;
    }
    public boolean isWarningMessageVisible(){
        return warningMessage.isDisplayed();
    }

    public void isNameFieldVisible(){
        nameField.isDisplayed();
    }
    public void isEmailAddressFieldVisible(){
        emailAddressField.isDisplayed();
    }
    public void isPasswordFieldVisible(){
        passwordField.isDisplayed();
    }
    public boolean isCreateNewAccountOnAmazonButtonVisible(){
        return createNewAccountOnAmazonButton.isDisplayed();
    }
    public void enterNameToNameField(final String name){
        nameField.sendKeys(name);
    }
    public void enterEmailToEmailAddressField(final String email){
        emailAddressField.sendKeys(email);
    }
    public void enterPasswordToPasswordField(final String password){
        passwordField.sendKeys(password);
    }
    public void enterPasswordToPasswordConfirmationField(final String password){
        nameField.sendKeys(password);
    }
    public void clickCreateNewAccountOnAmazonButton(){
        createNewAccountOnAmazonButton.click();
    }

}
