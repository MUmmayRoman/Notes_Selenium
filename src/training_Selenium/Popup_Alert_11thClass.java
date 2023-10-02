package training_Selenium;

public class Popup_Alert_11thClass {
	
	/*
	 * Switch Window 3 types:-- 
	 * 1.Window Handle --10th class.
	 * 2.Alert Popup --11th Class.
	 * 3.iFrames --12th Class.
	 * 
	 * Popup:--2 types of popup:-- 
	 * 1.Windows based popups-->Selenium does not support windows based popup it can be handled using a third party tool called AutoIT. 
	 * 2.Web based popup-->It is handled by the selenium.
	 * 
	 * Alert Popup-->It is a web based popups. Three types of Alert popups:--
	 * 1.Simple Alert. 
	 * 2.Confirmation Alert. 
	 * 3.Prompt Alert.
	 * 
	 * Actions that can be performed in Alert popups. 
	 * 1.Accept--> It is used to click on Ok button--> To Accept the alert. 
	 * 2.Dismiss-->It is used to click on Cancel button-->To cancel the Popup. 
	 * 3.GetText--It is used to fetch the alert popup text. 
	 * 4.SendKeys--> It is used to pass the parameter to alert popup.
	 * 
	 * Alert alert = driver.switchTo().alert();
	 * 
	 * 1.Simple Alert--> It is the Web based popup which has some alert text and a button. 
	 * Code:- 
	 * WebElement button_alert = driver.findElement(By.id(""));
	 * button_alert.click(); 
	 
	 * Alert simpleAlert = driver.switchTo().alert(); 
	 * String alertText = simpleAlert.getText(); 
	 * System.out.println(alertText);
	 * simpleAlert.accept();
	 * 
	 * 2.Confirmation Alert:--It is the web based popup which has some alert text and two button i.e. ok and Cancel. 
	 * Code:- 
	 * WebElement button_confirm = driver.findElement(By.id("")); 
	 * button_confirm.click(); 
	 * 
	 * Alert confirmAlert = driver.switchTo().alert(); 
	 * String alertText = confirmAlert.getText();
	 * System.out.println(alertText);
	 * 
	 * //Click on Ok button confirmAlert.accept();
	 * 
	 * //Click on Cancel button confirmAlert.dismiss();
	 * 
	 * 3.Propmt Alert:--It is the web based popup which has some alert text with and input text area and two button i.e. ok and Cancel. 
	 * Code:- 
	 * WebElement button_confirm = driver.findElement(By.id("")); 
	 * button_confirm.click();
	 * 
	 * Alert promtAlert = driver.switchTo().alert(); 
	 * String alertText = promtAlert.getText(); 
	 * System.out.println(alertText);
	 * 
	 * //Passing parameter to the Alert
	 * prompAlert.sendKeys("Accepting the alert popup!!!");
	 * 
	 * //Click on Ok button promtAlert.accept();
	 * 
	 * //Click on Cancel button promtAlert.dismiss();
	 */
	

}
