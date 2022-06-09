package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertTest {
    public WebDriver Driver;

    @Test
    public void registerTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get("http://demo.automationtesting.in/Index.html");
        Driver.manage().window().maximize();

        WebElement skipSignIn = Driver.findElement(By.id("btn2"));
        skipSignIn.click();

        String expectedPage = "Register";
        String actualPage = Driver.getTitle();
        Assert.assertTrue("The expected page was not displayed", expectedPage.equals(actualPage));

        WebElement switchElement = Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action = new Actions(Driver);
        action.moveToElement(switchElement).build().perform();

        WebElement alertsElement = Driver.findElement(By.xpath("//a[text()='Alerts']"));
        alertsElement.click();

        Driver.navigate().to("http://demo.automationtesting.in/Alerts.html");

    }
}
