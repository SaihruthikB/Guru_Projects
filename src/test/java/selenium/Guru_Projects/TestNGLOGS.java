package selenium.Guru_Projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGLOGS {
static WebDriver driver;
	@BeforeMethod
	public void OpenBrowser()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.biba.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("*****Browser started*******", true);
	}
	@Test
	public void Click() 
	{
driver.findElement(By.xpath("//span[@class='main_navbtn_l']/following-sibling::span[text()='Mix & Match']"))
		.click();
        Reporter.log("*****Click on Mix & Match*******", true);
	}
	@AfterMethod
	public static void Quit()
	{
		driver.quit();
	}
	
	

}
