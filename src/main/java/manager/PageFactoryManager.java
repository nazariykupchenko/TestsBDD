package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {
    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public SignInPage getSignInPage() {
        return new SignInPage(driver);
    }

    public CartPage getCartPage() {
        return new CartPage(driver);
    }

    public LanguagePage getLanguagePage() {
        return new LanguagePage(driver);
    }

    public RegisterPage getRegisterPage() {
        return new RegisterPage(driver);
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(driver);
    }

}
