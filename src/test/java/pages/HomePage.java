package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By neptunLogo = By.xpath("//*[@id=\"site-header\"]/div[2]/div/div[1]/a/img");

    public void clickOnLogo() {
wait.until(ExpectedConditions.visibilityOfElementLocated(neptunLogo)).click();
    }

}
