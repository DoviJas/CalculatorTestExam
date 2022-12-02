package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginPage extends AbstractClass {
	
		//Lokatoriai
		
		By fieldName = By.xpath("/html/body/div/form/div/input[1]");
		By fieldPsw = By.xpath("/html/body/div/form/div/input[2]");
		By buttonLogIn = By.xpath("/html/body/div/form/div/button");
		By loggedIn = By.cssSelector("body > nav > div > ul.nav.navbar-nav.navbar-right > a");
		By ButtonLogOut = By.xpath("/html/body/nav/div/ul[2]/a");
		//Konstruktorius
		
		public loginPage(WebDriver driver) {
			this.driver=driver;
		}
		
		//Metodai
		
		public void EnterCredentials(String name, String psw) throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(fieldName).sendKeys(name);
			Thread.sleep(2000);
			driver.findElement(fieldPsw).sendKeys(psw);
			
		}
		
		public void ClickButtonLogin( ) throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(buttonLogIn).click();
			Thread.sleep(2000);
		}
		
		public void CheckOk() throws InterruptedException {
			String note = driver.findElement(loggedIn).getText();
			Assert.assertEquals("Logout, DovileJas", note);
			Thread.sleep(2000);
		}
		public void LogOut() throws InterruptedException {
			driver.findElement(ButtonLogOut).click();
			Thread.sleep(2000);
		}
		
}
	