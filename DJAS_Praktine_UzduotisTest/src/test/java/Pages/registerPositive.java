package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class registerPositive extends AbstractClass{

	//Lokatoriai
	By buttonSign = By.xpath("/html/body/div/form/div/h4/a");
	By fieldUser = By.id("username");
	By fieldPsw = By.id("password");
	By fieldConf = By.id("passwordConfirm");
	By errorNote = By.id ("username.errors");
	By buttonSignIn = By.cssSelector("#userForm > button");
	By checkPos = By.cssSelector("body > nav > div > ul.nav.navbar-nav.navbar-right > a");
	String userLoged = "NewPri";
	
	//Konstruktorius
	public registerPositive (WebDriver driver) {
		this.driver=driver;
		}
	
	//Metodai
	public void ClickButton() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(buttonSign).click();
	}
	
	public void EnterGoodCredentials() throws InterruptedException {
		
		 //Tekstą rašo lėčiau į langelius
		String username = "NewPri"; 
		for (int i=0; i<username.length(); i++) {
			driver.findElement(fieldUser).sendKeys(Character.toString(username.charAt(i)));
			Thread.sleep(1000);
		}
		
		String password = "demona";
		for (int i=0; i<password.length(); i++) {
			driver.findElement(fieldPsw).sendKeys(Character.toString(password.charAt(i)));
			Thread.sleep(1000);
		}
	 
		String passwordConf = "demona";
		for (int i=0; i<passwordConf.length(); i++) {
			driver.findElement(fieldConf).sendKeys(Character.toString(passwordConf.charAt(i)));
			Thread.sleep(1000);
		}	
		
	}
	
	public void ClickBtn() {
		driver.findElement(buttonSignIn).click();
	}
	
		//sukuriame metoda
	public void CheckPos() {
		//paimame teksta
		String userLogField = driver.findElement(checkPos).getText();
		//kokio teksto tikimes
		assertEquals("Logout, "+userLoged,userLogField);
		//isvedame i konsole
		System.out.println("Positive testas pavyko! Prisijunge: "  +  userLogField);
	}
	
}
