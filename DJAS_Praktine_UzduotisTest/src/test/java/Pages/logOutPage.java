package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class logOutPage extends AbstractClass {

	//Lokatoriai
	By ButtonLogOut = By.xpath("/html/body/nav/div/ul[2]/a");
	
	//Konstruktorius
	public logOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Metodai
	public void LogOut() throws InterruptedException {
		driver.findElement(ButtonLogOut).click();
		Thread.sleep(2000);
	}
}