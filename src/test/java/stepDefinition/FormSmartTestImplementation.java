package stepDefinition;

import action.Base;
import formSmartPages.Contact_Form;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
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
    @And("user fills out the form")

    public void user_fills_out_the_form() { //Using global properties file to provide data
        // Write code here that turns the phrase above into concrete actions
       pSendKeys(cf.pFirstName(),pRead_Properties_Files("firstname"));
       pSendKeys(cf.pLastName(),pRead_Properties_Files("lastname"));
       pSendKeys(cf.pEmail(),pRead_Properties_Files("email"));
       //pSelect_Handle(cf.pSubject());
        pSendKeys(cf.pInquiry(),pRead_Properties_Files("inquiry"));
    }

    @Given("user is in form hompage")
    public void user_is_in_form_hompage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on the hompage");
    }
    @Then("user fills the form with {string},{string},{string},{string}")
    public void user_fills_the_form_with(String firstname, String lastname, String email,String inquiry) {
        // Write code here that turns the phrase above into concrete actions
        waitForElementToBeVisible(cf.pFirstName());
        pSendKeys(cf.pFirstName(),firstname);
        waitForElementToBeVisible(cf.pLastName());
        pSendKeys(cf.pLastName(),lastname);
        waitForElementToBeVisible(cf.pEmail());
        pSendKeys(cf.pEmail(),email);
        //pSelect_Handle(cf.pSubject(),subject);
        waitForElementToBeVisible(cf.pInquiry());
        pSendKeys(cf.pInquiry(),inquiry);
    }

    @After
    public void quitDriver(){
        quit();
    }
}
