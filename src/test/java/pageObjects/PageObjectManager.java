package pageObjects;

import org.openqa.selenium.WebDriver;


//this class is used to create the object of all classes so that we don't have to create them in the Step Defination
public class PageObjectManager {
    public WebDriver driver;
    public LendingPage lendingPage;
    public OfferPage offerPage;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public LendingPage getLandingPageObject(){
         lendingPage = new LendingPage(driver);
         return lendingPage;
    }

    public OfferPage getOfferPageObject(){
        offerPage = new OfferPage(driver);
        return offerPage;
    }
}
