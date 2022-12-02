package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginNegative extends AbstractClass{

		//Lokatoriai

		By fieldName = By.xpath("/html/body/div/form/div/input[1]");
		By fieldPsw = By.xpath("/html/body/div/form/div/input[2]");
		By buttonLogIn = By.xpath("/html/body/div/form/div/button");
		
		//Konstruktorius
		
		public loginNegative(WebDriver driver) {
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
		
}