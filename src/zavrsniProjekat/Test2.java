package zavrsniProjekat;

import java.sql.Driver;
import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test2 extends BaseTest {
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
		
		Integer a = ho.getItemCount(0);
		ho.clickTopCollection(0);
		ho.urlToBe(NEWPAGE);
		System.out.println(a);
		System.out.println(ho.getItemResults());
		Assert.assertTrue(Math.abs(a-ho.getItemResults())<=500);
		
		
		
	}
}
