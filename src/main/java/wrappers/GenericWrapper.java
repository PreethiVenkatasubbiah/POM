package wrappers;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Set;

import javax.sql.rowset.WebRowSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

import freemarker.ext.jsp.TaglibFactory.ClearMetaInfTldSource;



public class GenericWrapper implements Wrappers{
	
	public RemoteWebDriver driver;//Declaring as global for using it all method.

	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
	
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();			
			}else if (browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver", "./drivers.IedriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println("The browser "+browser+" is launched succesfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The browser "+browser+" is not launched Successfully");
		}
		finally {
			takeSnap();
		}
		
	}
			
		
	
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The selected element is sucessfully located :"+idValue);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The selected elements is not present");
			
			
		}catch (ElementNotVisibleException e) {
			System.err.println("The selected element is not visible");
			
			// TODO: handle exception
		}catch (ElementNotSelectableException e) {
			System.err.println("The selected element is not selectable");
			// TODO: handle exception
		}catch(ElementNotInteractableException e){
			System.err.println("The selected element is not ineractable");
						
		}catch (StaleElementReferenceException e) {
			System.err.println("The selected element is not stable");
			// TODO: handle exception
		}catch (WebDriverException e) {
			System.out.println("The browser closed due to unknown error");
			// TODO: handle exception
		}finally{
			takeSnap();
		}
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The Selected element was found sucessfully:" +nameValue);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The located element is not found");
			
		} catch(ElementNotVisibleException e) {
			System.err.println("The selected element is not visible");
					
		}catch(ElementNotSelectableException e){
			System.err.println("The selected element is not selectable");
			
		}catch(ElementNotInteractableException e){
			System.err.println("The selected element is not interactable");
			
		}catch(StaleElementReferenceException e){
			System.err.println("The selected element is not stable");
		
	}catch(WebDriverException e){
		System.err.println("Browser may closed due to unknown error");
		
	}finally{
		takeSnap();
	}
	}
	

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The selected element got found sucessfully:" +data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The selected is not available in DOM");
			
		}catch(ElementNotInteractableException e){
			System.err.println("The selected element is not interactable");
		}catch (ElementNotSelectableException e) {
		// TODO: handle exception
			System.err.println("The selected element is not selectable");
	
	} catch (StaleElementReferenceException e) {
		// TODO: handle exception
		System.err.println("The selected element is not stable");
	}catch (WebDriverException e) {
		// TODO: handle exception
		System.err.println("Browser may closed due to unexpected error");
	}finally {
		takeSnap();
	}
	}

	public void verifyTitle(String title)  {
		// TODO Auto-generated method stub
		
		try {
			String gettitle = driver.getTitle();
			if(title.equals(gettitle)){
				System.out.println("The title is Pass:"+gettitle);
			}else {
				System.out.println("The title is not correct: Fail");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}finally{
			takeSnap();
		
			
	}	}



	public void verifyTextById(String id, WebElement text) {
		// TODO Auto-generated method stub
		
		
		try {
			
			String textid = driver.findElementById(id).getText();
			if(text.equals(textid)){
				System.out.println("The received id is equal to Text");
				
			}else{
				System.out.println("The received id is not equal to Text");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}finally {
			takeSnap();
		}
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String path = driver.findElementByXPath(xpath).getText();
			if(text.equals(path)){
				System.out.println("The text displayed is correct");
}else {
			System.out.println("The text displayed is not correct  ");
}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}finally {
			takeSnap();
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
			try {
				String pathcontains = driver.findElementByXPath(xpath).getText();
				text = driver.findElementByXPath(text).getText();
				if(text == pathcontains){
					System.out.println("The text in xpath are equal");
					
				}else {
					System.out.println("The text in xpath are not equal");
				}
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.err.println("The element is not available");
				
			}catch (ElementNotInteractableException e) {
				System.err.println("The element is not interactable");
				
			}catch (ElementNotSelectableException e) {
				System.err.println("The element is not selectable");
				
			}catch (StaleElementReferenceException e) {
				System.err.println("The element is not stable");
				// TODO: handle exception
			}catch (WebDriverException e) {
				System.err.println("Browser got closed due to unknown error");
				// TODO: handle exception
			}
			
		}
		
	
	

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
		} catch (NoSuchElementException e) {
			System.err.println("The element is not available");
			// TODO Auto-generated catch block
			
		}catch (ElementNotInteractableException e) {
			System.err.println("The element is not interactable");
			// TODO: handle exception
		}catch (ElementNotSelectableException e) {
			System.err.println("The element is not selectable");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
		}catch (WebDriverException e) {
			System.err.println("Browser got closed due to unknown error");
			// TODO: handle exception
		}finally {
			takeSnap();
		}
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("Element got clicked successfully");
		} catch (NoSuchElementException e) {
			System.err.println("No such element to click");
			
			// TODO Auto-generated catch block
			
		}catch (ElementNotSelectableException e) {
			System.err.println("Not able to select the element to click");
			// TODO: handle exception
		}catch (ElementNotVisibleException e) {
			System.err.println("Element not visble to click");
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("Not able to interact the element to click");
		}catch (StaleElementReferenceException e) {
			System.err.println("Element is not stable to click");
			// TODO: handle exception
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed due to unknown error");
		}finally {
			takeSnap();
		}
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
		} catch (NoSuchElementException e) {
			System.err.println("The element is not present");
			// TODO Auto-generated catch block
			
		}catch (ElementNotSelectableException e) {
			System.err.println("The element is not selectable");
			// TODO: handle exception
		}catch (ElementClickInterceptedException e) {
			System.err.println("The element is not clickable");
			// TODO: handle exception
		}catch (ElementNotVisibleException e) {
			System.err.println("The selected element is not visible");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			System.err.println("The element is not stable");
			// TODO: handle exception
		}catch (WebDriverException e) {
			System.err.println("Browser got closed with unknown error");
			// TODO: handle exception
		}finally {
			takeSnap();
		}
		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
		} catch (NoSuchElementException e) {
			System.err.println("The element is not available");
			// TODO Auto-generated catch block
			
		}catch (ElementNotVisibleException e) {
			System.err.println("The element is not visible");
			// TODO: handle exception
		}catch (ElementNotSelectableException e) {
			System.err.println("The element is not selectable");
			// TODO: handle exception
		}catch (ElementClickInterceptedException e) {
			System.err.println("The element is not clickable");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			System.err.println("The element is not stable");
			// TODO: handle exception
		}catch (WebDriverException e) {
			System.err.println("Browser closed due to unknow error");
			// TODO: handle exception
		}finally {
			takeSnap();
		}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).	click();
			System.out.println("Click and located the element without taking snap");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element not fouund");
			
		}catch(ElementClickInterceptedException e){
			System.err.println("Click got intercepted and not loacted");
			
		}catch (ElementNotSelectableException e) {
			System.err.println("The element not able to select");
			// TODO: handle exception
		}catch (ElementNotVisibleException e) {
			System.err.println("The element not visible");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			System.err.println("Element is not stable");
			// TODO: handle exception
		}catch(WebDriverException e){
			System.err.println("Browser got closed without unknown error");
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			System.out.println("iam here");
			driver.findElementByXPath(xpathVal).click();
			System.out.println("Find the element by xpath and clicked sucessfully:" +xpathVal);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element is not available");
		}catch (ElementNotVisibleException e) {
			System.err.println("Element no visible to locate");
			// TODO: handle exception
		}catch (ElementNotSelectableException e) {
			System.err.println("Element not able to select");
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			System.err.println("Element not able to interact");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			System.err.println("Element is not stable");
			// TODO: handle exception
		}catch (WebDriverException e) {
			System.err.println("Browser got closed without unknown error");
			// TODO: handle exception
		}finally {
			takeSnap();
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("Locate the element with xpath without taking snap");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element not found");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("Element not able to interact");
			
		}catch (ElementNotSelectableException e) {
			System.err.println("Not able to select the element");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("Element is not stable");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed without unknown error");
		}
	}

	public String getTextById(String idVal) {
		String gTextid = null;
		try {
			gTextid = driver.findElementById(idVal).getText();
			System.out.println(gTextid);//check how to get the value to print and is this right.
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element not found");
			
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Cant select the element");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("Element not visible");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("Element not interactable");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("Element is not stable");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed without unknown error");
		}
		// TODO Auto-generated method stub
		return gTextid;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String gXpath=null;
		try {
			gXpath = driver.findElementByXPath(xpathVal).getText();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element not found for the getText element"+gXpath);
			
		}catch (ElementNotInteractableException e) {
			System.err.println("Element not interactable");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			System.err.println("Element is not stable");
			// TODO: handle exception
		}catch (WebDriverException e) {
			System.err.println("Browser got closed dut to unknown error");
			// TODO: handle exception
		}finally {
			takeSnap();
		}
		return gXpath;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementById(id);
			Select dropdown1 = new Select(dropdown);
			dropdown1.selectByVisibleText(value);
			System.out.println("Selected dropdown value is "+"dropdown1");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element is not found");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The selected element is not interactable");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("Element is not visible");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Not able to select the element");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("Element is not stable");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed due to unknown error");
		}finally {
			takeSnap();
		}
		
	
	}
	
	public void selectVisibileTextByName(String name, String Value){
		try {
			WebElement dropdown = driver.findElementByName(name);
			Select dropdown1 = new Select(dropdown);
			dropdown1.selectByVisibleText(Value);
			System.out.println("The selected element by name is :"+dropdown);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element not found to click");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The selected element is not interactable");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("Element is not visible");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Not able to select the element");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("Element is not stable");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void selectVisibleTextByXpath(String xPath, String Value){
		try {
			WebElement dropdown = driver.findElementByXPath(xPath);
			Select dropdown1 = new Select(dropdown);
			dropdown1.selectByVisibleText(Value);
			System.out.println("The selected element by name is :"+xPath);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element is not found");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The selected element is not interactable");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("Element is not visible");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Not able to select the element");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("Element is not stable");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed due to unknown error");
		}finally {
			takeSnap();
		}
	}
	
	public void selectVisibleTextByClass(String glass, String Value){
		try {
			WebElement dropdown = driver.findElementByClassName(glass);
			Select dropdown1 = new Select(dropdown);
			dropdown1.selectByVisibleText(Value);
			System.out.println("The selected element by name is :"+glass);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element is not found");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The selected element is not interactable");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("Element is not visible");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("Not able to select the element");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("Element is not stable");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed due to unknown error");
		}finally {
			takeSnap();
		}
	}

	
	public void selectIndexById(String id, String  value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown1 = driver.findElementById(id);
			Select selindex = new Select(dropdown1);
			selindex.selectByVisibleText(value);
			System.out.println("Drop down value is "+"value");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The selected element is not available");
		
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The selected element got intercepted");
		}catch(ElementNotSelectableException e){
			System.err.println("Not abale to select the element");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("Element is not visible");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("Element is not stable");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed without unknown errro");
			}finally {
				takeSnap();
			}
	}
	
		

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
	String wind1 = driver.getWindowHandle();
	try {
		Set<String> alwindowid = driver.getWindowHandles();
		for(String win : alwindowid){
			driver.switchTo().window(win);
		}
		driver.switchTo().window(wind1);
		System.out.println("The first window session id is : "+wind1);//Check is this correct
	} catch (NoSuchWindowException e) {
		// TODO Auto-generated catch block
		System.err.println("Windonw not found");
		
	}catch (SessionNotCreatedException e) {
		// TODO: handle exception
		System.err.println("Window session not created");
	}catch (UnreachableBrowserException e) {
		// TODO: handle exception
		System.err.println("Browser not reachable");
	}catch (WebDriverException e) {
		// TODO: handle exception
		System.err.println("Browser got closed without unknown error");
	}finally {
		takeSnap();
	}
		
	}
	
		
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String> eachwinid = driver.getWindowHandles();
			for(String winid : eachwinid){
				driver.switchTo().window(winid);
				System.out.println("Last window session id id "+" eachwinid");
			}
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			System.err.println("Window not available");
			
		}catch (SessionNotCreatedException e) {
			// TODO: handle exception
			System.err.println("Seesion not created for each window");
		}catch (UnreachableBrowserException e) {
			// TODO: handle exception
			System.err.println("Browser not reachable wihtout unknown error");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed wihtout unknown error");
		}finally {
			takeSnap();
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			System.out.println("Alert window was accepte	d");
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("Alert window not displayed");
			
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("Not able to hadle the alert exception");
			
		}		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed wihtout unknown error");
		
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Alert got dismissed sucessfully");
		} catch (NoAlertPresentException e) { 
			// TODO Auto-generated catch block
			System.err.println("Alert is not present");
			
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("Not able to handle the alert");
		}catch(WebDriverException e){
			System.err.println("Browser got closed withou unknow error");
		}finally {
			takeSnap();
		}		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		
		String gAlertText1 = "";
		try {
			gAlertText1 = driver.switchTo().alert().getText();
			
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			System.err.println("Not able to handle the error");
			
		}catch (NoAlertPresentException e) {
			// TODO: handle exception
			System.err.println("No such Alert present error");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed withou unknow error");
		}return(gAlertText1=null);//check is this right
	}
	public void takeSnap() {
		try {
			File temp=driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshotsfolder/snap.png");
			FileUtils.copyFile(temp, dest);
			
			System.out.println("Sucessfully captured the screenshot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Input/Output exception error");
			
		} catch (ScreenshotException e) {
			// TODO Auto-generated catch block
			System.err.println("");
		
		}	
		
		}
		
	
	public void closeBrowser() {
		// TODO Auto-generated method stub
	try {
		driver.close();
		System.out.println("Browser got closed sucessfully");
	}
	catch (UnreachableBrowserException e) {
		// TODO: handle exception
		System.err.println("");
	}catch (WebDriverException e) {
		// TODO: handle exception
	}	
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			System.out.println("Browser got closed sucessfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Unknown browser error");
			
		}
			
	}


	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
	}

	public void mouseHoverbyXpath(String xPath){
		try {
			WebElement mouse = driver.findElementByXPath(xPath);
			Actions obj = new Actions(driver);
			obj.moveToElement(mouse).perform();
			System.out.println("Mouser Hover done on element with XPath:" +xPath);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("No such element when user did mousehover");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("Element not visible");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Browser got closed without unknow error");
		}finally {
			takeSnap();
		}
	}



	public void geAttributesByXpath(String xPath, String Attribute) {
		
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xPath).getAttribute(Attribute);
			System.out.println("The get attribute value is:" +Attribute);
		} catch (NoSuchElementException e) {
						// TODO Auto-generated catch block
			System.err.println("No such element available");
			
		}catch (ElementNotSelectableException e) {
			System.err.println("Not able to select the element");
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("Element not interactable");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("Element is not stable");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("BRowser got closed without unknow error");
		}finally {
			takeSnap();
		}
	}

		
	public void pageDownbyxPath(String xPath ) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xPath).sendKeys(Keys.PAGE_DOWN);
			System.out.println("Screen got page down sucessfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Browser got closed with unknow error");			
			
		}finally {
			takeSnap();
		}
			
	}
			

	public void arrowDownbyxPath(String xPath ) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xPath).sendKeys(Keys.ARROW_DOWN);
			System.out.println("Screen got page down sucessfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Browser got closed with unknow error");			
			
		}finally {
			takeSnap();
		}
			
	}
	


	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		
	}



	
	public void tabkeys(String xPath){
		try {
			driver.findElementByXPath(xPath).sendKeys(Keys.TAB);
			System.out.println("Tab keys applied sucessfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Browser got closed with unknown error");
			
			
		}
	
		
	}



	public void clearText(String name) {
		// TODO Auto-generated method stub
		
	}


	public void test(String name) {
		// TODO Auto-generated method stub
		
	}



	



		
}







	
	



	
	