package zavrsniProjekat;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test6 extends BaseTest {
	@Test
	public void Test1a() throws InterruptedException {
		PAGE_URLs pa = new PAGE_URLs();
		HomePage ho = new HomePage();
		BlogPage bl = new  BlogPage();
		ContactPage co = new ContactPage();
		ProjectsPage proj = new ProjectsPage();
		DonatePage don = new DonatePage();
		JobsPage job = new JobsPage();
		PeoplePage peo = new PeoplePage();
		SignInPage sign = new SignInPage();
		final String NEWPAGE = "https://archive.org/details/opensource_audio";
		
		driver.get(pa.HOME_PAGE);
		ho.clickSignIn();
		ho.urlToBe(pa.LOGIN);
		Assert.assertTrue((driver.findElement(By.cssSelector("span.reset-password a")).isDisplayed())==true);
		sign.signUpClick();
		ho.elementToAppear(By.cssSelector("div.terms a"));
		sign.clickTermsOfUse();
		sign.switchTabs();
		sign.urlContains("terms");
		Assert.assertTrue(sign.getCurrentURL().contains("terms"));
		
	}
}
