package marchweekthree;

import org.testng.annotations.Test;

import utils.DPClassForTC007;
import wrappers.GenericWrapper;


public class TC004MarchAssignment extends GenericWrapper {
	@Test(dataProvider="testdata007", dataProviderClass = DPClassForTC007.class)
	public void testdata004(){
		invokeApp("chrome", "https://irctc.co.in");
		//clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[7]/span");
		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]/a/i");
		clickByXpath("//*[@id='slide-menu']/p-sidebar/div/nav/ul/li[15]/a/label/span");
		mouseHoverbyXpath("//*[@id='bluemenu']/ul/li[6]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
		clickByClassName("toggle");	
		mouseHoverbyXpath("//*[@id='bluemenu']/ul/li[6]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
		switchToLastWindow();
		clickByXpath("//*[@id='main-content']/div/div/div[2]/div[2]/div[2]/div/div[2]/a");
		switchToLastWindow();
		selectIndexById("language", "English");
		selectIndexById("stateList", "Assam");
		selectIndexById("distList", "CACHAR");
		selectVisibileTextByName("AC_NO", "DHOLAI");
		enterById("applicantFirstName", "fffsfsdfsdfs");
		enterByName("LASTNAME_EN", "fsfsfsffs");
		enterByName("PART_NO", "237");
		enterByXpath("//*[@id='applicantSerialNumberInPart']", "2343242");
		enterByName("SLNO_INPART", "ssfsfsfsf");
		enterByName("EPIC_NO", "12121212121");
		enterByName("Family_EPIC_NO", "12121212121");
		enterByName("EMAIL_ID", "dummerere@gmail.com");
		enterById("applicantMobile", "9884343434");
		enterById("applicantPresentHouseNo", "232");
		enterById("applicantPresentStreet", "3rd street");
		enterById("POST_OFFICE", "villagepostoffice");
		enterById("applicantPresentPincode", "604407");
		selectIndexById("AddressProoflist", "Income Tax Assessment Order");
		enterByName("APPLICANT_PLACE", "Chennai");
		enterByName("Captcha", "424234");
		clickById("submit_button_store_id");
		verifyTextByXpath("//*[@id='form']/div[2]/div[3]/div[8]/div/span/span", "Please enter a valid email addres");
						
	}

}
