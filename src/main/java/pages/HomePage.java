package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    @FindBy(xpath = "//header[@id='navbar-main']")
    private WebElement header;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@id='nav-cart']")
    private WebElement cartIcon;

    @FindBy(xpath = "//span[@id='nav-cart-count']")
    private WebElement cartCountIcon;

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    private WebElement signInButton;

    @FindBy(xpath = "//div[@id='nav-logo']")
    private WebElement logo;

    @FindBy(xpath = "//div[@id='nav-xshop']")
    private WebElement navigationMenu;

    @FindBy(xpath = "//span[@class='icp-nav-flag icp-nav-flag-us']")
    private WebElement languageIcon;

    @FindBy(xpath = "//span[@id='glow-ingress-line2']")
    private WebElement locationIcon;

    @FindBy(xpath = "//h4[@id='a-popover-header-1']")
    private WebElement changeLocationPopup;

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    private WebElement dropdownCountryValue;

    @FindBy(xpath = "//button[@name='glowDoneButton']")
    private WebElement submitChangeCountryButton;

    @FindBy(xpath = "//li[contains(@role, 'option')]")
    private List<WebElement> countryListIcons;

    public WebElement locationIcon(){
        return locationIcon;
    }

    public void clickSubmitCountryButton(){
        submitChangeCountryButton.click();
    }


    public void clickCountryListOnFirstCountry(){
        countryListIcons.get(0).click();
    }


    public void isHeaderVisible() {
        header.isDisplayed();
    }

    public void isSearchFieldVisible() {
        searchField.isDisplayed();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void isLogoVisible() {
        logo.isDisplayed();
    }

    public void isCartIconVisible() {
        cartIcon.isDisplayed();
    }


    public String getCartCountIconText() {
        return cartCountIcon.getText();
    }

    public void isNavigateMenuVisible() {
        navigationMenu.isDisplayed();
    }

    public void isSignInButtonVisible() {
        signInButton.isDisplayed();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void isLanguageIconVisible() {
        languageIcon.isDisplayed();
    }

    public void clickLanguageIcon() {
        languageIcon.click();
    }

    public void isLocationIconVisible() {
        locationIcon.isDisplayed();
    }

    public void clickLocationIcon() {
        locationIcon.click();
    }

    public void isLocationPopUpVisible(){
        changeLocationPopup.isDisplayed();
    }

    public void clickDropdownCountryMenu(){
        dropdownCountryValue.click();
    }


}
