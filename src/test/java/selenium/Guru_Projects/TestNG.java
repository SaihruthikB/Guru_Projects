package selenium.Guru_Projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {
	static Cell user;
	static Cell password;
	
	@Test
	
	public void testNgVerification() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.biba.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("loginlnk")).click();
		File f1 = new File("E:\\userdata\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f1);
		Workbook w1= WorkbookFactory.create(fis);
		for (int i=0; i<=4;i++)
		{
			user=w1.getSheet("Customerdetails").getRow(i).getCell(0);
			password= w1.getSheet("Customerdetails").getRow(i).getCell(1);
			DataFormatter d1 = new DataFormatter();
			String user1= d1.formatCellValue(user);
			String passwrod= d1.formatCellValue(password);
			driver.findElement(By.name("UserName")).sendKeys(user1);;
		    driver.findElement(By.name("Password")).sendKeys(passwrod);
		    driver.findElement(By.className("loginlnk")).click();
		    Thread.sleep(2000);
		}
		
		
		
	}

}
