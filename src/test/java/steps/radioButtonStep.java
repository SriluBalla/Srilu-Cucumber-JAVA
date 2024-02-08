package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.browserHelper.getDriver;

public class radioButtonStep {

    private static WebDriver driver = getDriver();
    private static WebElement element;

    private static WebElement rbYes() {
        element = driver.findElements(By.className("custom-control-label")).get(0);
        return element;
    }

    private static WebElement rbImpressive() {
        element = driver.findElements(By.className("custom-control-label")).get(1);
        return element;
    }

    private static WebElement txtRadioButton() {
        element = driver.findElement(By.className("text-success"));
        return element;
    }


 // FUNCTIONS

 // STEPS
    @Then("^I click radio button Yes")
    public static void click_yes() throws Throwable{
       rbYes().click();
    }

    @Then("^I click radio button Impressive")
    public static void click_impressive() throws Throwable{
        rbImpressive().click();
    }

    @Then("^I see text for radio button - (.*)")
    public static void viewRB(String radio) throws Throwable{
        assert (txtRadioButton().getText().matches(""+radio+""));
        System.out.println("You have selected = " + txtRadioButton().getText());
    }


}