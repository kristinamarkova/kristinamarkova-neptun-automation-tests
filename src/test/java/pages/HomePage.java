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
    By sqLanguage = By.id("ctl00_ctl00_ctl00_cmscontent_ctl00_btnsq-AL");
    By produktetBtn = By.id("neptunMain");
    By goToLogin = By.xpath("//*[@id=\"affix5\"]/div/div[1]/div[1]/a");
    By username = By.xpath("//div[2]/div[2]/div/div[2]/div/form/fieldset/div[1]/input");
    By password = By.xpath("//div[2]/div[2]/div/div[2]/div/form/fieldset/div[2]/input");
    By rememberMe = By.xpath("//div[2]/div[2]/div/div[2]/div/form/fieldset/div[3]/input");
    By loginBtn = By.xpath("//div[2]/div[2]/div/div[2]/div/form/fieldset/button");
    By goToRegister = By.xpath("//div/div[3]/p/a");
    By name = By.xpath("//div/div[2]/div[2]/div[2]/div/form/fieldset/div[1]/input");
    By lastName = By.xpath("//div/div[2]/div[2]/div[2]/div/form/fieldset/div[2]/input");
    By emailRgstr = By.id("Email"); // On user registration form
    By passwordRgstr = By.id("password");
    By confirmPassword = By.xpath("//div[2]/div[2]/div[2]/div/form/fieldset/div[5]/input");
    By registerBtn = By.id("registerButton");
    By verifyRegister = By.xpath("//div[2]/div[2]/div/div/p[2]"); // With this element we verify successful registration
    By forgotPassword = By.xpath("//div/div[3]/a");
    By inputEmail = By.xpath("//div[2]/div[2]/div/div/div/div/form/fieldset/div[1]/input"); // On the Forgot Password page
    By forgotPassSubmit = By.xpath("//div[2]/div[2]/div/div/div/div/form/fieldset/div[2]/button");
    By forgotPassConfigmation = By.xpath(""); // With this element we verify successful submit for forgotten password


    public void clickOnLogo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(neptunLogo)).click();
    }

    public void clickOnSQ() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sqLanguage)).click();
    }

    public String getProduktetText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(produktetBtn)).getText();
    }

    public void clickOnLoginBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(goToLogin)).click();
    }

    public void goToRegister() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(goToRegister)).click();
    }

    public void inputName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.name)).sendKeys(name);
    }

    public void inputLastName(String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.lastName)).sendKeys(lastName);
    }

    public void inputEmailAddress(String myEmail) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailRgstr)).sendKeys(myEmail);
    }

    public void inputPass1(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordRgstr)).sendKeys(password);
    }

    public void inputPass2(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPassword)).sendKeys(password);
    }

    public void register() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerBtn)).click();
    }

    public String  verifyRegister() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(verifyRegister)).getText();
    }

    public void goToForgotPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPassword)).click();
    }

    public void inputEmailForgPass() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail)).click();
    }

    public void submitEmailForgotPAss() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPassSubmit)).click();
    }

    public String verifyForgotPass() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPassword)).getText();
    }







    public void inputUsername() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys("kristinamarkova");
    }

    public void inputPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("MyPassword");
    }
    public void rememberMe() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(rememberMe)).click();
    }

    public void login() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn)).click();
    }

}
