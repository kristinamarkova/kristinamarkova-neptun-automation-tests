package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void register() {
        loginPage.clickOnLoginBtn();
        loginPage.goToRegisterForm();
        loginPage.inputFirstName("Kristina");
        loginPage.inputLastName("Markova");
        loginPage.inputEmailAddress("kristinamarkova@gmail.com");
        String password = "MyPassword!@#";
        loginPage.inputPass(password);
        loginPage.inputConfirmPass(password);
        loginPage.clickOnRegisterBtn();
        Assert.assertEquals(loginPage.getVerifiableTextRegister(), "Доколку не ја доби е-пораката, провери во спам папката.");
    }
    @Test
    public void forgotPassword() {
        loginPage.clickOnLoginBtn();
        loginPage.goToForgotPassword();
        loginPage.inputEmail("kristinamarkova@gmail.com");
        loginPage.submitEmail();
        Assert.assertEquals(loginPage.getVerifiableTextForgotPass(), "");
    }
    @Test
    public void login() {
        loginPage.clickOnLoginBtn();
        loginPage.inputUsername("kristinamarkova");
        loginPage.inputPassword("MyPassword!@#");
        loginPage.clickOnRememberMe();
        loginPage.clickOnLogin();
    }

}
