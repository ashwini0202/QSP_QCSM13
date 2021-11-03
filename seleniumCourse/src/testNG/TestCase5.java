package testNG;

import org.testng.annotations.Test;

public class TestCase5 {
	
	@Test(priority=0)
	public void a1() {
		System.out.println("hello");
	}
	@Test(priority=-1)
	public void b1() {
		System.out.println("hii");
	}
	@Test(priority=2)
	public void c1() {
		System.out.println("bye");
	}

}
