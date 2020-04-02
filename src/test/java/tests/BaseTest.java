package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.Browser;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    public HomePage homePage;

    private static final int TIMEOUT = 20;
    private static final String URL = "https://www.neptun.mk/";

    @BeforeMethod
    public void open_browser() {
        String br = System.getProperty("browser", "CHROME");
        Browser browser = Browser.valueOf(br);
        switch (browser){
//            case CHROME:
//                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kristina.Markova\\IdeaProjects\\neptun-automation-tests\\src\\test\\resources\\drivers\\chromedriver.exe");
//                driver = new ChromeDriver();
//                break;
            case IE:
                System.setProperty("webdriver.ie.driver", "C:\\Users\\Kristina.Markova\\IdeaProjects\\neptun-automation-tests\\src\\test\\resources\\drivers\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kristina.Markova\\IdeaProjects\\neptun-automation-tests\\src\\test\\resources\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kristina.Markova\\IdeaProjects\\neptun-automation-tests\\src\\test\\resources\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, TIMEOUT);

        homePage = new HomePage(driver, wait);

        driver.get(URL);
    }

    @AfterMethod
    public void close_browser() {
        driver.close();
    }

}
