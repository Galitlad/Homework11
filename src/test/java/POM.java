import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class POM {

    public static WebDriver driver;


    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/WebCalculator");
    }

    @Test
    public void test01(){

        driver.findElement(Constants.Button3).click();
        driver.findElement(Constants.ButtonAdd).click();
        driver.findElement(Constants.Button7).click();
        driver.findElement(Constants.ButtonEqual).click();

      WebElement result = driver.findElement(Constants.ButtonScreen);

        Assert.assertEquals(Constants.num, result.getText());

      System.out.println("The result is " + result.getText() +" the int variable is " +Constants.number);
    }
}
