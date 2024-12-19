package pagepackg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver driver;

@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
WebElement signUplogin;

@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
WebElement email;

@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
WebElement password;

@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/button")
WebElement Login;
public  Login(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void signuplogin() {
	signUplogin.click();
}
public void email() {
	email.sendKeys("augnasegeorge@gmail.com");
}
public void password() {
	password.sendKeys("Augnase@123");
}
public void Login() {
	Login.click();
}
}
