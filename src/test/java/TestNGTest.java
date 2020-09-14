import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGTest {

    private static WebDriver driver;


    @BeforeClass
    public static void OpenChromeBrowser()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();

        driver.get("https://dgotlieb.github.io/WebCalculator");
    }

    @Test
    public void test01_7ButtonDimensions(){
        WebElement element = driver.findElement(Constants.Button7);
        element.click();
        System.out.println(element.getRect().getDimension());
    }

    @Test
    public void test02_6ButtonIsDisplayed(){
        WebElement element = driver.findElement(Constants.Button6);
        element.isDisplayed();


    }

}
