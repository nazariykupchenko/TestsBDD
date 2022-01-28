package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

  @FindBy(id = "navbar-main")
  private WebElement header;
  @FindBy(id = "twotabsearchtextbox")
  private WebElement searchField;
  @FindBy(id = "nav-search-submit-button")
  private WebElement searchButton;
  @FindBy(id = "nav-cart")
  private WebElement cartIcon;
  @FindBy(id = "nav-cart-count")
  private WebElement cartCountIcon;
  @FindBy(id = "nav-link-accountList-nav-line-1")
  private WebElement signInButton;
  @FindBy(id = "nav-logo")
  private WebElement logo;
  @FindBy(id = "nav-xshop")
  private WebElement navigationMenu;
  @FindBy(id = "icp-nav-flyout")
  private WebElement languageIcon;
  @FindBy(id = "nav-global-location-data-modal-action")
  private WebElement locationIcon;
  @FindBy(id = "a-popover-header-1")
  private WebElement changeLocationPopup;
  @FindBy(className = "a-dropdown-container")
  private WebElement dropdownCountryValue;
  @FindBy(css = "span.a-button.a-button-primary")
  private WebElement submitChangeCountryButton;
  @FindBy(css = "div.a-popover-inner.a-lgtbox-vertical-scroll")
  private List<WebElement> countryListIcons;
  @FindBy(css = "i.nav-sprite.hmenu-arrow-next")
  private List<WebElement> sideMenuTitles;
  @FindBy(id = "nav-hamburger-menu")
  private WebElement sideMenuButton;

  public HomePage(WebDriver driver) {
    super(driver);
  }

  public List<WebElement> getSideMenuTitles() {
    return sideMenuTitles;
  }

  public void clickSideMenuButton() {
    sideMenuButton.click();
  }

  public int getAmountOfSideMenuTitles() {
    return sideMenuTitles.size();
  }

  public void openHomePage(String url) {
    driver.get(url);
  }

  public WebElement locationIcon() {
    return locationIcon;
  }

  public void clickSubmitCountryButton() {
    submitChangeCountryButton.click();
  }


  public void clickCountryListOnFirstCountry() {
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

  public void isLocationPopUpVisible() {
    changeLocationPopup.isDisplayed();
  }

  public void clickDropdownCountryMenu() {
    dropdownCountryValue.click();
  }

  public void enterProductNameToSearchField(String productName) {
    searchField.clear();
    searchField.sendKeys(productName);
  }


}
