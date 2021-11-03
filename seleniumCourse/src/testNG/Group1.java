package testNG;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups={"smoketestcase"})
	public void sample() {
		System.out.println("this is smoke tescase");
	}
	
	@Test(groups={"resgressiontestcase"})
	public void sample1() {
		System.out.println("this is regression tescase");
	}

}
