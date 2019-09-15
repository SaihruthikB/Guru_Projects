package selenium.Guru_Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip1 {
	@Test
	public static void Tool()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.manage().deleteAllCookies();
		d1.get("https://jqueryui.com/tooltip/");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d1.switchTo().frame("5d8762254038dae1cd1cbe29d0dae5c7");
		String Tool = d1.findElement(By.xpath("//a[text()='Tooltips']")).getAttribute("title");
		System.out.println(Tool);
		
	}
	
	

}
