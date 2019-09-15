package selenium.Guru_Projects;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

@BeforeTest
	public static void Test1()
	{
		System.out.println("Surjana");
	}

@AfterTest
public static void Test3()
{
	System.out.println("Em ra vadilestunnva nannu");
}
@Test
public static void Test2()
{
System.out.println("Thinnavira");
}
}



