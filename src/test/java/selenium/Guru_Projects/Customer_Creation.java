package selenium.Guru_Projects;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Customer_Creation {
	@Test
	public static void CustomerCreation()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr199387");
		driver.findElement(By.name("password")).sendKeys("qEsYqUh");
		driver.findElement(By.name("btnLogin")).click();
		Select s1= new Select(driver.findElement(By.linkText("#")));
		s1.selectByVisibleText("Table Demo");
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("hruthik");
		WebElement radio1=driver.findElement(By.name("rad1"));
		radio1.click();
	}

}
