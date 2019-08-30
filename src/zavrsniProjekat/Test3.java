package zavrsniProjekat;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;
import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test3 extends BaseTest {
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
		
		ho.clickTextsCategory();
		ho.elementToBeClickable(By.cssSelector("div.row:nth-child(2) > div:nth-child(1) > div:nth-child(1) > a:nth-child(2)"));
		ho.selectFeaturedTexts(0);
		ho.urlToBe("https://archive.org/details/texts");
		String a = ho.getCurrentURL();
		ho.driver.navigate().back();
		ho.selectMediaTypeDetails("Texts");
		String b = ho.getCurrentURL();
		Assert.assertTrue(a.equals(b));
		System.out.println("isto je brate");
		
		
		
	}
}
