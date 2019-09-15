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

public class ExcelFrom_Guru {
	static Cell c1;
	@Test
	public static void Excel() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.manage().deleteAllCookies();
		d1.get("http://demo.guru99.com/test/newtours/register.php");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d1.findElement(By.name("firstName")).sendKeys(Method(1));
		d1.findElement(By.name("lastName")).sendKeys(Method(2));
		d1.findElement(By.name("phone")).sendKeys(Method(3));
		d1.findElement(By.name("userName")).sendKeys(Method(4));			
	}
public static String Method(int i) throws EncryptedDocumentException, InvalidFormatException, IOException
{
DataFormatter d1 = new DataFormatter();
 File f1 = new File("E:\\userdata\\sai.xlsx");
 FileInputStream fis = new FileInputStream(f1);
 Workbook w1 = WorkbookFactory.create(fis); 
Cell c1=w1.getSheet("Details").getRow(i).getCell(1);
return d1.formatCellValue(c1);
 
 
 
}

}
