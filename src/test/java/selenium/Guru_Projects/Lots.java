package selenium.Guru_Projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lots {
	@Test
	public static void Lots1() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.lotswholesale.com");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d1.findElement(By.xpath("//input[@class='useridtxt InputUserName digitonly']")).sendKeys(Method(1));
		d1.findElement(By.xpath("//input[@class='userpwdtxt']")).sendKeys(Method(2));
		d1.findElement(By.xpath("//input[@name='btnloginSubmit']")).click();
		d1.findElement(By.xpath("//span[@class='main_navbtn_m']")).click();
		d1.findElement(By.xpath("((//li[@class='main_pulldown_li']/a[@class='sf-with-ul'])[text()='Baby Care '])[1]")).click();
	}
  public static String Method(int i) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	  DataFormatter d1 = new DataFormatter();
	  File f1 = new File("E:\\userdata\\Biba.xlsx");
	  FileInputStream fis = new FileInputStream(f1);
	  Workbook w1 = WorkbookFactory.create(fis);
	  Cell c1=w1.getSheet("Kumar").getRow(0).getCell(i);
	  return  d1.formatCellValue(c1);
	  
	  
	  
	
	
}
}
