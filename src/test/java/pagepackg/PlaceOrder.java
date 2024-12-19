package pagepackg;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
WebDriver driver;
 
 @FindBy(xpath="//*[@id=\"payment-form\"]/div[1]/div/input")
 WebElement cardname;
 
 @FindBy(xpath="//*[@id=\"payment-form\"]/div[2]/div/input")
 WebElement cardno;
 
 @FindBy(xpath="//*[@id=\"payment-form\"]/div[3]/div[1]/input")
 WebElement CVC;
 
 @FindBy(xpath="//*[@id=\"payment-form\"]/div[3]/div[2]/input")
 WebElement month;
 
 @FindBy(xpath="//*[@id=\"payment-form\"]/div[3]/div[3]/input")
 WebElement year;
 
 @FindBy(xpath="//*[@id=\"submit\"]")
 WebElement submit;
 
 public  PlaceOrder(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
 public void windowHandle() {
	 Set<String>windowSet = driver.getWindowHandles();
	 for(String window:windowSet)
	 {
		 driver.switchTo().window(window);
	 }
	 }

public void cardetails() {
cardname.sendKeys("sbi");
cardno.sendKeys("2145556");
CVC.sendKeys("345");
month.sendKeys("01");
year.sendKeys("2023");
submit.click();}
public void parentWindow()
{
	String homeWindow = driver.getWindowHandle();
			driver.switchTo().window(homeWindow);
}
}

