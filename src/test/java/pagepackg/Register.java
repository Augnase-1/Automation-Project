package pagepackg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
WebDriver driver;

@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
WebElement signUplogin;

@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
WebElement username;

@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
WebElement email;

@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")
WebElement signUp;

public  Register(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void signuplogin() {
	signUplogin.click();
}
public void username() {
	username.sendKeys("Augnase");
}
public void email() {
	email.sendKeys("augnasegeorge@gmail.com");
}
public void signup() {
	signUp.click();
}
}
