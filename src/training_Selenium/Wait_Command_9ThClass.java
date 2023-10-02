package training_Selenium;

public class Wait_Command_9ThClass {
	/*
	 * // Two types of Wait Commands:-
	 *   1.Implicit wait: 
	 *      1.1 Implicitlywait
	 *      1.2 PageLoadTimeout. 
	 *      1.3 setScriptTimeout. 
	 *      
	 *   2.Explicit Wait:
	 *   
	 *   2.1 WebDriverwait. 
	 *   2.2 FluentWait. 
	 *   
	 *    1. Implicit wait: 
	 *     1.1 Implicitlywait command: 
	 *     
	 *      Code:-
	 * driver.manage().timeout().implicitlyWait(30, Timeunit.SECONDS); 
	 *  
	 *  1.2  PageLoadTimeout: 
	 *       driver.manage().timeout().pageLoadTimeout(120, Timeunit.Seconds); 
	 
	 *  1.3 setScriptTimeout:
	 * driver.manage().setScriptTimeout(120, Timeunit.SECONDS); 
	    
	     2.Explicitwait: 
	     2.1 WebDriverwait Command: 
	     
	      WebDriver wait = new WebDriver(driver, 30);
	       WebElement element = wait.until(ExpectedCondition.elementToBeClickable(By.id(("")));
	       
	       2.2FluentWait Comman:---(Important) 
	        Wait<WebDriver>Wait = new FluentWait<WebDriver>(driver).withTimeout(40, SECONDS).pollingEvery(5, SECONDS)
	        .ignoring(NoSuchElementException.class); 
	        
	         WebElement element = wait.until(driver.findWElement(By.id(""))); 
	          element.Click();
	 */
	
	/* In Explicit Wait We can use some Element:----
	 * 1.alertISPresent():Waits till the alert gets present.
	 *  2.elementToBeClickable(locator):Waits for an element to be Clickable.
	 * 3.elementToBeSelected(element): Waits till the element gets selected.
	 *  4.frameToBeAvailableAndSwitchToIt(locator): Waits for a frame to be available and switch to it.
	 * 5.invisisbilityOf(element): Waits till the element become invisible.
	 *  6.presenceOfAllElementsLocatedBy(locator): Waits for all elements located by a given locator to be present.
	 * 7.presenceOfAllElementLocated(locator): Waits for an elements located by a given locator to be present.
	 * 8.textToBePresentInElement(element, text): Waits till the given text gets present in an element.
	 * 9.textToBePresentInElementLocated(locator, text): Waits for a given text to be present in an element located by a given locator.
	 * 10.titleIs(title): Waits for a page title to be specific value.
	 * 10.titleContains(title): Waits for a page title to contain a specific value.
	 *  11.visibilityOf(element): Waits for an element to bacome visible.
	 */
}   
