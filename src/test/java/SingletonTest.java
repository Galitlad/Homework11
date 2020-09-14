import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonTest {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            System.setProperty("weddriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
