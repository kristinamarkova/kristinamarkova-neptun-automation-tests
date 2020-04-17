package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseBehavior {
    WebDriver driver;
    WebDriverWait wait;

    public BaseBehavior(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // Clicking on buttons and checkbox elements
    public void clickOn(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
    }

    // Entering values into input field elements
    public void setInputValue(By element, String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).sendKeys(value);
    }

    // Extracting text from any element
    public String getTextFromElement(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element)).getText();
    }

}
