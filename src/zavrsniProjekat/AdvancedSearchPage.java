package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearchPage extends BaseClass {

	
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
	// -------------------------------
	//

	private static List<WebElement> inputAdvanced1() {
		return driver.findElements(By.cssSelector("form#searchForm div.row input.form-control.input-sm"));
	}
	
	private static List<WebElement> inputAdvanced2() {
		return driver.findElements(By.cssSelector("form#rawform input.form-control.input-sm"));
	}
	
	private static List<WebElement> containSelect() {
		return driver.findElements(By.cssSelector("col-sm-2"));
	}
	
	private static WebElement mediaTypeSelect() {
		return driver.findElement(By.name("mediatype_query"));
	}
	
	private static WebElement dateYear() {
		return driver.findElement(By.name("date_year"));
	}
	
	private static WebElement dateMonth() {
		return driver.findElement(By.name("date_month"));
	}
	
	private static WebElement dateDay() {
		return driver.findElement(By.name("date_day"));
	}
	
	private static WebElement dateFromYear() {
		return driver.findElement(By.name("date_from_year"));
	}
	
	private static WebElement dateFromMonth() {
		return driver.findElement(By.name("date_from_month"));
	}
	
	private static WebElement dateFromDay() {
		return driver.findElement(By.name("date_from_day"));
	}
	
	private static WebElement dateToYear() {
		return driver.findElement(By.name("date_to_year"));
	}
	
	private static WebElement dateToMonth() {
		return driver.findElement(By.name("date_to_month"));
	}
	
	private static WebElement dateToDay() {
		return driver.findElement(By.name("date_to_day"));
	}
	
	private static WebElement MultipleSelectA2() {
		return driver.findElement(By.name("fl[]"));
	}
	
	private static List<WebElement> OrderSelect() {
		return driver.findElements(By.name("sort[]"));
	}
	
	private static List<WebElement> radioSelect() {
		return driver.findElements(By.cssSelector(".table td input:nth-child(1)"));
	}
	
	private static WebElement checkBoxSelect() {
		return driver.findElement(By.cssSelector(".table > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > input:nth-child(2)"));
	}
	
	private static List<WebElement> searchButtons() {
		return driver.findElements(By.cssSelector("input.btn.btn-primary"));
	}
	
	//
	//
	// /$$ /$$ /$$ /$$ /$$
	// | $$$ /$$$ | $$ | $$ | $$
	// | $$$$ /$$$$ /$$$$$$ /$$$$$$ | $$$$$$$ /$$$$$$ /$$$$$$$ /$$$$$$$
	// | $$ $$/$$ $$ /$$__ $$|_ $$_/ | $$__ $$ /$$__ $$ /$$__ $$ /$$_____/
	// | $$ $$$| $$| $$$$$$$$ | $$ | $$ \ $$| $$ \ $$| $$ | $$| $$$$$$
	// | $$\ $ | $$| $$_____/ | $$ /$$| $$ | $$| $$ | $$| $$ | $$ \____ $$
	// | $$ \/ | $$| $$$$$$$ | $$$$/| $$ | $$| $$$$$$/| $$$$$$$ /$$$$$$$/
	// |__/ |__/ \_______/ \___/ |__/ |__/ \______/ \_______/|_______/
	//
	//
	//
	//
	// --------------------------------

	public void clickSearch1() {
		searchButtons().get(0).click();
	}
	
	public void clickSearch2() {
		searchButtons().get(1).click();
	}
} 