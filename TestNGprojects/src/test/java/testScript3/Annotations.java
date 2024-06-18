package testScript3;

import org.testng.annotations.Test;

public class Annotations extends Base {
	@Test(priority=1)
	public void test1() {
		System.out.println("Hello");
	}
	@Test(priority=2)
	public void all() {
		System.out.println("Hi all");
	}

}
