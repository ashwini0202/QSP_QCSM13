package testNG;

import org.testng.annotations.Test;

public class TestCase13 {
	//creating dependency btwn testcase
	//failure of one test case will lead to skipping of dependent test case
	@Test()
	public void login() {
		System.out.println("hi");
		throw new ArithmeticException();
	}
	@Test(dependsOnMethods="login")
	public void addToCart() {
		System.out.println("add");
	}
	
	@Test(dependsOnMethods="addToCart")
	public void logOut() {
		System.out.println("logout");
	}

}
