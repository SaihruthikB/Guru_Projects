package selenium.Guru_Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvents {
	@Test
	public static void Drop()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.manage().deleteAllCookies();
		d1.get("https://www.biba.in/");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions a1 = new Actions(d1);
		for(int i=1; i<=30; i++)
		{
		a1.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		d1.findElement(By.xpath("(//img[@class='mtb-img'])[1]")).click();
	

	}
			
		}
