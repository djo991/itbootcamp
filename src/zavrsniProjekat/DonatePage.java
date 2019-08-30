package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DonatePage extends BaseClass{
	
	
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
	
	private static List <WebElement> donationAmount() {
		return driver.findElements(By.cssSelector("ul.donation-radio-list.donationlevel li"));
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
	
	public void selectDonationAmount(Integer i, String s) {
		if (i!=7 & i<7) {
			donationAmount().get(i).click();
		} else if (i==7) {
			donationAmount().get(i).click();
			driver.findElement(By.cssSelector("input#amount_custom")).sendKeys(s);
		} else if (i>7){
			System.out.println("Index out of number or invalid amount enter for 'Other Amount'");
		}
	}
	
}
