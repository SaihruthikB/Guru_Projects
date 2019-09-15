package selenium.Guru_Projects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Subnavigation {
	@Test
	public static void Sub() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("http://www.biba.in");
		WebElement e1=d1.findElement(By.xpath("//span[text()='Mix & Match']"));
		Actions a1 = new Actions(d1);
		a1.moveToElement(e1).perform();
		d1.findElement(By.xpath("(//a[text()='Kurtas'])[2]")).click();
		File f1=((TakesScreenshot) d1).getScreenshotAs(OutputType.FILE);
		File f2 = new File("E:\\Screenshot143.png");
		FileUtils.copyFile(f1, f2);
	
		
	}

}
