package june11th;

import org.testng.annotations.Test;

public class Test_TC01 
{
	@Test(groups="Regression")
	public void testCaseOne()
	{
	System.out.println("Im in testCaseOne - And in Regression Group");
	}
	@Test(groups="Regression")
	public void testCaseTwo(){
	System.out.println("Im in testCaseTwo - And in Regression Group");
	}
	@Test(groups="Smoke")
	public void testCaseThree(){
	System.out.println("Im in testCaseThree - And in Smoke Test Group");
	}
	@Test(groups="Regression")
	public void testCaseFour(){
	System.out.println("Im in testCaseFour - And in Regression Group");
	}
}