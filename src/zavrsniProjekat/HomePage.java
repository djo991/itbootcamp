package zavrsniProjekat;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BaseClass {

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


	
	// ===============================================================
	// HOME PAGE CENTER TOP BAR

	private static WebElement logoTopCenter() {
		return driver.findElement(By.cssSelector("a.navbar-brand"));
	}

	private static WebElement signInButton() {
		return driver.findElement(By.cssSelector("a.nav-user"));
	}
	
	private static WebElement userButton() {
		return driver.findElement(By.cssSelector("a#user-menu"));
	}

	private static WebElement uploadButton() {
		return driver.findElement(By.cssSelector("a.nav-upload"));
	}

	private static List<WebElement> categoriesList() {
		return driver.findElements(By.cssSelector("ul.nav.navbar-nav.navbar-main li"));
	}

	// ==============================================================
	// ABOUT BAR

	private static List<WebElement> aboutList() {
		return driver.findElements(By.cssSelector("ul#nav-abouts li"));
	}

	// ==============================================================
	// CENTER SECTION

	private static List<WebElement> announcementLinks() {
		return driver.findElements(By.cssSelector("div.wplinks a"));
	}

	private static WebElement seeMoreAnnouncementsLink() {
		return driver.findElement(By.cssSelector("div.pull-right a.stealth"));
	}

	private static WebElement advancedSearchCenter() {
		return driver.findElement(By.cssSelector("a.search-options__advanced-search-link"));
	}

	private static WebElement SearchBoxCentral() {
		return driver.findElement(By.cssSelector("input.form-control.input-sm.roundbox20.js-search-bar"));
	}

	private static List<WebElement> searchOptions() {
		return driver.findElements(By.cssSelector("div#search_options fieldset label"));
	}
	
	private static WebElement goButton() {
		return driver.findElement(By.cssSelector("button.btn"));
	}
	
	private static List<WebElement> mediaTypeDetailsCenter() {
		return driver.findElements(By.cssSelector("center.mt-big a"));
	}

	// =====================================================================
	// TOP COLLECTIONS SECTION
	private static List<WebElement> topCollections() {
		return driver.findElements(By.cssSelector("div.results div.item-ia.collection-ia"));
	}
	
	private static List<WebElement> topItems() {
		return driver.findElements(By.cssSelector("div.results div.item-ia.collection-ia div div.num-items.topinblock"));
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

//	//================================================================
//	// TOP MENU - SOFTWARE 

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
	
//	//================================================================
//	// TOP MENU - IMAGE 

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



	// ================================================================
	// HOME PAGE CENTER TOP BAR
	public void clickLogoTopCenter() {
		logoTopCenter().click();
	}

	public void clickSignIn() {
		signInButton().click();
	}
	
	public void clickUser() {
		userButton().click();
	}

	public void clickUpload() {
		uploadButton().click();
	}

	public void clickWebCategory() {
		categoriesList().get(0).click();
	}

	public void clickTextsCategory() {
		categoriesList().get(1).click();
	}

	public void clickVideoCategory() {
		categoriesList().get(2).click();
	}

	public void clickAudioCategory() {
		categoriesList().get(3).click();
	}

	public void clickSoftwareCategory() {
		categoriesList().get(4).click();
	}

	public void clickImageCategory() {
		categoriesList().get(5).click();
	}

	// ====================================================
	// //ABOUT BAR
	public void clickAbout() {
		aboutList().get(0).click();
	}

	public void clickContact() {
		aboutList().get(1).click();
	}

	public void clickBlog() {
		aboutList().get(2).click();
	}

	public void clickProjects() {
		aboutList().get(3).click();
	}

	public void clickHelp() {
		aboutList().get(4).click();
	}

	public void clickDonate() {
		aboutList().get(5).click();
	}

	public void clickJobs() {
		aboutList().get(6).click();
	}

	public void clickVolunteer() {
		aboutList().get(7).click();
	}

	public void clickPeople() {
		aboutList().get(8).click();
	}

	// ======================================================
	// CENTER SECTION

	public void clickAnnouncement(Integer i) {
		announcementLinks().get(i).click();
	}

	public void clickSeeMoreAnnouncements() {
		seeMoreAnnouncementsLink().click();
	}

	public void clickAdvancedSearch() {
		advancedSearchCenter().click();
	}
	
	public void clickGoButton() {
		goButton().click();
	}

	public void searchCentralBox(String s) {
		SearchBoxCentral().click();
		SearchBoxCentral().sendKeys(s);
	}
	public void selectSearchBox() {
		SearchBoxCentral().click();
	}
	
	public WebElement SearchOption(Integer i) {
		return searchOptions().get(i);
	}
	
	public void selectSearchOption(Integer i) {
		SearchBoxCentral().click();
		searchOptions().get(i).click();
	}

	public void selectMediaTypeDetails(String s) {
		switch (s) {
		case "Web":
			mediaTypeDetailsCenter().get(0).click();
			break;
		case "Texts":
			mediaTypeDetailsCenter().get(1).click();
			break;
		case "Video":
			mediaTypeDetailsCenter().get(2).click();
			break;
		case "Audio":
			mediaTypeDetailsCenter().get(3).click();
			break;
		case "TV":
			mediaTypeDetailsCenter().get(4).click();
			break;
		case "Software":
			mediaTypeDetailsCenter().get(5).click();
			break;
		case "Image":
			mediaTypeDetailsCenter().get(6).click();
			break;
		case "Concerts":
			mediaTypeDetailsCenter().get(7).click();
			break;
		case "Collections":
			mediaTypeDetailsCenter().get(8).click();
			break;
		}
	}

	// =======================================================
	// TOP COLLECTIONS SECTION

	public void clickTopCollection(Integer i) {
		topCollections().get(i).click();
	}
	
	public Integer getItemCount(Integer i) {
		String a = topCollections().get(i).findElement(By.cssSelector("div.num-items.topinblock")).getText();
		String b = a.replaceAll("[^0-9]", "");
		Integer r = Integer.parseInt(b);
		return r;
	}
	
	public Integer getItemResults() {
		String b = driver.findElement(By.cssSelector("div.results_count")).getText();
		String a = b.replaceAll("[^0-9]", "");
		Integer r = Integer.parseInt(a);
		return r;
	}
	
	public List<WebElement> countTopCollections() {
		return topCollections();
	}
	
	public int countItems() {
		int counter = 0;
		for (WebElement e : countTopCollections()) {
			
			if (e.findElement(By.cssSelector("div.micro-label")).getText().equalsIgnoreCase("items")) {
				counter +=1;
			}
		}
		return counter;
	}
	
	public boolean isTextOnPagePresent(String text) {
	    String body = driver.getPageSource();
	    return body.contains(text);
	}
}
