package selenium.Guru_Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	@Test
	public static void Upload()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("http://demo.guru99.com/test/upload/");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement e1=d1.findElement(By.xpath("//input[@class='upload_txt']"));
		e1.sendKeys("E:\\Screenshot123.png");
		d1.findElement(By.id("terms")).click();
		d1.findElement(By.id("submitbutton")).click();
	}

}
