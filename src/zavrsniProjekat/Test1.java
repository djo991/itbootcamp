package zavrsniProjekat;

import java.sql.Driver;
import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test1 extends BaseTest {
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
		
		driver.get(pa.HOME_PAGE);
		Assert.assertTrue(ho.countTopCollections().size()>=20);
		System.out.println(ho.countTopCollections().size());
		
		Assert.assertTrue(ho.countItems()==ho.countTopCollections().size());
		System.out.println("HEHE IKS DE");
		
		Thread.sleep(2000);
	}
}
