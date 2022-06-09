package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterTest {

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

        WebElement firsNameElement = Driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
        String nameValue = "Bunea";
        firsNameElement.sendKeys(nameValue);

        WebElement lastNameElement = Driver.findElement(By.xpath("//input[@ng-model='LastName']"));
        String lastValue = "Nicolae";
        lastNameElement.sendKeys(lastValue);

        WebElement adressElement = Driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        String addressValue = "Baciu, Stradaa...";
        adressElement.sendKeys(addressValue);

        WebElement emailElement = Driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
        String emailValue = "java@gmail.com";
        emailElement.sendKeys(emailValue);

        WebElement phoneElement = Driver.findElement(By.cssSelector("input[ng-model='Phone']"));
        String phoneValue = "0788 411 566";
        phoneElement.sendKeys(phoneValue);

        WebElement genderElement = Driver.findElement(By.cssSelector("input[value='Male']"));
        genderElement.click();

        WebElement hobbiesElement = Driver.findElement(By.id("checkbox1"));
        hobbiesElement.click();

        WebElement skillsElement = Driver.findElement(By.id("Skills"));
        Select skillsDropdown = new Select(skillsElement);
        skillsDropdown.selectByVisibleText("APIs");

        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement languageElement = Driver.findElement(By.id("msdd"));
        languageElement.click();

        List<WebElement> languageOptions = Driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
        Integer index = 0;
        while (index < languageOptions.size()) {
            if (languageOptions.get(index).getText().equals("English")) {
                languageOptions.get(index).click();
                break;
            }
            index++;
        }
        genderElement.click();

        WebElement CountryElement = Driver.findElement(By.xpath("//span[@role='combobox']"));
        CountryElement.click();

        WebElement SelectCountryElement=Driver.findElement(By.xpath("//input[@role='textbox']"));
        SelectCountryElement.sendKeys("Denmark");
        SelectCountryElement.sendKeys(Keys.ENTER);

        WebElement yearElement = Driver.findElement(By.id("yearbox"));
        Select yearDropDown = new Select(yearElement);
        yearDropDown.selectByValue("1993");

        WebElement monthElement = Driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
        Select monthDropDown = new Select(monthElement);
        monthDropDown.selectByVisibleText("February");

        WebElement dayElement = Driver.findElement(By.id("daybox"));
        Select dayDropDown = new Select(dayElement);
        dayDropDown.selectByValue("26");

        WebElement passwordElement = Driver.findElement(By.id("firstpassword"));
        String passwordValue = "0788 411 566";
        passwordElement.sendKeys(passwordValue);

        WebElement confirmPasswordElement = Driver.findElement(By.id("secondpassword"));
        String confirmPasswordValue = "0788 411 566";
        confirmPasswordElement.sendKeys(confirmPasswordValue);

        WebElement uploadElement = Driver.findElement(By.id("imagesrc"));
        uploadElement.sendKeys("D:\\Poze\\Gura Portitei.jpg");
    }
}






