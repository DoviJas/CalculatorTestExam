package Tests;

import org.testng.annotations.Test;

import Pages.loginPage;
import Pages.loginNegative;
import Pages.logOutPage;
import Pages.registerNegative;
import Pages.registerPositive;

public class tests extends testsParameters {
	
	
	@Test(priority=1)
	public void testRegPositive() throws InterruptedException {
		
		registerPositive regPos = new registerPositive(driver);
		logOutPage logOut = new logOutPage(driver);
		regPos.ClickButton();
		regPos.EnterGoodCredentials();
		regPos.ClickBtn();
		regPos.CheckPos();
		logOut.LogOut();
		
	}
	
	@Test(priority=2)
	public void testLoginPage() throws InterruptedException {
		loginPage logPos = new loginPage(driver);
		
		logPos.EnterCredentials("DovileJas","123456d");
		logPos.ClickButtonLogin();
		logPos.CheckOk();
		logPos.LogOut();
		
	}
	
	@Test(priority=3)
	public void testLoginPageNeg() throws Exception {
		loginNegative logNeg = new loginNegative(driver);
		logNeg.EnterCredentials("DoviJas","123456d");
		logNeg.ClickButtonLogin();
	
	}
	
	@Test(priority=4)
	public void testLogOut() throws InterruptedException {
		loginPage logIn = new loginPage(driver);
		logOutPage logOut = new logOutPage(driver);
		logIn.EnterCredentials("DovileJas","123456d");
		logIn.ClickButtonLogin();
		logIn.CheckOk();
		logOut.LogOut();
		
	}
	
	@Test(priority=5)
	public void testRegNeg() throws InterruptedException {
		
		registerNegative regNeg = new registerNegative(driver);
		regNeg.ClickButton();
		regNeg.EnterBadCredentials();
		regNeg.ClickBtn();
		regNeg.checkNeg();
		regNeg.cleanFields();
		
	}
	
}
