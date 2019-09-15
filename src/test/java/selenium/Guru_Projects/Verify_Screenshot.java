package selenium.Guru_Projects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Screenshot {
	@Test
	public static void Screen() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("http://www.demo.guru99.com/V4/");
		//d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//d1.findElement(By.name("uid")).sendKeys("mngr199387");
		//d1.findElement(By.name("password")).sendKeys("qEsYqUh");
		//d1.findElement(By.name("btnLogin")).click();
		File src = ((TakesScreenshot)d1).getScreenshotAs(OutputType.FILE);
		File DestFile=new File("E:\\Screenshot126.png");
		FileUtils.copyFile(src,DestFile );
		
		
	
	}
}
			
		
			
		
			

		
		
		



