package training_Selenium;

public class DropDownList_7thClass {
	/*
	 * How to handle Dropdown in Selenium There are two types of dropdown. note-->
	 * In dropdown if it is select then click function will not work, need to use
	 * the select class.
	 * 
	 * 1.Sigle Select drodown-->Only one value can be selected. 2.Multi Select
	 * dropdown--> More than one value can be selected.
	 * 
	 * Select--> Select class is used to handle dropdowns.
	 * 
	 * Code:-- WebElement element = driver.findElement(By.id("value")); Select
	 * select = new Select(element); Select.
	 * 
	 * Or Select select new Select (driver.findElement(By.id("Value")); Select.
	 * 
	 * 1.Sigle Select drodown:-- What are action command used to select the value
	 * from the dropdown:-- 1.SelectByIndex. 2.SelectByValue.
	 * 3.SelectByVisisbleText.
	 * 
	 * 1.SelectByIndex:-(Code) WebElement element =
	 * driver.findElement(By.id("carselect")); Select select = new Select(element);
	 * Select.selectByIndex("2");
	 * 
	 * 2.SelectByValue:-(code) WebElement element =
	 * driver.findElement(By.id("carselect")); Select select = new Select(element);
	 * Select.selectByValue("benz"); // Like Value = Satrt with lower case.
	 * 
	 * 3.SelectByVisisbleText:-(code) WebElement element =
	 * driver.findElement(By.id("carselect")); Select select = new Select(element);
	 * Select.selectByVisibleText("BMW"); //Like Start with capital later.
	 * 
	 * 2.Multi Select DropDown:-
	 * 
	 * isMultiple(): boolean WebElement element =
	 * driver.findElement(By.id("multiple-select-example")); Select select = new
	 * Select(element);
	 * 
	 * if(select.isMultiple()) { select.selectByIndex("0");
	 * select.selectByValue("orange"); select.selectByVisibleText("Peach"); }
	 * 
	 * 1.getOption--> To fetch the options of the dropdown.
	 * 2.getFirstSelectOption-->Used to fetch the first selected option.
	 * 3.getAllSelectOption-->Used to fetch the all selected Option.class
	 * 
	 * 1.getOption:-- WebElement element = driver.findElement(By.id("carselect"));
	 * Select select = new Select(element); List<WebElement> allOption =
	 * select.getOption(); int isize = allOption.size(); System.out.println(isize);
	 * 
	 * for(int i=0; i<isize; i++) {
	 * 
	 * String sValue = allOption.get(i).getText(); System.out.println(sValue); }
	 * 
	 * 2.getFirstSelectOption:-- WebElement element =
	 * driver.findElement(By.id("carselect")); Select select = new Select(element);
	 * WebElement firstSelectedOption = select.getFirstSelectedOption();
	 * System.out.println(firstSelectedOption);
	 * 
	 * 3.getAllSelectOption:-- List WebElement element =
	 * driver.findElement(By.id("multiple-select-example")); Select select = new
	 * Select(element); List<WebElement> allOption = select.getAllSelectOption();
	 * int isize = allOption.size(); System.out.println(isize);
	 * 
	 * for(int i=0; i<isize; i++) { String sValue = allOption.get(i).getText();
	 * System.out.println(sValue); }
	 * 
	 * deselectAll()--> It is used to deselect all the selected values of a multi
	 * select dropdown. deselectByIndex deselectByValue deselectByVisibleText
	 * 
	 * WebElement element = driver.findElement(By.id("multiple-select-example"));
	 * Select select = new Select(element);
	 * 
	 * select.dedelectByValue("apple");
	 */

}
