package ammulu1_1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng3 {
	@BeforeMethod
	public void setup()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void shutdown()
	{
		System.out.println("AfterMethod");
	}
	@Test
	public void method1()
	{
		System.out.println("method1");
	}
	@Test
	public void method2()
	{
		System.out.println("method2");
	}


}
