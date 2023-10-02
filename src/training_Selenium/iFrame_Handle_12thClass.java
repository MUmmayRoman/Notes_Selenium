package training_Selenium;

public class iFrame_Handle_12thClass {
	
	/*
	 * Switch Window 3 types:--
	 *  1.Window Handle --10th class.
	 *   2.Alert Popup --11thClass. 
	 *  3.iFrames --12th Class.
	 * 
	 * iFrame--> Inline Frame
	 *  ***To find the number of iFrames available in the webPage By Using tagName locator "iFrame".
	 *  *** To find the number of Links available in the webPage By Using tagName locator "a".
	 
	 *** Number of iFrames available in the webPage and what are the count of it-->
	 * Code:- List<WebElement> 
	 * numberOfFrames = driver.findElements(By.tagName("iFrame")); 
	 * int isize = numberOfFrames.size();
	 * System.out.println(isize);
	 * 
	 * What are the locators to find the iFrame: 
	 * 1.Index 
	 * 2.ID or Name,
	 *  3.WebElement.
	 * 
	 * By Index:(Code)- 
	 * driver.switchTo().frame(int number);
	 * driver.switchTo().frame(0);
	 * 
	 * By ID:(Code)- 
	 * driver.switchTo().frame("courses-iframe");
	 * 
	 * By Name:(Code)- 
	 * driver.switchTo().frame("iframe-name");
	 * 
	 * By WebElement 
	 * Code:-
	 * WebElement frameID = driver.findElement(By.id("courses-iframe"));
	 * driver.switchTo().frame(frameID);
	
	 *** Return back to the default page: 
	 *Code:- 
	 *driver.switchTo().defaultContent();
	 */
		 
	 
	 

}
