package formSmartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact_Form {

    WebDriver driver;

    public By pFirstName() {
        return By.xpath("//input[@placeholder='Your first name']");
    }

    public By pLastName() {
        return By.xpath("//input[@placeholder='Your last name']");
    }

    public By pEmail() {
        return By.xpath("//input[@placeholder='Your email address']");
    }

    public By pSubject() {
        return By.cssSelector("#u_pPo_338367");
    }

    public By pInquiry() {
        return By.xpath("//textarea[@placeholder='Your comment']");
    }

    public By pForm() {
        return By.id("f");
    }
}
