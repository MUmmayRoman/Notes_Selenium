package training_Selenium;

public class Navigation_Command_3rdClass {
	
	//Types Of Navigation Command:--
	//1.To Command
	//2.Forward Command
	//3.Back Command
	//4.Refresh Command.
	
	//Note:--All the navigation method will only work after the navigate() method.
	//**1.To Command--> To command is perform exactly as the get() coomand which is used to load the url in the web browser.
	//to(String args): void-->To command accepts string as a parameter and does not return any value.
	
	//Webdriver driver;
	//driver.navigate().to("https://www.letskodeit.com/practice");
	
	//OR
	//String url ="https://www.letskodeit.com/practice";
	//driver.navigate().to(url);
	
	//**2.Forward Command:--It is used to move forward, if a user have the forward button enabled in the browserthen this command will work.
	//forward(): void--> Forward command neith accepts anything as a parameter nor it returns any value.
	//driver.navigate().forward();
	
	//**3.Back Command--> Back command is used to move backward, if a user have the back button enabled in the browser then this command will work.
	//back(): void--> Back Command neith accepts anything as a parameter nor it returns any value.
	//driver.navigate().back;
		
	//**4.Refresh Command--. Refresh commandis used to refresh the current web page.
	//refresh(): void--> Refresh command neith accepts anythings as a parameter nor it returns any value.
	//driver.navigate().refresh();

}
