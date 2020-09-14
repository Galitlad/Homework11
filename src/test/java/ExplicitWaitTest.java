import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitTest {

    private static WebDriver driver;
    private static WebDriverWait wait;


    @BeforeClass
    public static void OpenChromeBrowser()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://dgotlieb.github.io/Selenium/synchronization");
    }

    @Test
    public void test01_renderButton() {

        wait.until(ExpectedConditions.elementToBeClickable(By.id("rendered"))).click();

        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish2"))).getText());

    }

}
