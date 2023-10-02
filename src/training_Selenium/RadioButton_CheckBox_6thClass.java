package training_Selenium;

public class RadioButton_CheckBox_6thClass {
	
	//Radio Button:--
	
	//1.Type = radio
	//2.Single select
	//3.If a value is selected you cannot uncheck it.
	//User can Only change the option but one button should always be selected.
	//For radio button the name attribute is same only the values will be different.
	
	// How to locate radio button and Checkbox.
	
	//Most of the time 1.ID, 2. Xpath, 3. CssSelector.
	
	//Radio Button/ID:--
	//WebElement buttonRadio = driver.findElement(By.Id("bmwradio"));
    //buttonRadio.click();
	
	//Radio Button/Xpath:--
	//Xpath-->//*[@id="bmwradio" and @type="radio"]
	//WebElement buttonRadio = driver.findElement(By.xpath("//*[@id="bmwradio"]"));
    //buttonRadio.click();
	
	//RadioButton/CssSelector:--
	//xpath--> tagname[LocatorType = LocatorValue]
	//WebElement buttonRadio = driver.findElement(By.cssSelector("input[id= bmwradio"));
    //buttonRadio.click();
	
	//CheckBox/Id:--
	//WebElement checkBox = driver.findElement(By.Id("bmwcheck"));
    //checkBox.click();
	
	//CheckBox/Xpath:--
	//WebElement checkBox = driver.findElement(By.xpath("//*[@id="bmwcheck" and @type="checkbox"]"));
    //checkBox.click();
	
	//CheckBox/cssSelector:--
	////WebElement checkBox = driver.findElement(By.cssSelector("input[id=bmwcheck"));
    //checkBox.click();
	
	//*** Action can be performed.1.IsDisplayed, 2.IsEnabled, 3.IsSelected
	//**IsDisplyed/Radio:--
	//WebElement element = driver.findElement(By.id("bmwradio"));
	//boolean status = element.isDisplyed();
	//if(status == true)
	//{
	//	  element.click();
	
	// 	}
	
	//**IsEnabled/Radio:--
	//WebElement element = driver.findElement(By.id("bmwradio"));
		//boolean status = element.isEnabled();
		//if(status == true)
		//{
		//	  element.click();
		
		// 	}
	
	//**IsSelected/Radio:--
	//WebElement element = driver.findElement(By.id("bmwradio"));
	//boolean status = element.isSelected();
	//if(status == true)
	//{
	//	  element.click();
			
	// 	}
	
	//**IsDisplyed/CheckBox:--
	//WebElement element = driver.findElement(By.id("bmwradio"));
	//boolean status = element.isDisplyed();
	//if(status == true)
	//{
	//	  element.click();
	
	// 	}
	
	//**IsEnabled/CheckBox:--
	//WebElement element = driver.findElement(By.id("bmwradio"));
		//boolean status = element.isEnabled();
		//if(status == true)
		//{
		//	  element.click();
		
		// 	}
	
	//**IsSelected/CheckBox:--
	//WebElement element = driver.findElement(By.id("bmwradio"));
	//boolean status = element.isSelected();
	//if(status == true)
	//{                                                 //If THe CheckBox is Selected it will deselect it.
	//	  element.click();
			
	// 	}
	
	//Or
	//if(status == false)
	//{                                                 //If THe CheckBox is not Selected it will select it.
	//	  element.click();
				
	// 	}
		
}
	
	
	
	
	
	
	
	

