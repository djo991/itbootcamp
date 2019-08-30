package zavrsniProjekat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePageTopMenu extends BaseClass {

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
	// TOP MENU - WEB

	private static WebElement blogLinkTop() {
		return driver.findElement(By.cssSelector("div.wayback-txt"));
	}

	private static WebElement wayBackMachineLogo() {
		return driver.findElement(By.cssSelector("div.col-sm-6:nth-child(1) > a:nth-child(1)"));
	}

	private static WebElement wayBackMachineSearchBox() {
		return driver.findElement(By.cssSelector("input#nav-wb-url"));
	}

	// ======================================================================
	// TOP MENU - TEXTS

	private static WebElement booksToBorrowLogo() {
		return driver.findElement(By.cssSelector(
				"div.row:nth-child(2) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1)"));
	}

	private static WebElement booksToBorrowLink() {
		return driver.findElement(By.cssSelector(
				"div.row:nth-child(2) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}

	private static WebElement openLibraryLogo() {
		return driver.findElement(By.cssSelector(
				"div.row:nth-child(2) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}

	private static WebElement openLibraryLink() {
		return driver.findElement(By.cssSelector(
				"div.row:nth-child(2) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}

	private static List<WebElement> FeaturedTextsList() {
		return driver.findElements(By.cssSelector("div.row:nth-child(2) > div:nth-child(1) > div:nth-child(1) a"));
	}

	private static List<WebElement> TopLibrariesList() {
		return driver.findElements(By.cssSelector("div.row:nth-child(2) > div:nth-child(3) > div:nth-child(1) a"));
	}

	private static List<WebElement> AdditionalArchives() {
		return driver.findElements(By.cssSelector("div.row:nth-child(2) > div:nth-child(5) > div:nth-child(1) a"));
	}

	// ===============================================================
	// TOP MENU - VIDEO

	private static WebElement TVNewsLogo() {
		return driver.findElement(By.cssSelector(
				"div.toprow:nth-child(3) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) a"));
	}

	private static WebElement TVNewsLink() {
		return driver.findElement(By.cssSelector(
				"div.toprow:nth-child(3) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}

	private static WebElement Understanding911Logo() {
		return driver.findElement(By.cssSelector(
				"div.toprow:nth-child(3) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}

	private static WebElement Understanding911Link() {
		return driver.findElement(By.cssSelector(
				"div.toprow:nth-child(3) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}

	private static List<WebElement> featuredVideosList() {
		return driver.findElements(By.cssSelector("div.toprow:nth-child(3) > div:nth-child(1) > div:nth-child(1) a"));
	}

	private static List<WebElement> TopVideoCategories() {
		return driver.findElements(By.cssSelector("div.toprow:nth-child(3) > div:nth-child(3) > div:nth-child(1) a"));
	}

	private static List<WebElement> AdditionalVideoCategories() {
		return driver.findElements(By.cssSelector("div.toprow:nth-child(3) > div:nth-child(5) > div:nth-child(1) a"));
	}

	// ===============================================================
	// TOP MENU - AUDIO

	private static WebElement LiveMusicArchiveLogo() {
		return driver.findElement(By.cssSelector(
				"div.row:nth-child(4) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}

	private static WebElement LiveMusicArchiveLink() {
		return driver.findElement(By.cssSelector(
				"div.row:nth-child(4) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}

	private static WebElement LibrivoxLogo() {
		return driver.findElement(By.cssSelector(
				"div.row:nth-child(4) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}

	private static WebElement LibrivoxLink() {
		return driver.findElement(By.cssSelector(
				"div.row:nth-child(4) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}

	private static List<WebElement> featuredAudioList() {
		return driver.findElements(By.cssSelector("div.row:nth-child(4) > div:nth-child(1) > div:nth-child(1) a"));
	}

	private static List<WebElement> TopAudioCategories() {
		return driver.findElements(By.cssSelector("div.row:nth-child(4) > div:nth-child(3) > div:nth-child(1) a"));
	}

	private static List<WebElement> AdditionalAudioCategories() {
		return driver.findElements(By.cssSelector("div.toprow:nth-child(3) > div:nth-child(5) > div:nth-child(1) a"));
	}

	// ===================================================================
	// TOP MENU - SOFTWARE

	private static WebElement InternetArcadeLogo() {
		return driver.findElement(By.cssSelector(
				"div.row:nth-child(5) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}

	private static WebElement InternetArcadeLink() {
		return driver.findElement(By.cssSelector(
				"div.row:nth-child(5) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}

	private static WebElement ConsoleLivingLogo() {
		return driver.findElement(By.cssSelector(
				"div.row:nth-child(5) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}

	private static WebElement ConsoleLivingLink() {
		return driver.findElement(By.cssSelector(
				"div.row:nth-child(5) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}

	private static List<WebElement> featuredSoftwareList() {
		return driver.findElements(By.cssSelector("div.row:nth-child(5) > div:nth-child(1) > div:nth-child(1) a"));
	}

	private static List<WebElement> TopSoftwareCategories() {
		return driver.findElements(By.cssSelector("div.row:nth-child(5) > div:nth-child(3) > div:nth-child(1) a"));
	}

	private static List<WebElement> AdditionalSoftwareCategories() {
		return driver.findElements(By.cssSelector("div.row:nth-child(5) > div:nth-child(5) > div:nth-child(1) a"));
	}

	// ===================================================================
	// TOP MENU - IMAGE

		private static WebElement MetropolitanMuseumLogo() {
			return driver.findElement(By.cssSelector("div.row:nth-child(6) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
		}

		private static WebElement MetropolitanMuseumLink() {
			return driver.findElement(By.cssSelector("div.row:nth-child(6) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
		}

		private static WebElement BrooklynMuseumLogo() {
			return driver.findElement(By.cssSelector("div.row:nth-child(6) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
		}

		private static WebElement BrooklynMuseumLink() {
			return driver.findElement(By.cssSelector("div.row:nth-child(6) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
		}

		private static List<WebElement> featuredImageList() {
			return driver.findElements(By.cssSelector("div.row:nth-child(6) > div:nth-child(1) > div:nth-child(1) a"));
		}

		private static List<WebElement> TopImageCategories() {
			return driver.findElements(By.cssSelector("div.row:nth-child(6) > div:nth-child(3) > div:nth-child(1) a"));
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

		// TOP MENU - WEB

		public void clickWayBack() {
			wayBackMachineLogo().click();
		}

		public void clickBlogLinkTop() {
			blogLinkTop().click();
		}

		public void searchWayBackMachineSearchBox(String s) {
			wayBackMachineSearchBox().sendKeys(s, Keys.ENTER);
		}

		// ===============================================================
		// TOP MENU - TEXTS

		
		public void clickBorrowBooksLogo() {
			booksToBorrowLogo().click();
		}

		public void clickBorrowBooksLink() {
			booksToBorrowLink().click();
		}

		public void clickOpenLibraryLogo() {
			openLibraryLogo().click();
		}

		public void clickOpenLibraryLink() {
			openLibraryLink().click();
		}

		public void selectFeaturedTexts(Integer i) {
			FeaturedTextsList().get(i).click();
		}

		public void selectTopLibraries(Integer i) {
			TopLibrariesList().get(i).click();
		}

		public void selectAdditionalArchives(Integer i) {
			AdditionalArchives().get(i).click();
		}

		// ================================================================
		// TOP MENU - VIDEO

		public void clickTVNewsLogo() {
			TVNewsLogo().click();
		}

		public void clickTVNewsLink() {
			TVNewsLink().click();
		}

		public void clickUnderstanding911Logo() {
			Understanding911Logo().click();
		}

		public void clickUnderstanding911Link() {
			Understanding911Link().click();
		}

		public void selectVideoFeatured(Integer i) {
			featuredVideosList().get(i).click();
		}

		public void selectTopVideoCategory(Integer i) {
			TopVideoCategories().get(i).click();
		}

		public void selectAdditionalVideoCategory(Integer i) {
			AdditionalVideoCategories().get(i).click();
		}

		// ================================================================
		// TOP MENU - AUDIO

		public void clickLiveMusicLogo() {
			LiveMusicArchiveLogo().click();
		}

		public void clickLiveMusicLink() {
			LiveMusicArchiveLink().click();
		}

		public void clickLibrivoxLogo() {
			LibrivoxLogo().click();
		}

		public void clickLibrivoxLink() {
			LibrivoxLink().click();
		}

		public void selectAudioFeatured(Integer i) {
			featuredAudioList().get(i).click();
		}

		public void selectTopAudioCategory(Integer i) {
			TopAudioCategories().get(i).click();
		}

		public void selectAdditionalAudioCategory(Integer i) {
			AdditionalAudioCategories().get(i).click();
		}

//		//================================================================
//		// TOP MENU - SOFTWARE 

		public void clickInternetArcadeLogo() {
			InternetArcadeLogo().click();
		}

		public void clickInternetArcadeLink() {
			InternetArcadeLink().click();
		}

		public void clickConsoleLivingLogo() {
			ConsoleLivingLogo().click();
		}

		public void clickConsoleLivingLink() {
			ConsoleLivingLink().click();
		}

		public void selectSoftwareFeatured(Integer i) {
			featuredSoftwareList().get(i).click();
		}

		public void selectTopSoftwareCategory(Integer i) {
			TopSoftwareCategories().get(i).click();
		}

		public void selectAdditionalSoftwareCategory(Integer i) {
			AdditionalSoftwareCategories().get(i).click();
		}
		
//		//================================================================
//		// TOP MENU - IMAGE 

		public void clickMetropolitanMuseumLogo() {
			MetropolitanMuseumLogo().click();
		}

		public void clickMetropolitanMuseumLink() {
			MetropolitanMuseumLink().click();
		}

		public void clickBrooklynMuseumLogo() {
			BrooklynMuseumLogo().click();
		}

		public void clickBrooklynMuseumLink() {
			BrooklynMuseumLink().click();
		}

		public void selectImageFeatured(Integer i) {
			featuredImageList().get(i).click();
		}

		public void selectTopImageCategory(Integer i) {
			TopImageCategories().get(i).click();
		}
	
	
}
