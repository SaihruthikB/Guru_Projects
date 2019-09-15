package Test2;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Page {
	public static void main(String args[]){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("uid")).sendKeys("UserId");
		driver.findElement(By.name("password")).sendKeys("Password");
		driver.findElement(By.name("btnLogin")).click();
		String my_title =  driver.getTitle();
		System.out.println("my_title");
		
	}

}
