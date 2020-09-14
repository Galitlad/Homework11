import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NGwebdriverTest {

    private static ChromeDriver driver;


    @BeforeClass
    public static void OpenChromeBrowser()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        NgWebDriver ngWebDriver = new NgWebDriver(driver);
        ngWebDriver.waitForAngularRequestsToFinish();
        driver.get("https://dgotlieb.github.io/AngularJS/main.html");
    }


    @Test

    public void test01_clearFirsName(){


        WebElement element = driver.findElement(ByAngular.model("firstName"));
        element.clear();

        WebElement element2 =driver.findElement(ByAngular.model("firstName"));
        element2.sendKeys("Galit");

        Assert.assertEquals(element.getText(),element2.getText());

    }
}
