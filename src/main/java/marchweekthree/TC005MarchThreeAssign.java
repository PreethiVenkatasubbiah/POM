package marchweekthree;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.SendKeysAction;

import wrappers.GenericWrapper;

public class TC005MarchThreeAssign extends GenericWrapper{
	@Test
	public void testCase005March() {
		invokeApp("chrome", "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		clickByXpath("/html/body/table/tbody/tr[1]/td/center[1]/table/tbody/tr[1]/td/a");
		enterByName("u_id", "prak1234");
		//acceptAlert();
		//enterByName("u_id", );
		enterByName("u_id", "prak12345");
		enterById("u_pwd", "welcome123");
		enterById("u_repwd", "welcome123");
		selectVisibileTextByName("u_secques", " What is the name of the hospital where you were born?");
		enterByName("u_secans", "National");
		enterByName("u_name", "sdsadasd");
		selectIndexById("u_gender", "Male");
		enterById("u_dob", "15/01/1982");
		enterByName("u_designation", "Staff Engg");
		enterByName("u_emailid", "dummy2323@gmail.com");
		enterByName("u_mobile", "1212121212");
		enterByName("u_phone", "044123567");
		selectIndexById("u_nationality", "INDIA");
		enterByName("capacity", "5");
		enterByName("address", "123 anna nagar, shnathi colony");
		selectVisibileTextByName("state", "TELANGANA");
		selectVisibileTextByName("city_distr", "HYDERABAD");
		selectVisibileTextByName("acco_type", "Hospital");
		selectVisibileTextByName("star_rat", "Others");
		enterByName("email", "dummay@gmail.com");
		enterByName("mcontact", "1212121212");
		enterByName("contact", "044567789");
		enterByName("name_o", "johny");
		enterByName("address_o", "121, vinayagar street, tambaram");
		selectVisibileTextByName("state_o", "TAMIL NADU");
		selectVisibileTextByName("citydistr_o", "COIMBATORE");
		enterByName("emailid_o", "sdsdssd@gmail.com");
		enterByName("phoneno_o", "1212121212");
		enterByName("mobile_o", "1212121212");
		clickByName("add");
		enterByName("name_o", "fbskfksdbf");
		
		
		
		
		
	}

}
