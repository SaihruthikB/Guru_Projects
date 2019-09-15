package selenium.Guru_Projects;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_And_Drop {
	@Test
	public static void Drop()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.manage().deleteAllCookies();
		d1.get("https://jqueryui.com/resizable/");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d1.switchTo().frame(0);
		//WebElement d=d1.findElement(By.id("draggable"));
		//WebElement d2 = d1.findElement(By.id("droppable"));
		Actions a1 = new Actions(d1);
		a1.moveToElement(d1.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"))).release().build().perform();
		
	}
	

}
