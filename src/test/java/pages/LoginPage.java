package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseBehavior{

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    By goToLoginBtn = By.xpath("//*[@id=\"affix5\"]/div/div[1]/div[1]/a");
    By username = By.xpath("//div[2]/div[2]/div/div[2]/div/form/fieldset/div[1]/input");
    By password = By.xpath("//div[2]/div[2]/div/div[2]/div/form/fieldset/div[2]/input");
    By rememberMe = By.xpath("//div[2]/div[2]/div/div[2]/div/form/fieldset/div[3]/input");
    By loginBtn = By.xpath("//div[2]/div[2]/div/div[2]/div/form/fieldset/button");
    By goToRegisterBtn = By.xpath("//div/div[3]/p/a");
    By firstName = By.xpath("//div/div[2]/div[2]/div[2]/div/form/fieldset/div[1]/input");
    By lastName = By.xpath("//div/div[2]/div[2]/div[2]/div/form/fieldset/div[2]/input");
    By emailInputField = By.id("Email"); // On user registration form
    By passwordInput = By.id("password");
    By confirmPasswordInput = By.xpath("//div[2]/div[2]/div[2]/div/form/fieldset/div[5]/input");
    By registerBtn = By.id("registerButton");
    By RegisterVerifiableElement = By.xpath("//div[2]/div[2]/div/div/p[2]"); // With this element we verify successful registration
    By forgotPasswordBtn = By.xpath("//div/div[3]/a");
    By inputEmailField = By.xpath("//div[2]/div[2]/div/div/div/div/form/fieldset/div[1]/input"); // On the Forgot Password page
    By forgotPassSubmit = By.xpath("//div[2]/div[2]/div/div/div/div/form/fieldset/div[2]/button");
    By forgotPassVerifiableElement = By.xpath(""); // With this element we verify successful submit for forgotten password

    public void clickOnLoginBtn() {
        clickOn(goToLoginBtn);
    }

    public void goToRegisterForm() {
        clickOn(goToRegisterBtn);
    }

    public void inputFirstName(String nameValue) {
        setInputValue(firstName, nameValue);
    }

    public void inputLastName(String lastNameValue) {
        setInputValue(lastName, lastNameValue);
    }

    public void inputEmailAddress(String emailValue) {
        setInputValue(emailInputField, emailValue);
    }

    public void inputPass(String passwordValue) {
        setInputValue(passwordInput, passwordValue);
    }

    public void inputConfirmPass(String passwordValue) {
        setInputValue(confirmPasswordInput, passwordValue);
    }

    public void clickOnRegisterBtn() {
        clickOn(registerBtn);
    }

    public String getVerifiableTextRegister() {
        return getTextFromElement(RegisterVerifiableElement);
    }

    public void goToForgotPassword() {
        clickOn(forgotPasswordBtn);
    }

    public void inputEmail(String emailValue) {
        setInputValue(inputEmailField, emailValue);
    }

    public void submitEmail() {
        clickOn(forgotPassSubmit);
    }

    public String getVerifiableTextForgotPass() {
        return getTextFromElement(forgotPassVerifiableElement);
    }

    // Need to finish the assertion for this
    public void inputUsername(String usernameValue) {
        setInputValue(username, usernameValue);
    }

    public void inputPassword(String passwordValue) {
        setInputValue(password, passwordValue);
    }

    public void clickOnRememberMe() {
        clickOn(rememberMe);
    }

    public void clickOnLogin() {
        clickOn(loginBtn);
    }

}
