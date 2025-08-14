package test;

import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScenario01 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before test suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class");
	}
	
	@BeforeTest
	public void Mobiledisplay() {
		System.out.println("This is before test");
	}
		
	@Test(timeOut=4000)
	public void Mobilelogin() throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(5));
		System.out.println("User Logged in   :  1");
	}
	
	@Test(enabled=false)
	public void Laplogin() {
		
		System.out.println("Logged in with Laptop :  2");
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class");
	}
	
	@Test(groups= {"Smoke"})
	public void smoke() {
		System.out.println("Smoke test 01");
	}
	
	@AfterTest
	public void aftertest() {
		
		System.out.println("This is after Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("This si after suite");
		
	}
	
}
