package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LocatorsOfPage1 {
 public WebElement register_loc(WebDriver drv){
  return drv.findElement(By.className("ico-register"));
 }
 public WebElement chooce_male(WebDriver drv){

  return drv.findElement(By.id("gender-male"));
 }
 public WebElement enter_first_name(WebDriver drv){

  return drv.findElement(By.id("FirstName"));
 }
 public WebElement enter_last_name(WebDriver drv){

  return drv.findElement(By.id("LastName"));
 }

 public WebElement enter_main(WebDriver drv){
  return drv.findElement(By.id("Email"));

 }
public WebElement enter_pass(WebDriver drv){

  return drv.findElement(By.id("Password"));
}
 public WebElement confirm_pass(WebDriver drv){

  return drv.findElement(By.id("ConfirmPassword"));
 }
 public  WebElement clicking_regist(WebDriver drv){
  return drv.findElement(By.id("register-button"));
 }
}
