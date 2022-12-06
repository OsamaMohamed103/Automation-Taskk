package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsOfPage2 {
    public WebElement press_on_login(WebDriver drv2){
            return drv2.findElement(By.className("ico-login"));
    }
public  WebElement enter_email(WebDriver drv2){
        return drv2.findElement(By.id("Email"));
}
public WebElement enter_pass(WebDriver drv2){
        return drv2.findElement(By.id("Password"));

}
public WebElement login_button(WebDriver drv2){
        return drv2.findElement(By.className("login-button"));

}
public WebElement checking_valid_login(WebDriver drv2){
        return drv2.findElement(By.className("ico-logout"));

}
public WebElement checking_invalid_login(WebDriver drv2){
        return drv2.findElement(By.className("message-error"));
}
}
//  It's just part of the project not all the codes of project like small taks hope you find it useful