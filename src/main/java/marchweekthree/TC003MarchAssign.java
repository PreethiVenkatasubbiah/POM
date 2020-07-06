package marchweekthree;

import org.testng.annotations.Test;

import utils.DPClassForTC006;
import wrappers.GenericWrapper;

public class TC003MarchAssign extends GenericWrapper{
	@Test(dataProvider = "testCase6", dataProviderClass=DPClassForTC006.class)
	public void testCase003(String language, String ST_CODE, String distList, String AC_NO,
			String FMNAME_EN, String LASTNAME_EN, String PART_NO, String SLNO_INPART, String EPIC_NO,
			String CORRECTED_HOUSE_NO, String CORRECTED_STREET_AREA, String CORRECTED_VILLAGE, String CORRECTED_POST_OFFICE,
			String applicantPresentPincode, String CORRECTED_DISTRICT_NO, String txtCorrectedAge, String CORRECTED_GENDER,
			String EMAIL_ID1, String DOBProof_type, String ResidenceProof_type, String EMAIL_ID2, String MOBILE_NO, String APPLICANT_PLACE
			) {
		invokeApp("chrome", "https://www.irctc.co.in");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]/a/i");
		clickByXpath("//*[@id='slide-menu']/p-sidebar/div/nav/ul/li[15]/a/label/span");
		mouseHoverbyXpath("//*[@id='bluemenu']/ul/li[6]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
		switchToLastWindow();
		clickByXpath("//*[@id='main-content']/div/div/div[2]/div[2]/div[1]/div/div[2]/a");
		switchToLastWindow();
		selectIndexById("language", language);
		selectVisibileTextByName("ST_CODE", ST_CODE);
		selectVisibileTextByName("distList", distList);
		selectVisibileTextByName("AC_NO", AC_NO);
		enterByName("FMNAME_EN", FMNAME_EN );
		enterByName("LASTNAME_EN", LASTNAME_EN);
		enterByName("PART_NO", PART_NO);
		enterByName("SLNO_INPART", SLNO_INPART);
		enterByName("EPIC_NO", EPIC_NO);
		clickByName("IS_ADDRESS_CORRECTION");
		clickByName("IS_AGE_CORRECTION");
		clickByName("IS_GENDER_CORRECTION");
		enterByName("CORRECTED_HOUSE_NO", CORRECTED_HOUSE_NO);
		enterByName("CORRECTED_STREET_AREA", CORRECTED_STREET_AREA);
		enterByName("CORRECTED_VILLAGE", CORRECTED_VILLAGE);
		enterByName("CORRECTED_POST_OFFICE", CORRECTED_POST_OFFICE);
		enterById("applicantPresentPincode", applicantPresentPincode);
		enterByName("CORRECTED_DISTRICT_NO", CORRECTED_DISTRICT_NO);	
		enterById("txtCorrectedAge", txtCorrectedAge);
		selectVisibileTextByName("CORRECTED_GENDER", CORRECTED_GENDER);
		enterByName("EMAIL_ID", EMAIL_ID1);
		selectVisibileTextByName("DOBProof_type",DOBProof_type);
		selectVisibileTextByName("ResidenceProof_type", ResidenceProof_type);
		enterByName("EMAIL_ID", EMAIL_ID2);
		enterByName("MOBILE_NO", MOBILE_NO);
		enterByName("APPLICANT_PLACE", APPLICANT_PLACE);
		enterByName("Captcha", "42343");
		clickById("submit_button_store_id");
		verifyTextByXpath("//*[@id='validation']/div[15]/div[2]/div/span[2]/span", "Please enter valid mobile number(Like : 95*****117)");
		
	}

}
