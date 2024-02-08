package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.browserHelper.getDriver;

public class homeStep {

    private static WebDriver driver = getDriver();
    private static WebElement element;

    private static WebElement heading() {
        element = driver.findElement(By.className("main-header"));
//        element = driver.findElement(By.xpath("//div[contains(@class, 'main-header') and text() = "+ head +"]"));
        return element;
    }

    private static WebElement leftNav(String nav) {
        element = driver.findElement(By.xpath("//span[contains(@class, 'text') and text() = '"+ nav +"']"));
        return element;
    }

    private static WebElement btnRadioButton() {
        element = driver.findElement(By.xpath("//span[contains(@class, 'text') and text() = 'Radio Button']"));
        return element;
    }

 // FUNCTIONS

 // STEPS
    @Then("^I click left nav button - (.*)")
    public static void click_nav(String nav) throws Throwable{
        leftNav(nav).click();
    }

    @Then("^I see heading - (.*)")
    public static void title(String title) throws Throwable{
        assert(heading().isDisplayed());
        System.out.println("Page Heading = " + heading().getText());
    }


}