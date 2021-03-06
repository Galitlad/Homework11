import org.jetbrains.annotations.TestOnly;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {

    private static WebDriver driver;



    @BeforeClass
    public static void OpenChromeBrowser()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://dgotlieb.github.io/Selenium/synchronization");
    }

    @Test
    public void test01_removeCheckboxButton() {
        WebElement removeButton = driver.findElement(By.id("btn"));
        removeButton.click();
        System.out.println(driver.findElement(By.id("message")).getText());
    }

}

