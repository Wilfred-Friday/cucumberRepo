package stepDefinition;

import action.Base;
import devlabPages.Login_Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DevlabTestimplementation extends Base{
    public WebDriver driver;
    Login_Page lg = new Login_Page();

    @Before
    public void setUp(){
        //driver = setDriver();
       // setBrowser(driver);
    }

    @Given("user lunch devlab application")
    public void user_lunch_devlab_application() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("user validate the home page title")
    public void user_validate_the_home_page_title() {
        // Write code here that turns the phrase above into concrete actions
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Title is correct","Devlabs Alliance offers consulting and workshops on AI, RPA, DevOps, Big Data, Block Chain, Automation.",title);

    }
    @Then("user validate devlab logo")
    public void user_validate_devlab_logo() {
        // Write code here that turns the phrase above into concrete actions
        WebElement logo = driver.findElement(By.xpath("(//img[@alt='DevLabs Alliance Logo'])[1]"));
        Assert.assertTrue("Logo is not present",logo.isDisplayed());
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        WebElement loginbtn = driver.findElement(By.xpath("//div[@class='flex justify-between']/div/button"));
        if(loginbtn.isDisplayed()){
            loginbtn.click();
        }else {
            System.out.println("Login button not displayed");
        }

    }
    @Then("Login pop up screen displays")
    public void login_pop_up_screen_displays() {
        // Write code here that turns the phrase above into concrete actions
        WebElement loginBanner = driver.findElement(By.xpath("(//span[text()='Login'])[1]"));
        Assert.assertTrue("Banner is not present",loginBanner.isDisplayed());
    }
    @When("user gives input as user name and password")
    public void user_gives_input_as_user_name_and_password() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@id=':r3:']")).sendKeys(pRead_Properties_Files("email"));
        driver.findElement(By.xpath("//input[@id='outlined-adornment-password']")).sendKeys(pRead_Properties_Files("password"));
    }
    @Then("user close the login pop up")
    public void user_close_the_login_pop_up() {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().refresh();
    }



    @After
    public void tearDown(){
        //driver.quit();
    }


    @Then("user close de application")
    public void user_close_de_application() {
        // Write code here that turns the phrase above into concrete actions
        //driver.quit();
    }
}
