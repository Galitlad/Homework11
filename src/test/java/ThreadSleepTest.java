import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ThreadSleepTest {

    private static WebDriver driver;
    private static WebDriverWait wait;



    @BeforeClass
    public static void OpenChromeBrowser()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.get("https://dgotlieb.github.io/Selenium/synchronization");
    }

    @Test
    public void test01_showHiddenButton()throws InterruptedException{

        WebElement showButton = driver.findElement(By.id("hidden"));

        showButton.click();

        System.out.println(driver.findElement(By.id("finish1")).getText());

    }


}
