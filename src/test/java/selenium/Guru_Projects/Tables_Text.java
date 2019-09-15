package selenium.Guru_Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables_Text {
@Test
public static void Table()
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver d1 = new ChromeDriver();
	d1.manage().window().maximize();
	d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d1.get("http://demo.guru99.com/test/write-xpath-table.html");
	String s1=d1.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
	System.out.println(s1);
	
}
}
