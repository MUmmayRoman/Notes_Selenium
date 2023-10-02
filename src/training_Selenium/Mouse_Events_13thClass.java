package training_Selenium;

public class Mouse_Events_13thClass {
	
	/*
	 * Mouse Events:- 
	 * 1.Left Click-->Click()
	 *  2.Right Click. 
	 *  3.Double Click. 
	 *  4.Mouse Hover. 
	 *  5.Drag And Drop.
	 * 
	 * Actions action = new Actions(driver);
	 * 
	 * 2.Right Click--> contextClick(); 
	 * Code:-
	 *  Actions action = new Actions(driver);
	 * WebElement element = driver.findElement(By.id(""));
	 * action.contextClick(element).perform();
	 * 
	 * 3.Double Click-->doubleClick(). 
	 * Code:-
	 *  Actions action = new Actions(driver);
	 * WebElement element = driver.findElement(By.id(""));
	 * action.doubleClick(element).perform();
	 * 
	 * ImprtantOne: 
	 * 4.Mouse Hover-->moveToElement().
	 * 
	 * Code:-(For Main Menu Hover)
	 *  Actions action = new Actions(driver); 
	 *  WebElement menu = driver.findElement(By.id("")); 
	 *  action.moveToElement(menu).perform();
	 * 
	 * For MenuOption(Second Hover): 
	 * WebElement menuOption = driver.findElement(By.id("")); 
	 * action.moveToElement(menuOption).perform();
	 * 
	 * For Third Hover (SubMenu):-- 
	 * WebElement subMenu = driver.findElement(By.id("")); 
	 * subMenu.Click();
	 * 
	 * 5.Drag And Drop--> dragAndDrop(). 
	 * Actions action = new Actions(driver);
	 * WebElement from = driver.findElement(By.id("")); 
	 * WebElement to = driver.findElement(By.id("")); 
	 * action.dragAndDrop(from, to).build().perform();
	 */

}
