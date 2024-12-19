package testpckg;

import org.testng.annotations.Test;

import basepckg.Baseclass;
import pagepackg.AddToCart;
import pagepackg.Login;
import pagepackg.PlaceOrder;
import pagepackg.Register;

public class AddToCartTest extends Baseclass{
	@Test
	public void addtocartTest() throws InterruptedException{
		Register ob=new Register(driver);
		ob.signuplogin();
		ob.username();
		ob.email();
		ob.signup();
		Thread.sleep(4000);
		
		Login lo=new Login(driver);
		lo.signuplogin();
		lo.email();
		lo.password();
		lo.Login();
		Thread.sleep(4000);
		
		AddToCart ad=new AddToCart(driver);
		ad.product();
		ad.scroll();
		ad.addtocart();
	
		PlaceOrder pl=new PlaceOrder(driver);
		pl.windowHandle();
		
		pl.cardetails();
		pl.parentWindow();
}
}

