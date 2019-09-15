package selenium.Guru_Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_Image {
	@Test
	public static void Image()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d1= new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.facebook.com/");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d1.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		d1.findElement(By.cssSelector("a[title='Go to Facebook home']")).click();
		String a=d1.getTitle();
		System.out.println(a);
		String Ex = "Facebook – log in or sign up";
		Assert.assertEquals(a, Ex);
		{
			System.out.println("we are back to the FB home page");
			
		}
		
		
		
	}

}
