package formSmartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact_Form {

    WebDriver driver;

    By pFirstName = By.xpath("//input[@id='u_SCn_4607']");
    By pLastName = By.xpath("//input[@id='u_SCn_338354']");
    By pEmail = By.xpath("//input[@id='u_SCn_4608']");
    By pSubject = By.xpath("//select[@id='u_SCn_338367']");
    By pInquiry = By.xpath("//textarea[@id='u_SCn_4609']");

    By pForm = By.xpath("//form[@id='f']");

    public By pFirstName() {
        return By.xpath("//input[@id='u_SCn_4607']");
    }

    public By pLastName() {
        return By.xpath("//input[@id='u_SCn_338354']");
    }

    public By pEmail() {
        return By.xpath("//input[@id='u_SCn_4608']");
    }

    public By pSubject() {
        return By.xpath("//select[@id='u_SCn_338367']");
    }

    public By pInquiry() {
        return By.xpath("//textarea[@id='u_SCn_4609']");
    }

    public By pForm() {
        return By.xpath("//form[@id='f']");
    }
}
