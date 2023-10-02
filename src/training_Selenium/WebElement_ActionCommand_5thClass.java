package training_Selenium;

public class WebElement_ActionCommand_5thClass {
	
	/*
	 * Action:-- 1.Clear 2.SendKeys 3.Click 4.IsDisplayed 5.IsEnabled 6.IsSelected
	 * 7.Submit 8.GetText 9.GetTagName 10.GetCssValue 11.GetAttribut 12.GetSize
	 * 13.GetLocation.
	 * 
	 * 1.Clear Command--> In order to clear any text area we need to use clear
	 * Command. Clear():void-->Clear command does not accepts anything as parameter
	 * nor it returns any value. Code:-- WebElement element =
	 * driver.findElement(By.id("name")); element.clear(); element.senKeys("ummay");
	 * 
	 * OR driver.findElement(By.id("name")).clear();
	 * driver.findElement(By.id("name")).sendKeys("Ummay");
	 * 
	 * 2.SendKeys Command--> In order pass any parameter to an input text area we
	 * need to use sendKeys Command. sendKeys(Char Seq): void--> SendKeys Command
	 * accepts CharSeq as a parameter and does not returns any value.
	 * 
	 * WebElement element = driver.findElement(By.id("name"));
	 * element.senKeys("ummay");
	 * 
	 * 3.Click Command:-Click Command is used to click on any button or a links.
	 * it's just a mouse left click. Click(): void--> Neither it accepts anything as
	 * a parameter nor it returns value. Code:- WebElement element =
	 * driver.findElement(By.id("name")); element.click();
	 * 
	 * 4.IsDisplayed Command:- It is used to varify whether the webElement is
	 * diplayed in the webpage or not. IsDisplayed(): boolean--> It does Not accepts
	 * anything as a parameter but returns a boolean value. Code:- WebElement
	 * element = driver.findElement(By.id("name")); boolean textValue =
	 * element.isDisplayed();
	 * 
	 * OR boolean textValue = driver.findElement(By.id("name")).isDisplayed();
	 * 
	 * 5.IsEnabled Command:- It is used to verify whether the webElement is enabled
	 * in the webPage or not. IsEnabled(): boolean-->It does Not accepts anything as
	 * a parameter but returns a boolean value. Code:- WebElement element =
	 * driver.findElement(By.id("name")); boolean textValue = element.isEnabled();
	 * 
	 * OR boolean textValue = driver.findElement(By.id("name")).isEnabled();
	 * 
	 * 6.IsSelected Command:-It is used to verify whether the webElement is selected
	 * in the webPage or not. IsSelected():boolean-->It does Not accepts anything as
	 * a parameter but returns a boolean value.
	 * 
	 * Code:- WebElement element = driver.findElement(By.id("name")); boolean
	 * textValue = element.isSelected();
	 * 
	 * OR boolean textValue = driver.findElement(By.id("name")).isSelected();
	 * 
	 * 7.Submit Command:-It performs the same as click command the only difference
	 * is click command works everywhere whereas submit command will only work which
	 * has a type as submit. Submit():void --> Neither it accepts anything as a
	 * parameter nor it returns any value.
	 * 
	 * Code:- WebElement element = driver.findElement(By.id("name"));
	 * element.submit(); OR driver.findElement(By.id("name")).submit();
	 * 
	 * 8.GetText Command:-It is used to fetch the text in a webPage.
	 * getText():String--> It does not accepts anything as a parameter but it
	 * returns a string value.
	 * 
	 * Code:- WebElement element = driver.findElement(By.id("name")); String text =
	 * element.getText(); System.out.println(text);
	 * 
	 * OR String text =driver.findElement(By.id("name")).getText();
	 * 
	 * 9.GetTagName Command:- It is used to fetch the tagName of a webElement.
	 * getTagName(): String-->It does not accepts anything as a parameter but it
	 * returns a string value.
	 * 
	 * Code:- WebElement element = driver.findElement(By.id("name")); String tags =
	 * element.getTagName(); System.out.println(tags);
	 * 
	 * OR String tags = driver.findElement(By.id("name")).getTagName();
	 * 
	 * 10.GetCssValue Command-->It is used to fetch the CSS property or
	 * color/background of a webElemnt. getCSSValue(): String--> It does not accepts
	 * anything as a parameter but it returns a string value.
	 * 
	 * Code: WebElement element = driver.findElement(By.id("name")); String cssValue
	 * = element.getCssValue(); System.out.println(cssValue);
	 * 
	 * 11.GetAttribute Command--> It is used to fetch the attributevalue of a
	 * webElement. getAttribute(String Name): String--> It accepts string as a
	 * parameter also eturns a string value.
	 * 
	 * Code: WebElement element = driver.findElement(By.id("name")); String
	 * attribute = element.getattribute(id); System.out.println(attribute);
	 * 
	 * o/p--.Name 12.GetSize Command:-It is used to fetch the dimension of a
	 * webElement(Height and Width). getSize(): Dimension--> It does not accepts
	 * anything as a parameter but returns a dimension value.
	 * 
	 * Code:- WebElement element = driver.findElement(By.id("name")); Dimension
	 * dimensions = element.getSize(); System.out.println("Height:"
	 * +dimensions.height "Width: "+dimensions.width);
	 * 
	 * 13.Get Location Command:-It is used to fetch the co=ordinates of a webElemnt.
	 * getLocation():point--> It does not accepts anything as a parameter but
	 * returns a point value.
	 * 
	 * Code:- WebElement element = driver.findElement(By.id("name")); Point point =
	 * element.getLocation(); System.out.println("x-axis: " +point.x "Y-axis :"
	 * +point.Y);
	 */

}
