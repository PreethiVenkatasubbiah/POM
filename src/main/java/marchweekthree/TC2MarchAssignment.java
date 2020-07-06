package marchweekthree;

import org.testng.annotations.Test;

import wrappers.GenericWrapper;
@Test
public class TC2MarchAssignment extends GenericWrapper{
	public void testCase002() throws InterruptedException{
		invokeApp("chrome", "https://www.irctc.co.in");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]/a/i");
		clickByXpath("//*[@id='slide-menu']/p-sidebar/div/nav/ul/li[15]/a/label/span");
		mouseHoverbyXpath("//*[@id='bluemenu']/ul/li[6]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
		switchToLastWindow();
		clickByXpath("//*[@id='main-content']/div/div/div[2]/div[1]/div[3]/div/div[2]/a");
		switchToLastWindow();
		selectIndexById("language", "English");
		selectVisibileTextById("stateList", "Tamil Nadu");
		Thread.sleep(2000);
		selectVisibileTextByName("distList", "Erode");
		selectIndexById("acList", "Bhavani");
		enterByName("APPLICANT_FMNAME_EN", "sdfsdfsfs");
		enterByName("APPLICANT_LASTNAME_EN", "surnnnkjnk");
		enterByName("APPLICANT_PART_NO", "32442424242");
		enterByName("APPLICANT_SLNO_INPART", "87340893402");
		enterByName("APPLICANT_EPIC_NO", "121212121");
		enterByName("APPLICANT_EPIC_NO", "343432432423");
		enterById("AppliacntMobile", "998877665");
		enterByName("APPLICANT_EMAIL_ID", "dummy12rcom@gmail.com");
		enterById("objectorName", "erewrwrw");
		enterById("ObjectorSurname", "dfsdfdfs");
		enterById("objecotrPartNO", "2323232");
		enterById("objecotrSrINPartNO", "232323231");
		enterByName("OBJECTED_EPIC_NO", "asfsdfsfs");
		selectVisibileTextById("ObjectionReason", "Missing");
		enterById("applicantFormPlace", "Chennai");
		clickByXpath("//*[@id='submit_button_store_id']");
		verifyTextByXpath("//*[@id='form']/div[2]/div[4]/div[6]/div[2]/span/span", "Please enter valid mobile number(Like : 95*****117");
	}

}
