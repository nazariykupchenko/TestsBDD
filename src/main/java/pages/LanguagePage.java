package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LanguagePage extends BasePage{

    @FindBy(xpath = "//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div")
    private WebElement secondLanguage;

    @FindBy(xpath = "//span[@id='icp-btn-save']")
    private WebElement saveChangesButton;

    @FindBy(xpath = "//a[@id='icp-btn-close-announce']")
    private WebElement cancelButton;

    @FindBy(xpath = "//div[contains(@class, 'a-row a-spacing-mini')]")
    private WebElement languagesForSelect;




    public LanguagePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLanguagesForSelect(){
        return languagesForSelect;
    }

    public boolean isLanguagesForSelectVisible(){
        return languagesForSelect.isDisplayed();
    }

    public void clickSecondLanguage(){
        secondLanguage.click();
    }

    public void clickSaveChangesButton(){
        saveChangesButton.click();
    }
    public void isSaveChangesButtonVisible(){
        saveChangesButton.isDisplayed();
    }

}
