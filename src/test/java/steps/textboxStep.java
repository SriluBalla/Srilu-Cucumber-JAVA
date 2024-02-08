package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.browserHelper.getDriver;

public class textboxStep {

    private static final WebDriver driver = getDriver();
    private static WebElement element;

    private static WebElement btnSubmit() {
        element = driver.findElement(By.id("submit"));
        return element;
    }

    private static WebElement fFullName() {
        element = driver.findElement(By.id("userName"));
        return element;
    }

    private static WebElement fEmail() {
        element = driver.findElement(By.id("userEmail"));
        return element;
    }

    private static WebElement fCurrentAddress() {
        element = driver.findElement(By.id("currentAddress"));
        return element;
    }

    private static WebElement fPermanentAddress() {
        element = driver.findElement(By.id("permanentAddress"));
        return element;
    }

    private static WebElement txtFullName() {
        element = driver.findElement(By.id("name"));
        return element;
    }

    private static WebElement txtEmail() {
        element = driver.findElement(By.id("email"));
        return element;
    }

    private static WebElement txtCurrentAddress() {
        element = driver.findElements(By.id("currentAddress")).get(1);
        return element;
    }

    private static WebElement txtPermanentAddress() {
        element = driver.findElements(By.id("permanentAddress")).get(1);
        return element;
    }


// STEPS
    @Then("^I type in field Full Name (.*)$")
    public static void type_fullName(String name) throws Throwable{
        fFullName().sendKeys(name);
    }

    @And("^I type in field Email (.*)$")
    public static void type_email(String email) throws Throwable{
        fEmail().sendKeys(email);
    }

    @And("^I type in field Current Address (.*)$")
    public static void type_curAddress(String cur) throws Throwable{
        fCurrentAddress().sendKeys(cur);
    }

    @And("^I type in field Permanent Address (.*)$")
    public static void type_permAddress(String perm) throws Throwable{
        fPermanentAddress().sendKeys(perm);
    }

    @And("^I click field Submit$")
    public static void click_Submit() throws Throwable{
        btnSubmit().click();
    }

    @Then("^I see text for Name - (.*)$")
    public static void viewName(String name) throws Throwable{
        assert (txtFullName().getText().matches("Name:"+name+""));
        System.out.println("Full Name = " + txtFullName().getText());
    }

    @And("^I see text for Email - (.*)$")
    public static void viewEmail(String email) throws Throwable{
        assert (txtEmail().getText().matches("Email:"+email+""));
        System.out.println("Email = " + txtEmail().getText());
    }

    @Then("^I see text for Current Address - (.*)$")
    public static void viewCurr(String cur) throws Throwable{
        assert (txtCurrentAddress().getText().matches("Current Address :"+cur+""));
        System.out.println("Current Address = " + txtCurrentAddress().getText());
    }

    @Then("^I see text for Permanent Address - (.*)$")
    public static void viewPerm(String perm) throws Throwable{
        assert (txtPermanentAddress().getText().matches("Permananet Address :"+perm+""));
        System.out.println("Permanent Address = " + txtPermanentAddress().getText());
    }


}