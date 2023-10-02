package training_Selenium;

public class Fetchdata_FromWebTable_8thCalss {
	
/*	 How to handle dynamic webtables using selenium.
	Webtable -->Anything that we see in the web page as a table formate is called  a webtable.
	<tr>--> Row
	<td>--> Column
	<th>--> Header.
	<html>
	
	<table>
	tbody>
	
	**Fetch data from webtable:-- 3 Ways
	1.First way:-
	WebElement element = driver.findElement(By.xpath("Copy the full xpath"));
	String text = element.getText();
	System.out.println(text);
	
	OR
	2. Second way:-
	String sRow = "3";
	String sCol = "2";
	
	Code:-
	WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div[2]/fieldset/table/tbody/tr["+sRow+"]/td["+sCol+"]"));
	String text = element.getText();
	System.out.println(text);
	
	OR
	3.3rd way:-
	String sCol = "Course";
	for(int i=0; i<3; i++)  {
		
		}
	
	//String sValue = null;
	WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div[2]/fieldset/table/tbody/tr[1]/th[+i]"));
	String text = element.getText();
	System.out.println(sValue);
	
	if(sValue.equalsIgnoreCase(sCol)) {
		for(int j=1; j<4; j++) {
String sRow = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div[2]/fieldset/table/tbody/tr[+j+]/td[+i+]")).getText();
		}
		break;
	}
	

}*/
}
