package StepDef;

import Locators.LocatorsOfPage1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D01_registerStepDef {

    LocatorsOfPage1 loc1 = new LocatorsOfPage1();
    ChromeDriver driver;

    @Given("user should open brwoser and navigate to the website")

  public void open_the_borwser(){
        WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();
         driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("click register button")
    public void click_register_button(){

        loc1.register_loc(driver).click();

    }
@And("select gender type")
    public void selec_gender(){
        loc1.chooce_male(driver).click();
}
@And("user enter first name")
    public void enter_first_name(){
        loc1.enter_first_name(driver).sendKeys("automation");
}
@And("user enter last name")
    public void enter_last_name(){
        loc1.enter_last_name(driver).sendKeys("tester");
    }
@And("user enter date of birth")
    public void user_enter_Date_of_birth(){
    Select sel = new Select(driver.findElement(By.name("DateOfBirthDay")));
    sel.selectByValue("2");
    Select sel2 = new Select(driver.findElement(By.name("DateOfBirthMonth")));
    sel2.selectByValue("6");
    Select sel3 = new Select(driver.findElement(By.name("DateOfBirthYear")));
    sel3.selectByValue("1912");
}
@And("user enter  email")
    public void user_Enter_main(){
        loc1.enter_main(driver).sendKeys("test@example.com"+'g');

}
@And("user fills password field")
    public void user_enter_password(){
        loc1.enter_pass(driver).sendKeys(" P@ssw0rdP@ssw0rd");
}
@And("user fills confirm password")
    public void confirm_pass(){
    loc1.confirm_pass(driver).sendKeys(" P@ssw0rdP@ssw0rd");
}
@And("user click on register button")
   public void click_on_regist(){
        loc1.clicking_regist(driver).click();
}
@Then("success message is displayed")
public void checking_validation(){
    Assert.assertTrue(driver.findElement(By.className("result")).isDisplayed());
}
}
      // It's just part of the project not all the codes of project like small taks hope you find it useful