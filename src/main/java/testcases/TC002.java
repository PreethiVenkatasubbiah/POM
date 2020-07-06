package testcases;



import org.testng.annotations.Test;

import utils.DPForTestCase002;
import wrappers.ProjectWrappers;

	public class TC002 extends ProjectWrappers{
		@Test(dataProvider = "testcase2", dataProviderClass=DPForTestCase002.class)
		public void  irctcLoginTc002(String city, String laungecity, String selPassangers, String checkInTime,
				String checkOutTime, String email, String mobileNo, String passanger1, String Age1, String Gender1,
				String passanger2, String Age2	, String Gender2, String passanger3, String Age3, String Gender3,
				String State) throws InterruptedException{
			
//				invokeApp("chrome", "https://irctc.co.in");
				//int num = Integer.parseInt(mobileNo);
				clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[3]/a/i");
				clickByXpath("//*[@id='slide-menu']/p-sidebar/div/nav/ul/li[15]/a/label/span");
				clickByLink("Sign up");	
				mouseHoverbyXpath("//*[@id='bluemenu']/ul/li[2]/a");
				mouseHoverbyXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/a");
				clickByXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/a");
				clickByXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/ul/li[4]");
				switchToLastWindow();
				Thread.sleep(3000);
				//clickByXpath("//*[@id='slider-1']/div[1]/div[2]/a[3]/div");
				clickByClassName("Accommodation");
				Thread.sleep(5000);
				//clickByName("city");
				selectVisibileTextByName("city", city);
				//selectVisibleTextByXpath("//*[@id='slider-1']/div[1]/div/div/div/div[1]/div[1]/div[2]/form/div/div[1]/select", city);
				Thread.sleep(2000);
				selectVisibileTextByName("laungecity", laungecity);
				Thread.sleep(2000);
				selectVisibileTextByName("selPassangers", selPassangers);
				clickByName("acservicecheckindate");
				clickByXpath("//*[@id='slider-1']/div[1]/div/div/div/div[1]/div[1]/div[2]/form/div/div[4]/div[1]/div/div/table/thead/tr[1]/th[3]/span[1]");
				clickByXpath("//*[@id='slider-1']/div[1]/div/div/div/div[1]/div[1]/div[2]/form/div/div[4]/div[1]/div/div/table/tbody/tr[1]/td[5]/span");
				selectVisibileTextByName("checkInTime", checkInTime);
				selectVisibileTextByName("checkOutTime", checkOutTime);
				clickByXpath("//*[@id='slider-1']/div[1]/div/div/div/div[1]/div[1]/div[2]/form/div/div[10]/button[2]");
				Thread.sleep(5000);
				enterByName("email", email);
				Thread.sleep(3000);
				enterByName("mobileNo", mobileNo);
				clickByXpath("//*[@id='gulogin-form']/div[3]/div/input");
				Thread.sleep(2000);
				enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[1]/td[2]/div/input", passanger1);
				enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[1]/td[3]/div/input", Age1);
				selectVisibleTextByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[1]/td[4]/div/select", Gender1);
				enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[2]/td[2]/div/input",passanger2);
				enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[2]/td[3]/div/input", Age2);
				selectVisibleTextByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[2]/td[4]/div/select", Gender2);
				enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[3]/td[2]/div/input", passanger3);
				enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[3]/td[3]/div/input", Age3);
				selectVisibleTextByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr[3]/td[4]/div/select", Gender3);
				
				selectVisibleTextByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[3]/div[3]/select", State);
				///html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[5]/button[3]
				arrowDownbyxPath("/html/body");
				arrowDownbyxPath("/html/body");
				arrowDownbyxPath("/html/body");
				clickByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[5]/button[3]");
				
				
				verifyTextByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[2]/div[2]/label", "3434568789");
				verifyTextByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[2]/div[1]/label", "dummy123@gmail.com");
				
				getTextByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[3]/div[1]/label");
				pageDownbyxPath("/html/body");
				arrowDownbyxPath("/html/body");
				arrowDownbyxPath("/html/body");		
				clickByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[5]/div[1]/label/span/span");
				
				clickByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[5]/div[2]/button");
				
				Thread.sleep(3000);
				
				geAttributesByXpath("//*[@id='payform']/div/div/div/div/div[1]/span", "5200046483");
				
				//closeAllBrowsers();
				
				}
		}

		
		
			
		

	


