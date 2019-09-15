package selenium.Guru_Projects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Biba_MouseOver {
	@Test
	public static void Biba() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.biba.in/");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement element = d1.findElement(By.xpath("(//img[@class='lazy-load-img fade-in'])[1]"));
		((JavascriptExecutor) d1).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000); 		
		JavascriptExecutor executor = (JavascriptExecutor)d1;
		
		executor.executeScript("arguments[0].click();", element);
		System.exit(0);

		d1.findElement(By.xpath("(//img[@title='Anarkali Suit Sets'])[1]")).click();
		//WebElement e1=d1.findElement(By.xpath("//span[@class='main_navbtn_l']/following-sibling::span[text()='Mix & Match']"));
		//Actions a1 = new Actions(d1);
		//Action a2=a1.moveToElement(e1).build();
		//a2.perform();
		//d1.findElement(By.xpath("(//a[text()='Dresses'])[3]")).click();
		//d1.findElement(By.xpath("(//img[@class='att_shape'])[1]")).click();
		
		
		
		
		
		
	}
	}
