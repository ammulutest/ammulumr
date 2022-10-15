package ammulu1_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TEstng2 {
	@BeforeClass
	public void method1() {
		System.out.println("method1");
	}
	@AfterClass
	public void method2() {
		System.out.println("method2");
	}
	@Test(priority=2)
	public void method3() {
		System.out.println("method3");
	}
	@Test(priority=1)
	public void method4() {
		System.out.println("method4");
	}
	

}
