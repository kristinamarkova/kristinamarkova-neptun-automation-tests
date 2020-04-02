package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    @Test
    public void clickOnLogo() {
        homePage.clickOnLogo();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.neptun.mk/");
    }
}
