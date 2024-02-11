package stepDefinition;

import action.Base;
import formSmartPages.Contact_Form;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class FormSmartTestImplementation extends Base {

Contact_Form cf = new Contact_Form();


    @Before
    public void browserSetUp(){
        setDriver();
        setUrl();
    }


    @Given("user lunch form application")
    public void user_lunch_form_application() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user scroll to the contact form")
    public void user_scroll_to_the_contact_form() {
        // Write code here that turns the phrase above into concrete actions
       getIframe();
       scroll(cf.pForm());

    }
    @Then("user fills out the form")
    public void user_fills_out_the_form() {
        // Write code here that turns the phrase above into concrete actions
        pSendKeys(cf.pFirstName());


    }
    @When("user finish he closes the application")
    public void user_finish_he_closes_the_application() {
        // Write code here that turns the phrase above into concrete actions

    }

    @After
    public void quitDriver(){
        //quit();
    }
}
