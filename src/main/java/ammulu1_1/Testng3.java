package ammulu1_1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng3 {
	@BeforeMethod
	public void setup()
	{
		System.out.println("BeforeMethod");
		System.out.println("BeforeMethod1");
	}
	@AfterMethod
	public void shutdown()
	{
		System.out.println("AfterMethod");
		System.out.println("AfterMethod2");
	}
	@Test
	public void method1()
	{
		System.out.println("method1");
		System.out.println("method2");
	}
	@Test
	public void method2()
	{
		System.out.println("method2");
	}


}
