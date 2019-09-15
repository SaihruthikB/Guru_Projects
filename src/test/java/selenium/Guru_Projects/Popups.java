package selenium.Guru_Projects;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popups {
	@Test
	public static void Alert()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("user");
		driver.findElement(By.name("password")).sendKeys("pwd");
		driver.findElement(By.name("btnLogin")).click();
		Alert alert = driver.switchTo().alert();
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		alert.accept();
		
		
		
		
		
		
		
	}

}
