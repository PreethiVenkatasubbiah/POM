package marchweekthree;

import org.junit.Test;

import wrappers.GenericWrapper;

public class TCmarchassign extends GenericWrapper{
	@Test
	public void marchTC001() throws InterruptedException{
		
		invokeApp("chrome", "https://www.irctc.co.in");
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]/a/i");
		clickByXpath("//*[@id='slide-menu']/p-sidebar/div/nav/ul/li[15]/a/label/span");
		mouseHoverbyXpath("//*[@id='bluemenu']/ul/li[6]/a");
		clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
		switchToLastWindow();
		Thread.sleep(3000);
		clickByXpath("//*[@id='main-content']/div/div/div[2]/div[1]/div[2]/div/div[2]/a");
		switchToLastWindow();
		selectIndexById("language", "English");
		selectIndexById("stateList", "Gujarat");
		selectIndexById("distList", "Arvalli");
		selectIndexById("acList", "Bayad");
		enterById("applicantFirstName", "sfflsnfls");
		enterByName("LASTNAME_EN", "asdsadas");
		enterByName("RLN_FMNAME_EN", "dfsdfsdfs");
		enterById("applicantFMHSurname", "sdfsfsfsa");
		selectIndexById("applicantRelationType", "Father");
		//selectIndexById("txtDateOfBirth", "15011982");	
		clickById("txtDateOfBirth");
		selectVisibleTextByClass("ui-datepicker-month", "Jan");
		selectVisibleTextByClass("ui-datepicker-year", "1982");
		clickByXpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[6]/a");
		selectVisibileTextByName("BIRTH_STATE_CODE", "Tamil Nadu");
		selectIndexById("applicantBirthDistrict", "CUDDALORE");
		enterById("applicantBirthVillage", "Village");
		selectVisibileTextByName("GENDER", "Male");
		enterByName("EMAIL_ID", "Dummy123@gmail.com");
		enterById("applicantMobile", "9884545399");
		enterByName("HOUSE_NO", "2323232");
		enterByName("STREET_AREA", "3rd street");
		enterById("applicantPresentVillage", "Village");
		enterByName("POST_OFFICE", "Cheyyar");
		enterByName("PIN_CODE", "604457");
		selectVisibileTextByName("DISTRICT_NO", "Arvalli");
		enterById("applicantPassportNumber", "L2432423");
		enterByName("PASSPORT_ISSUE_PLACE", "Chennai");		
		clickByClassName("PASSPORT_ISSUE_DATE");
		
		clickById("txtPresentPassportIssueDate");
		selectVisibleTextByClass("ui-datepicker-month", "Jan");
		selectVisibleTextByClass("ui-datepicker-year", "2000");
		clickByXpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]/a");
		
		clickById("txtPresentPassportExpDate");
		selectVisibleTextByClass("ui-datepicker-month", "Jan");
		selectVisibleTextByClass("ui-datepicker-year", "2020");
		clickByXpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]/a");
		
		enterByName("VISA_NO", "2232323454");
		enterByName("VISA_TYPE", "Tourist");
		clickByName("VISA_ISSUE_DATE");
		selectVisibleTextByClass("ui-datepicker-month", "Dec");
		selectVisibleTextByClass("ui-datepicker-year", "2018");
		clickByXpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[5]/a");
		clickByName("VISA_EXPIRY_DATE");
		selectVisibleTextByClass("ui-datepicker-month", "Dec");
		selectVisibleTextByClass("ui-datepicker-year", "2026");
		clickByXpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]/a");
		
		enterByName("VISA_ISSUING_AUTHORITY", "Mabjhdkfs");
		clickByClassName("applicantAbsenceReason");
		clickByXpath("//*[@id='form']/div[2]/div[13]/div[2]");
		clickById("txtABSENT_DATE");
		selectVisibileTextByName("ui-datepicker-month", "Sep");
		selectVisibleTextByClass("ui-datepicker-year", "2016");
		clickByXpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[6]/a");
		enterById("applicantPresentHouseNo", "4545");
		enterByName("ABROAD_STREET_AREA", "Abroad Street");
		enterByName("ABROAD_VILLAGE", "Abroadvillage");
		enterByName("ABROAD_STATE", "Texas");
		enterById("applicantAbroadCountry", "United States");
		enterById("applicantAbroadZipCode", "XNP456");
		clickById("prevrecord");
		Thread.sleep(2000);
		selectVisibileTextByName("PREV_STATE_CODE", "Tamil Nadu");
		Thread.sleep(2000);
		selectVisibileTextByName("PREV_AC_NO", "Alangudi");
		enterByName("PREV_PLACE", "28 sivan street, narasimma nagar, anna nagar");
		enterById("applicantPrevepicno", "ss343s3434");
		clickByName("PREV_EPIC_ISSUE_DATE");
		selectVisibleTextByClass("ui-datepicker-month", "Jul");
		selectVisibleTextByClass("ui-datepicker-year", "2000");
		clickByClassName("ui-state-default");
		enterByName("APPLICANT_PLACE", "Chennai");
		clickById("submit_button_store_id");	
		verifyTextByXpath("//*[@id='form']/div[2]/div[24]/div[2]/span/span", "Please Enter Captcha");
		}
						
		}
		
	
	


