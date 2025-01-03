package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

    public WebDriver driver;
    public OfferPage(WebDriver driver) {
        this.driver = driver;
    }

    private By search = By.xpath("//input[@type='search']");
    private By productName = By.cssSelector("h4.product-name");
    private By buttonNext = By.xpath("//*[@aria-label=\"Next\"]");

    public void searchItem(String name){
        driver.findElement(search).sendKeys(name);
    }
    public Boolean VerifyNextButton(){
       return driver.findElement(buttonNext).isDisplayed();
    }

    }
