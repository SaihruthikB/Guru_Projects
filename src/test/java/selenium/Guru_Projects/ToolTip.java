package selenium.Guru_Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip 
{
	
	@Test
	public static void Tooltip()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/social-icon.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String s1=driver.findElement(By.xpath("//a[@class='facebook']")).getAttribute("Title");
		System.out.println(s1);
		Assert.assertEquals(s1, "Facebook");
		
		
		
		
		
		
		
	}
}
	
		
		
		
	


