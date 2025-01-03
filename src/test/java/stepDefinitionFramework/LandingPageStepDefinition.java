package stepDefinitionFramework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.w3c.dom.Text;
import pageObjects.LendingPage;
import util.TextContextSetup;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class LandingPageStepDefinition {
    public TextContextSetup textContextSetup;

    public LandingPageStepDefinition(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
    }

    @Given("User in on GreenCart Landing page")
    public void user_in_on_green_cart_landing_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions


    }
    @When("^User searched with shortname (.+) and extracted actual name of the product$")
    public void user_searched_with_shortname_and_extracted_actual_name_of_the_product(String shortName) throws InterruptedException, IOException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(shortName);
        LendingPage landingpage = textContextSetup.pageObjectManager.getLandingPageObject();
        landingpage.searchItem(shortName);

       // textContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
        Thread.sleep(5000);
        String productName = textContextSetup.testBase.WebDriverManager().findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
        System.out.println(productName + " check name");

    }

    @When("User searched for only {string} with no Outline scenario")
    public void userSearchedForOnlyWithNoOutlineScenario(String arg0) {
        System.out.println("Calling out form this method");
    }

}
