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
    @Test
    public void switchToSq() {
        homePage.clickOnSQ();
        Assert.assertEquals(homePage.getProduktetText(), "PRODUKTET");
    }
    @Test
    public void register() {
        homePage.clickOnLoginBtn();
        homePage.goToRegister();
        homePage.inputName("Kristina");
        homePage.inputLastName("Markova");
        homePage.inputEmailAddress("kristinamarkova@gmail.com");
        String myPassword = "MyPassword!@#";
        homePage.inputPass1(myPassword);
        homePage.inputPass2(myPassword);
        homePage.register();
        Assert.assertEquals(homePage.verifyRegister(), "Доколку не ја доби е-пораката, провери во спам папката.");
    }
    @Test
    public void forgotPassword() {
        homePage.clickOnLoginBtn();
        homePage.goToForgotPassword();
        homePage.inputEmailForgPass();
        homePage.submitEmailForgotPAss();
        Assert.assertEquals(homePage.verifyForgotPass(), "");
    }
    @Test
    public void login() {
        homePage.clickOnLoginBtn();
        homePage.inputUsername();
        homePage.inputPassword();
        homePage.rememberMe();
        homePage.login();
    }
}
