package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MailLoginClass extends BaseClass {
	private static List<WebElement> links() {
		return driver.findElements(By.cssSelector(".container > p:nth-child(1) > b:nth-child(5) a"));
	}

	public void logIn() {
		links().get(0).click();
	}

	public void signUp() {
		links().get(1).click();
	}
}
