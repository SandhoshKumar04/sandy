package test;

import java.time.Duration;

import org.testng.annotations.Test;

public class ParalelTest01 {

	
	@Test
	public void Test01() throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(5));
		System.out.println("This is test 01");
	}
	
	@Test
	public void Test02() throws InterruptedException {
		
		Thread.sleep(Duration.ofSeconds(6));
		System.out.println("This si test 02");
		
	}
}
