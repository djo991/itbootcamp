package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CollectionsSortPage extends BaseClass {

	private static List <WebElement> collectionSorting() {
		return driver.findElements(By.cssSelector("span.big-label.blue-pop a"));
	}
	
	private static WebElement AboutButton() {
		return driver.findElement(By.cssSelector("a#tabby-about-finder"));
	}
	
	private static List<WebElement> radioButtons() {
		return driver.findElements(By.cssSelector("div.search-options.js-search-options.is-open label input"));
	}
	
	private static List<WebElement> moreLinks() {
		return driver.findElements(By.cssSelector("div.columns-facets a:nth-child(2)"));
	}
	
	private static WebElement searchThisCollectionBar() {
		return driver.findElement(By.cssSelector("input.form-control.input-sm.searchlist"));
	}
	
	private static List <WebElement> videoResults() {
		return driver.findElements(By.cssSelector("div.tile-img"));
	}
	
	private static List <WebElement> moreCheckboxes() {
		return driver.findElements(By.cssSelector("div#morf-page div.facell input"));
	}
	
	private static List<WebElement> playOptions() {
		return driver.findElements(By.cssSelector("div.col-xs-1.col-sm-2.welcome-right a"));
	}
	
	private static WebElement videoCount() {
		return driver.findElement(By.cssSelector("results_count"));
	}
	
	public void selectSorting(Integer i) {
		if (collectionSorting().get(i).isDisplayed()==true) {
		collectionSorting().get(i).click();
	} else {
		System.out.println("Element is not displayed.");
	}
}
	public void clickAbout() {
		AboutButton().click();
	}
	
	public void printCount() {
		System.out.println(videoCount().getText());
	}
}