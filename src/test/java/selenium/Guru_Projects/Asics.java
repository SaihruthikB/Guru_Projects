package selenium.Guru_Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asics {
	@Test
	public static void Asics1()
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.asics.com/in/en-in/men");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//d1.findElement(By.xpath("(//a[@class='dylan-link'])[1]")).click();
		d1.findElement(By.xpath("(//div[@id='headingvar'])[4]")).click();
		WebElement w1=d1.findElement(By.xpath("(//a[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]"));
		WebElement w2=d1.findElement(By.id("pricerange_price"));
		Actions a1 = new Actions(d1);

		
		//a1.clickAndHold(w1).moveToElement(w2).release().build().perform();
		a1.clickAndHold(w1).moveToElement(w2).release().perform();
		
		
		
		
		
	}

}
