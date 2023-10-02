package training_Selenium;

public class WindowHandel_10ThClass {
	
	/*
	 * Switch Window:--3 Types of Switch window.
	 * 1.Window Handle.
	 * 2.Alert Handle. and
	 * 3.iFrames.
	 * 
	 * 1.Window Handle using Selenium WwebDriver.
	 *  1.getWindowHandle()--->It is used to fetch the single window handle.
	 * 
	 * Code:-
	 *  String parentWindow = driver.getWindowHandle();
	 * System.out.println(parentWindow);
	 * 
	 * 
	 * 2.getWindowHandles()--->It is used to fetch all window handle.
	 *  Code:
	 * Set<String> allWindows = driver.getWindowHandles();
	 *  int isize = allWindows.size();
	 *   System.out.println(isize);
	 * 
	 * 	
	 * 3.Store the parent window handle using getWindowHandle Command and print in the console. 
	 * Code:-- 
	 * String parentWindow = driver.getWindowHandle(); 
	 * System.out.println("Parent Window: " +parentWindow);
	 *	 
	* 4.How to switch from parent window to Child window.
	 * 5.Click On the Open window button.
	 * WebElement button_OpenWindow = driver.findElement(By.id("openwindow"));
		button_OpenWindow.click();
	 * 
	 * //Below code is used to switch from parent window to Child Window.
	 * Set<String> allWindow = driver.getWindowHandles();
	 *  Iterator<String> iterator = allWindow.iterator();
	 * 
	 * While(iterator.hasNext()) { 
	 * String childWindow = iterator.next();
	 * 
	 * if(!parentWindow.equalsIgnoreCase(childWindow)) {
	 * driver.switchTo().window(childWindow);
	 * 
	 * //perform all the actions in the child window.
	 *  5.Action--> The action that user is going to perform in the child window.
	 * 
	 * //Close the child window.
	 *  driver.close(); 
	 *  
	 *  }
	 *   }
	 * 
	 * 
	 * 6.SwitchTo()-->It is used to switch from one window to another window.Like again Child to Parent window.
	 *  Code:-
	 *   driver.switchTo().window(parentwindow);
	 *   
	 *   7.close all browser.
	 *   driver.quite();
	 */
}
