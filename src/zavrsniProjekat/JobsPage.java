package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class JobsPage extends BaseClass{
	
	
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
	
	private static WebElement searchBox() {
		return driver.findElement(By.cssSelector("input#q"));
	}
	
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("a#btn_search_jobs"));
	}
	
	private static WebElement advancedButton() {
		return driver.findElement(By.cssSelector("a#link_show_advanced_search"));
	}
	
	private static List <WebElement> jobListEven() {
		return driver.findElements(By.cssSelector("table#jobs_table tr.resumator_even_row"));
	}
	
	private static List <WebElement> jobListOdd() {
		return driver.findElements(By.cssSelector("table#jobs_table tr.resumator_odd_row"));
	}
	
	private static List <WebElement> jobList() {
		return driver.findElements(By.cssSelector("table#jobs_table tr td a"));
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
	
	public void switchToIframe() {
		driver.switchTo().frame(driver.findElement(By.id("resumator-job-frame")));
	}
	
	public void enterSearchQuery(String s) {
		searchBox().click();
		searchBox().sendKeys(s);
	}
	
	public void countJobsAdd() {
		System.out.println(jobListEven().size() + jobListOdd().size());
	}
	
	public void countJobs() {
		System.out.println(jobList().size());
	}
	
	public void clickSearch() {
		searchButton().click();
	}
	
	public void clickAdvanced() {
		advancedButton().click();
	}
	
	public void clickJob(Integer i) {
		jobList().get(i).click();
	}
	
}