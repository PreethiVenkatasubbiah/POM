package testcases;





import org.testng.annotations.Test;

import utils.DP;
import wrappers.GenericWrapper;
import wrappers.ProjectWrappers;

public class TC001 extends GenericWrapper{
	
	
	@Test(dataProvider="testcase1", dataProviderClass=DP.class)
	public void irctcSignUp(String userName, String password,
			String confpasword,   String securityQ,
			String securityAnswer, String prelan, String firstName, String middleName, String lastName,
			String dobDay, String dobMonth, String dateOfBirth, String occupation,String uidno,
			String idno, String countries, String email, String mobile, String nationalityId, String address,
			String street, String area, String pincode, String cityName, String postofficeName, String landline) throws InterruptedException
			{
	//invokeApp("chrome", "https://irctc.co.in");
		//System.out.println("iam here");
		int num=Integer.parseInt(mobile);//pharsing is to convert the data types ex strings to int and viseversa
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]/a/i").click();
//		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]");
		clickByXpath("//*[@id='slide-menu']/p-sidebar/div/nav/ul/li[15]/a/label/span");
		clickByLink("Sign up");	
		enterById("userRegistrationForm:userName", userName);
		enterById("userRegistrationForm:password", password);
		enterById("userRegistrationForm:confpasword", confpasword);
		selectVisibileTextById("userRegistrationForm:securityQ", securityQ);
		enterById("userRegistrationForm:securityAnswer", securityAnswer);
		selectVisibileTextById("userRegistrationForm:prelan", prelan);
		enterByName("userRegistrationForm:firstName", firstName);
		enterByName("userRegistrationForm:middleName", middleName);
		enterByName("userRegistrationForm:lastName",lastName);
		clickByName("userRegistrationForm:gender");
		clickByName("userRegistrationForm:maritalStatus");
		selectVisibileTextById("userRegistrationForm:dobDay", dobDay);
		selectVisibileTextById("userRegistrationForm:dobMonth", dobMonth);
		selectVisibileTextById("userRegistrationForm:dateOfBirth",dateOfBirth );
		selectVisibileTextById("userRegistrationForm:occupation", occupation);
		enterById("userRegistrationForm:uidno", uidno);
		enterByName("userRegistrationForm:idno",idno );
		selectVisibileTextById("userRegistrationForm:countries", countries);
		enterById("userRegistrationForm:email", email);
		enterById("userRegistrationForm:mobile", mobile);
		enterById("userRegistrationForm:nationalityId", nationalityId);
		enterById("userRegistrationForm:address", address);
		enterById("userRegistrationForm:street", street);
		enterById("userRegistrationForm:area",area );
		enterByName("userRegistrationForm:pincode", pincode);
		//enterById("userRegistrationForm:statesName", "Tamil nadu");
		selectVisibileTextById("userRegistrationForm:cityName", cityName );
		selectVisibileTextById("userRegistrationForm:postofficeName", postofficeName );
		enterById("userRegistrationForm:landline", landline);
		enterById("nlpAnswer", "45Tyu");
		clickById("userRegistrationForm:resAndOff:0");
		clickById("userRegistrationForm:newsletter:0");
		clickById("userRegistrationForm:commercialpromo:1");
		clickById("userRegistrationForm:irctcsbicard:0");
		//closeAllBrowsers();
	}

}
