package testcases;


import org.testng.annotations.Test;

import utils.DpForTestCase3;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	@Test(dataProvider="testcase3", dataProviderClass = DpForTestCase3.class)
	public void nVSP(String language, String stateList, String distList, String acList,
			String applicantName, String applicantSurname, String applicantFMHName, String applicantFMHSurname,
			String applicantRelationType, String month, String year, String Date, String elector_gender,
			String 	applicantPresentHouseNo, String CURR_STREET_AREA, String CURR_VILLAGE, String CURR_POST_OFFICE,
			String applicantPresentPincode,String applicantPrevepicno,String applicantFamilyPrevepicno, String OTHER_DISABLITY, String EMAIL_ID, String applicantMobile,
			String BIRTH_VILLAGE, String BIRTH_STATE_CODE, String applicantBirthDistrict, String Pincode, String APPLICANT_PLACE,
			String ddPrevState, String applicantPreHouseNo, String applicantPreStreet, String applicantPreVillage,
			String applicantPrePostoffice, String applicantPrePincode, String Prev_DistNo, String ddPrevac
			) throws InterruptedException{
//				invokeApp("chrome", "https://irctc.co.in");
				clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]/a/i");				
				clickByXpath("//*[@id='slide-menu']/p-sidebar/div/nav/ul/li[15]/a/label/span");
				mouseHoverbyXpath("//*[@id='bluemenu']/ul/li[6]/a");
				clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
				switchToLastWindow();
				clickByXpath("//*[@id='main-content']/div/div/div[2]/div[1]/div[1]/div/div[2]/p");
				switchToLastWindow();
				clickByXpath("//*[@id='main-content']/div/div/div[2]/div[1]/div[1]/div/div[2]/a");
				switchToLastWindow();
				selectIndexById("language", language);
				selectIndexById("stateList", stateList);
				Thread.sleep(3000);
				selectIndexById("distList", distList);
				Thread.sleep(3000);
				selectIndexById("acList", acList);
				clickById("isExistingVoter");
				enterById("applicantName", applicantName);
				enterById("applicantSurname", applicantSurname);
				enterById("applicantFMHName", applicantFMHName);
				enterById("applicantFMHSurname", applicantFMHSurname);
				selectVisibileTextById("applicantRelationType", applicantRelationType);
				clickById("RbdDateOfBirth");
				clickById("txtDateOfBirth");
				selectVisibleTextByXpath("//*[@id='ui-datepicker-div']/div/div/select[2]", month);
				selectVisibleTextByClass("ui-datepicker-year", year);
				clickByXpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[6]/a");				
				selectVisibleTextByClass("ui-state-default", Date);
				selectIndexById("elector_gender", elector_gender);
				enterById("applicantPresentHouseNo", applicantPresentHouseNo);
				enterByName("CURR_STREET_AREA", CURR_STREET_AREA);
				enterByName("CURR_VILLAGE", CURR_VILLAGE);
				enterByName("CURR_POST_OFFICE", CURR_POST_OFFICE);
				enterById("applicantPresentPincode", applicantPresentPincode);
				clickByXpath("//*[@id='divf']/div[8]/label[2]");
				//enterById("applicantPrevepicno", applicantPrevepicno);
				enterById("applicantFamilyPrevepicno", applicantFamilyPrevepicno);
				enterByName("OTHER_DISABLITY", OTHER_DISABLITY);
				enterByName("EMAIL_ID", EMAIL_ID);
				enterById("applicantMobile", applicantMobile);
				enterByName("BIRTH_VILLAGE", BIRTH_VILLAGE);
				selectVisibileTextByName("BIRTH_STATE_CODE", BIRTH_STATE_CODE);
				selectIndexById("applicantBirthDistrict", applicantBirthDistrict);
				enterByXpath("//*[@id='txtRESIDENT_SINCE","17032018");
				tabkeys("//*[@id='txtRESIDENT_SINCE']");
				enterByName("APPLICANT_PLACE", APPLICANT_PLACE);
				selectIndexById("ddPrevState", ddPrevState);
				Thread.sleep(3000);
				selectIndexById("ddPrevac", ddPrevac);
				enterById("applicantPreHouseNo", applicantPreHouseNo);
				enterById("applicantPreStreet", applicantPreStreet);
				enterById("applicantPreVillage", applicantPreVillage);
				enterById("applicantPrePostoffice", applicantPrePostoffice);
				enterById("applicantPrePincode", applicantPrePincode);
				selectIndexById("Prev_DistNo", Prev_DistNo);		
				
				
	}
		
	}

