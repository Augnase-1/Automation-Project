package pagepackg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
WebDriver driver;

@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
WebElement Product;

@FindBy(xpath="//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")
WebElement Category;

@FindBy(xpath="//*[@id=\"Women\"]/div/ul/li[1]/a")
WebElement Dress;

@FindBy(xpath="/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a")
WebElement viewproduct;

@FindBy(xpath="/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
WebElement Addtocart;

@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[3]/button")
WebElement continues;

@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
WebElement cart;

@FindBy(xpath="//*[@id=\"susbscribe_email\"]")
WebElement sub;

@FindBy(xpath="//*[@id=\"do_action\"]/div[1]/div/div/a")
WebElement checkout;

 @FindBy(xpath="//*[@id=\"cart_items\"]/div/div[7]/a")
 WebElement placeorder;

public  AddToCart(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void product() {
	Product.click();
}
public void scroll() 
{
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1000)");
}	

public void addtocart() {
	Category.click();
	Dress.click();
	viewproduct.click();
	Addtocart.click();
	continues.click();
	cart.click();
	sub.sendKeys("augnasegeorge@gmail.com");
	checkout.click();
	placeorder.click();
}
}
