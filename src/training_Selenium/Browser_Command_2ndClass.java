package training_Selenium;

public class Browser_Command_2ndClass {
	//**Types Of Browser Command:--
		//1.Get Command(get)
		//2.Get Title Command(getTitle)
		//3.Get Current url command(getCurrentUrl)
		//4.Get PageSource Command(getPageSource)
		//5.Close Command(close)
		//6.Quit Command(quit).
		
		//1.Get Command(get):--It is used to load the webPage in a browser.
		//get(String args): void--> Get command accepts string as a parameter and does not return any value.
		
		//WebDriver driver; (Command WebDriver Initilazation.
		//https://www.letskodeit.com/home
		//driver.get(https://www.letskodeit.com/practice); (Always pass the complete URL with the protocol.
		
		//OR
		//String url = "https://www.letskodeit.com/practice";
		//driver.get(url);
		
		//2.Get Title Command(getTitle):--Get Titel command is used to fetch the title of the web page.
		//getTitle(): String--> Get title command does not accept anything as a parameter but return a String value.
		
	    //String pageTitle = driver.getTitle();
		//System.out.println(pageTitle);
		
		//OR
		//System.out.println("The Title of the WebPage is : +"pageTitle);
		
		
		//**3.Get Current url command:--It is used to fetch the Current url written in the url section of the web Browser.
		//getCurrentUrl():String-->Get Corrent Url command does not accepts anything as a parameter but return a string value.
		
		//String actualUrl = driver.getCurrentUrl();
		//System.out.println(actualUrl);
		
		//**4.Get PageSource Command-->It is used to fetch the entire source code of the webpage opened in the browser.
		//getPageSource():String--> Get Page Source command does not accepts anything as a parameter but return a string value.
		
		//String pageSourceCode = driver.getPagesource();
		//System.out.println(pageSourceCode);
		
		
		//**5.Close Command(close):--It is used to close the current Window of the webpage opened in the browser.
		//Close() : void---> It neither accepts anything as a parameter nor it returns any value.
		//driver.close();
		
		//**6.Quit Command(quit).-->It is used to close all the Window opened in the browser.
		//Quit() : void---> It neither accepts anything as a parameter nor it returns any value.
		//driver.quit();
		

	}



