package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LendingPage {
    public WebDriver driver;

    public LendingPage(WebDriver driver){
        this.driver =  driver;
    }
    private By search = By.xpath("//input[@type='search']");
    private By productName = By.cssSelector("h4.product-name");

    public void searchItem(String name){
    driver.findElement(search).sendKeys(name);
    }

    public void selectTopDealsPage(){
        driver.findElement(By.linkText("Top Deals")).click();
    }
}
