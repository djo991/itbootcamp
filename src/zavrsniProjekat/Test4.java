package zavrsniProjekat;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test4 extends BaseTest {
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
		final String NEWPAGE = "https://archive.org/details/opensource_audio";
		
		driver.get(pa.HOME_PAGE);
		// 4
		ho.selectSearchBox();
		Assert.assertTrue(ho.SearchOption(2).isDisplayed()==true);
		ho.searchCentralBox("qa");
		ho.clickGoButton();
		ho.urlContains("qa");
		String b = ho.getCurrentURL();
		Assert.assertTrue(b.contains("?query=qa"));
		System.out.println("woowowowowow");
		//5
		driver.get(pa.HOME_PAGE);
		ho.clickUpload();
		ho.urlToContain("create");
		String s = driver.findElement(By.cssSelector("body.navia")).getText();
		System.out.println(s);
		String a = s.replaceAll("[^a-zA-Z]", "");
		System.out.println(a);
		Assert.assertTrue(a.contains("LoginorSignup"));
		System.out.println("whadda fuuu");
		
		
	}
}
