package zavrsniProjekat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class SignInPage extends BaseClass{
	
	
	//
	//
	//	 /$$$$$$$$ /$$                                               /$$             
	//	| $$_____/| $$                                              | $$             
	//	| $$      | $$  /$$$$$$  /$$$$$$/$$$$   /$$$$$$  /$$$$$$$  /$$$$$$   /$$$$$$$
	//	| $$$$$   | $$ /$$__  $$| $$_  $$_  $$ /$$__  $$| $$__  $$|_  $$_/  /$$_____/
	//	| $$__/   | $$| $$$$$$$$| $$ \ $$ \ $$| $$$$$$$$| $$  \ $$  | $$   |  $$$$$$ 
	//	| $$      | $$| $$_____/| $$ | $$ | $$| $$_____/| $$  | $$  | $$ /$$\____  $$
	//	| $$$$$$$$| $$|  $$$$$$$| $$ | $$ | $$|  $$$$$$$| $$  | $$  |  $$$$//$$$$$$$/
	//	|________/|__/ \_______/|__/ |__/ |__/ \_______/|__/  |__/   \___/ |_______/ 
	//	                                                                             
	//	                                                                             
	//	                                                                             
	//
	// -------------------------------
	//
	
	private static WebElement signUpButton() {
		return driver.findElement(By.cssSelector(".login-header > p:nth-child(3) > a:nth-child(1)"));
	}
	
	private static WebElement emailField() {
		return driver.findElement(By.cssSelector(".input-email"));
	}
	
	private static WebElement passwordField() {
		return driver.findElement(By.cssSelector(".input-password"));
	}
	
	private static WebElement forgotPassword() {
		return driver.findElement(By.cssSelector("span.reset-password a"));
	}
	
	private static WebElement checkboxRemeber() {
		return driver.findElement(By.cssSelector("input.input-checkbox"));
	}
	
	private static WebElement signInButton() {
		return driver.findElement(By.cssSelector("input.btn.btn-primary.btn-submit"));
	}
	
	private static WebElement termsOfUse() {
		return driver.findElement(By.cssSelector("div.terms a"));
	}
	
	//
	//
	//	 /$$      /$$             /$$     /$$                       /$$          
	//	| $$$    /$$$            | $$    | $$                      | $$          
	//	| $$$$  /$$$$  /$$$$$$  /$$$$$$  | $$$$$$$   /$$$$$$   /$$$$$$$  /$$$$$$$
	//	| $$ $$/$$ $$ /$$__  $$|_  $$_/  | $$__  $$ /$$__  $$ /$$__  $$ /$$_____/
	//	| $$  $$$| $$| $$$$$$$$  | $$    | $$  \ $$| $$  \ $$| $$  | $$|  $$$$$$ 
	//	| $$\  $ | $$| $$_____/  | $$ /$$| $$  | $$| $$  | $$| $$  | $$ \____  $$
	//	| $$ \/  | $$|  $$$$$$$  |  $$$$/| $$  | $$|  $$$$$$/|  $$$$$$$ /$$$$$$$/
	//	|__/     |__/ \_______/   \___/  |__/  |__/ \______/  \_______/|_______/ 
	//	                                                                         
	//	                                                                         
	//	                                                                         
	//
	// --------------------------------
	
	public void signIn() {
		signInButton().click();
	}
	
	public void enterEmail(String s) {
		emailField().sendKeys(s);
	}
	
	public void enterPassword(String s) {
		passwordField().sendKeys(s);
	}
	
	public void signUpClick() {
		signUpButton().click();
	}
	
	public void clickTermsOfUse() {
		termsOfUse().click();
	}
}