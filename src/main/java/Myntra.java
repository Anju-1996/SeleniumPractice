import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Myntra {
    WebDriver driver;
    JavascriptExecutor jse;

    @BeforeMethod
    public void InvokeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.myntra.com/");
        //driver.get("http://demo.automationtesting.in/Register.html");
        //driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
    }
    @Test
    public void SearchItem()

{
 driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("dress");
	driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")).click();
    jse=(JavascriptExecutor)driver;
	jse.executeScript("scroll(0,800)");
}
}
