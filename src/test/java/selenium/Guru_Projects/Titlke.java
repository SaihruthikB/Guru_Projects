package selenium.Guru_Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Titlke {
	@Test
	public void verifytitle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("uid")).sendKeys("mngr199387");
		driver.findElement(By.name("password")).sendKeys("qEsYqUh");
		driver.findElement(By.name("btnLogin")).click();
		String S1=driver.getTitle();
		System.out.println("S1");
		String Expected_title = "Guru99 Bank Manager HomePage";
	    Assert.assertEquals(S1, Expected_title);
	    System.out.println("Success");
		
	}
	

}
