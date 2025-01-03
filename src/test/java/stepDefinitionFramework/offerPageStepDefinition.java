package stepDefinitionFramework;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.LendingPage;
import pageObjects.OfferPage;
import util.TextContextSetup;

import java.util.Iterator;
import java.util.Set;

public class offerPageStepDefinition {
    public TextContextSetup textContextSetup;
    public OfferPage offerPage;
    public LendingPage landingPage;

    public offerPageStepDefinition(TextContextSetup textContextSetup) {
        this.textContextSetup = textContextSetup;
        this.offerPage = textContextSetup.pageObjectManager.getOfferPageObject();
        this.landingPage = textContextSetup.pageObjectManager.getLandingPageObject();
    }

    @Then("^User searched for (.+) shortname in offer page to check if product exist$")
    public void user_searched_for_the_same_shortname_in_offer_page_to_check_if_product_exist(String data) throws InterruptedException {

        switchToOfferPage();
        Assert.assertEquals(Boolean.TRUE, offerPage.VerifyNextButton());
        Assert.assertTrue(offerPage.VerifyNextButton());
        offerPage.searchItem(data);
        Thread.sleep(1000);
    }

    public void switchToOfferPage() {
        landingPage.selectTopDealsPage();
        textContextSetup.genericUtil.switchWindowToChild();

    }
}
