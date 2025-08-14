package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestScenario02 {

	@Test(dependsOnMethods = {"Mobilelogin"})
	public void Mobiletestcase() {
		System.out.println("Test Case 03");
		
	}
	
	@Parameters({"Name"})
	@Test
	public void displayname(String name) {
		System.out.println(name);
	}
	
	@Test(groups= {"Smoke"})
	public void smoke01() {
		System.out.println("Smoke test 02");
	}
	
}
