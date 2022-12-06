package StepDef;
import Locators.LocatorsOfPage2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class D01_LoginStepDef {
    ChromeDriver driver2;
    LocatorsOfPage2 loc2 = new LocatorsOfPage2();
    @Given("user go to website")
    public void open_the_brows() {
        WebDriverManager.chromedriver().setup();
        driver2 = new ChromeDriver();
        driver2.navigate().to("https://demo.nopcommerce.com/");
    }
    @When("user press on login")
    public void click_on_login_buttonn(){
        loc2.press_on_login(driver2).click();
    }
    @And("user login with valid username and password")
    public void enter_valid_email_and_pass(){
        loc2.enter_email(driver2).sendKeys("test@example.comu");
        loc2.enter_pass(driver2).sendKeys(" P@ssw0rdP@ssw0rd");
    }
    @And("user login with invalid username and password")
    public void invalid_login(){
        loc2.enter_email(driver2).sendKeys("test@example.comuee");
        loc2.enter_pass(driver2).sendKeys(" P@ssw0rdP@ssw0rdd");
    }
  @And("user press on login button")
    public void user_press_login_btn(){
    loc2.login_button(driver2).click();
    }
   @Then("user login to system successfully")
    public void check_valid_loginn(){
        Assert.assertTrue(loc2.checking_valid_login(driver2).isDisplayed());
    }

    //////////////////////////////////////////////////////////////////////// invalid login

    @Then("user can't login to the system")
    public void check_invalid_login(){
    Assert.assertTrue(loc2.checking_invalid_login(driver2).isDisplayed());

    }
}

      // It's just part of the project not all the codes of project like small taks hope you find it useful