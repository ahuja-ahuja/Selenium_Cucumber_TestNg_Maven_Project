package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

    @Given("USER IN ON NET BANKING PAGE")
    public void user_in_on_net_banking_page() {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("User login into appication with {string} and password {string}")
    public void user_login_into_appication_with_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string +" "+string2);
    }
    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("User login into application with")
    public void user_login_into_application_with(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @Given("USER IN ON Practice PAGE")
    public void user_in_on_practice_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Given("Login to application")
    public void login_to_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login to app");
    }
    @When("User details are provided")
    public void user_details_are_provided() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User details are provided");
    }
    @Then("Page is displayed")
    public void page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Title is displayed");

    }

}
