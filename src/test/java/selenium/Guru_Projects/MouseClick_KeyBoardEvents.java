package selenium.Guru_Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseClick_KeyBoardEvents {
	@Test
	public static void Mouse_Event()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("http://demo.guru99.com/test/newtours/");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement e1 =d1.findElement(By.linkText("Home"));
		Actions a1 = new Actions(d1);
		Action a2=a1.moveToElement(e1).build();
		a2.perform();
		//Action a3 = a1.moveToElement(e1).click().keyDown(e1, Keys.SHIFT).sendKeys(e1, "Hello").doubleClick(e1).contextClick().build();	
		//a3.perform();
	}

}
