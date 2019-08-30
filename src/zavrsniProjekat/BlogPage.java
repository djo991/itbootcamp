package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogPage extends BaseClass{
	
	
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
	
	private static List <WebElement> navigationMenu() {
		return driver.findElements(By.cssSelector("ul#menu-menu li"));
	}
	
	private static List <WebElement> socialNetworks() {
		return driver.findElements(By.cssSelector("a.shareitem"));
	}
	
	private static Select archivesDropdown() {
		Select drp = new Select(driver.findElement(By.name("archive-dropdown")));
		return drp;
	}
	
	private static WebElement searchBox() {
		return driver.findElement(By.cssSelector("input#s"));
	}
	
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("input#searchsubmit"));
	}
	
	private static List<WebElement> searchResults() {
		return driver.findElements(By.cssSelector("div#content div.post"));
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
	
	public void size() {
		System.out.println(navigationMenu().size());
	}
	
	public void clickNavigationMenuOption(Integer i) {
		navigationMenu().get(i).click();
	}
	
	public void clickFacebook() {
		socialNetworks().get(0).click();
	}
	
	public void clickTwitter() {
		socialNetworks().get(1).click();
	}
	
	//Month YEAR (i.e. August 2014)
	public void selectFromDropdown(String s) {
		archivesDropdown().selectByVisibleText(s);
	}
	
	public void enterQuerySearchBox(String s) {
		searchBox().sendKeys(s);
	}
	
	public void clickSearchButton() {
		searchButton().click();
	}
	
	public void clickSearchResult(Integer i) {
		searchResults().get(i).click();
	}
	
	
}
