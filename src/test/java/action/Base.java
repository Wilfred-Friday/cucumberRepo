package action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public WebDriver driver = null;

    public void setDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //return driver;
    }

    public void quit(){
        driver.quit();
    }

    public void setUrl() {
        driver.get(pRead_Properties_Files("url"));
    }

    public void pSendKeys(By element){
        driver.findElement(element).sendKeys();
    }

    public boolean pClick()
    {
        boolean flag = false;
        try{
            //driver.findElement(by).sendKeys(input);
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public String pRead_Properties_Files(String key){
        String flag = null;
        try{
            Properties prop = new Properties();
            prop.load(new FileInputStream(System.getProperty("user.dir")+"/Global.properties"));
            flag = prop.getProperty(key);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;

    }

    public WebElement element(By locator) {
        return driver.findElement(locator);
    }


    public boolean scroll(By element)
    {
        boolean flag = false;
        try{
            waitForElementToBeVisible(element);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element(element));
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public void getIframe(){
        driver.switchTo().frame(0);
    }

    public void quitIframe(){
        driver.switchTo().defaultContent();
    }


    protected void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }



}


