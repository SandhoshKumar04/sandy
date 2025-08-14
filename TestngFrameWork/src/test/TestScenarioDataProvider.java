package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestScenarioDataProvider {

	@Test(dataProvider="logindata")
	public void dataProv(int weight, String name) {
		
		System.out.println("Weighing " +weight+ " pounds" + " and His name is " + name );
		
	}
	
	@DataProvider(name = "logindata")
	public Object[][] getData() {
		
		return new Object[][] {
			
			{240, "John Cena"},
			{245, "Randy Orton"}
			
		};
		
	}
}
