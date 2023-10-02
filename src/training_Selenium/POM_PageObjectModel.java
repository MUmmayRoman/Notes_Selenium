package training_Selenium;

public class POM_PageObjectModel {
	
	/*Advance level
	POM--Page Object Model:--There are Two ways
	1.Page Object Repository:(Project)
	src
	pageObjects(Package 1)
	LogInPage.java(Classfile)
	HomePage.java(Classfile)
	LogOutPage.java(Classfile)
	
	automationFramework(Package 2)
	PageObjectModel(Classfile)
	
	
    2.Page Object Factory:we use Log4j using XML file.
    	@FindBy(how = HOW.ID, using="")
	public WebElement text_Username;
	
	Login_Page loginpage
	loginpage = pageFactory.initElements9driver, Login_Page.class);
	
	PageObjectFactory(Project)
	src
	pageFactory(Package 1)
	Login_Page.java(Classfile)
	Home_Page.java(Classfile)
	Log.java(Classfile)
	
	automationFramework(Package 2)
	TestCase.java(Classfile)
	Log4j.xml
    	
    	Frameworks:
    		1.Data Driven Framework:
    			-->Fetching data from excel.
    			-->Save data to an excel.
    			
    		2.Keyword Driven Framework.
    		3.Hybrid framework.
    		4.Modular Framework.
    		
    		Maven:--
}
*/