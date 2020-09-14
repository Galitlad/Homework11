import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class NavigationTest {

    private static WebDriver driver;
    private static String name = "Galit";
    private static String accept = "Confirmed";







    @BeforeClass
    public static void OpenChromeBrowser()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galit\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/Navigation/Navigation.html");
    }

    @Test
    public void test01_showAlertButton() {
        WebElement element = driver.findElement(By.id("MyAlert"));
        element.click();

        System.out.println(driver.switchTo().alert().getText());
    }


    @Test
    public void test02_showPromptButton(){

        WebElement element =driver.findElement(By.id("MyPrompt"));
        element.click();
        driver.switchTo().alert().sendKeys("Galit");
        driver.switchTo().alert().accept();

        WebElement elementOutput = driver.findElement(By.id("output"));

        Assert.assertEquals(name,elementOutput.getText());
        System.out.println("My name is " + name +" and the prompt button name is " + elementOutput.getText());
    }

    @Test
    public void test03_showConfirmBoxButton(){

        WebElement element = driver.findElement(By.id("MyConfirm"));
        element.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement elementOutput = driver.findElement(By.id("output"));

        Assert.assertEquals(accept,elementOutput.getText());
        System.out.println("Press on OK button's text is " + accept +" and the output button's text is " + elementOutput.getText());

    }

    @Test
    public void test04_openNewTab(){
        String getWindow = driver.getWindowHandle();
        WebElement element = driver.findElement(By.id("openNewTab"));
        element.click();

        driver.switchTo().window(getWindow);


    }
    @Test
    public void test05_openNewWindow(){
        String getWindow = driver.getWindowHandle();

        WebElement element = driver.findElement(By.tagName("a"));
        element.click();

        driver.switchTo().window(getWindow);

    }
}
