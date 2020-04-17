package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseBehavior{

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    By neptunLogoBtn = By.xpath("//*[@id=\"site-header\"]/div[2]/div/div[1]/a/img");
    By sqLanguageBtn = By.id("ctl00_ctl00_ctl00_cmscontent_ctl00_btnsq-AL");
    By produktetBtn = By.id("neptunMain");

    public void clickOnLogo() {
        clickOn(neptunLogoBtn);
    }

    public void clickOnSQ() {
        clickOn(sqLanguageBtn);
    }

    public String getProduktetText() {
        return getTextFromElement(produktetBtn);
    }

}
