package testNG;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups={"resgressiontestcase"})
	
	public void sample() {
		System.out.println("this is regression tescase");
	}
	
	@Test(groups={"smoketestcase"})
	public void sample1() {
		System.out.println("this is smoke tescase");
	}

}
