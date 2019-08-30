package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AboutTopCollectionsPage extends BaseClass {
	private static List<WebElement> contributors() {
		return driver.findElements(By.cssSelector("div.about-box div.items_list.person div a.stealth.boxy-label"));
	}
	private static List<WebElement> graphs() {
			return driver.findElements(By.cssSelector("div.grafs.about-box"));
		}
	
	private static List<WebElement> relatedCollections() {
		return driver.findElements(By.cssSelector("div.topinblock b a"));
	}
	
	private static WebElement tableTopRegions() {
		return driver.findElement(By.cssSelector("table.stats-table"));
	}
}
