package training_Selenium;

public class WebElement_Command_4thClass {
	
	//By Strategy
	//Locators:--Id, Name, ClassName, TagName, Xpath, CssSelector, LinkText, PartialLinkText.
	
	//*ID:--
	//WebElement element = driver.findElement(By.id("name");
	//element.sendKeys("Ummay");
	//element.clear();
	//element.sendKeys("Roman");
	
	//OR
	//driver.findElement(By.id("name").sendKeys("Ummay");
	//driver.findElement(By.id("name").clear;
	//driver.findElement(By.id("name").sendKeys("Roman");
	
	//*Name:--
	//WebElement element = driver.findElement(By.name("enter-name");
    //element.sendKeys("Ummay");
	
	//*ClassName:--
	//WebElement element = driver.findElement(By.className("inputs");
	//element.sendKeys("Ummay");
	
	//*LinkText:--(Full Link)
	//WebElement element = driver.findElement(By.linkText("Sign In");
	//element.click();
	
	//*PartialLinkText:--(Part of the Link)
	//WebElement element = driver.findElement(By.partiallinkText("Sign"); 
	//element.click();
	
	//*TagName:--
	//WebElement element = driver.findElement(By.tagName("input");
	//element.sendKeys("Ummay");
	
	//CssSelector
	//tagName[locatorType = locatorValue]
	//input[name= "enter-name"]
	//WebElement element = driver.findElement(By.cssSelector("input[name= "enter-name"]");
	//element.sendKeys("Ummay");
	
	
	//**XPATH: --1.Absolate Xpath :-(Complete Xpath), 2.Relative Xpath.
	//WebElement element = driver.findElement(By.xpath("//*[@id='name']");
	//element.sendKeys("Ummay");
	
	
	//***FindElements(List):-- when We have find out total number of the webPage.and it's save in the List.
	//List<WebElement> element = driver.findElements(By.tagName("a"));
	//int isize = element.size();
	//system.out.println(issize);
	
	
	//Difference Between FindElement and FindElements:--
	//                       FindElement                                       FindElements
	
	//ZeroMatch              NoSuchElement Exception                           Return the Empty List.
	//One Match              Return The WebElement                             Return the matched value in the form of List.
	//One+ Match             Return the first webElement Present in the DOM.   Return all the matched value i the list.
	
	
	}
