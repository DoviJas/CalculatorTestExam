package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class registerNegative extends AbstractClass{

	//Lokatoriai
	By buttonNewSign = By.xpath("/html/body/div/form/div/h4/a");
	By fieldNewUser = By.id("username");
	By fieldNewPsw = By.id("password");
	By fieldPswConf = By.id("passwordConfirm");
	By errorNote = By.id ("username.errors");
	By buttonSignUp = By.cssSelector("#userForm > button");
	//pranesimo lokatorius
	By checkNeg = By.cssSelector("#username\\.errors");


	
	//Konstruktorius
	public  registerNegative (WebDriver driver) {
		this.driver=driver;
		}
	
	//Metodai
	
	public void ClickButton() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(buttonNewSign).click();
	}
	
	public void EnterBadCredentials() throws InterruptedException {
		
		 //Tekstą rašo lėčiau į langelius
		String username = "Dddddddddddddddddddddddddddddddddd"; 
		for (int i=0; i<username.length(); i++) {
			driver.findElement(fieldNewUser).sendKeys(Character.toString(username.charAt(i)));
			Thread.sleep(300);
		}
		
		String password = "Demo12";
		for (int i=0; i<password.length(); i++) {
			driver.findElement(fieldNewPsw).sendKeys(Character.toString(password.charAt(i)));
			Thread.sleep(200);
		}
	 
		String passwordConf = "Demo12";
		for (int i=0; i<passwordConf.length(); i++) {
			driver.findElement(fieldPswConf).sendKeys(Character.toString(passwordConf.charAt(i)));
			Thread.sleep(200);
		}	
		
	}
	
	public void ClickBtn() {
		driver.findElement(buttonSignUp).click();
	}
	
	public void cleanFields() {
		driver.findElement(fieldNewUser).clear();
		driver.findElement(fieldNewPsw).clear();
		driver.findElement(fieldPswConf).clear();
		
	}
		//sukuriame metoda
	public void checkNeg() {
		//paimame teksta
		String error = driver.findElement(checkNeg).getText();
		//kokio teksto tikimes
		assertEquals("Privaloma įvesti nuo 3 iki 32 simbolių",error);
		//isvedame i konsole
		System.out.println("Negative testas pavyko! Neprisijunge nes : "  +  error);
	}
	
}
