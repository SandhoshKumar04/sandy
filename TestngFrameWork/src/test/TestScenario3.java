package test;

import org.testng.annotations.Test;

public class TestScenario3 extends TestScenario01{

	@Test
	public void main() {
		System.out.println("This is TestScenario 03");
	}
	
	@Test(groups= {"Smoke"})
	public void smoke02() {
		System.out.println("Smoke test 03");
	}
}
