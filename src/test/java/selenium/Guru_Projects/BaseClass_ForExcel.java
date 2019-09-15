package selenium.Guru_Projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_ForExcel

{
	WebDriver driver;
	@org.testng.annotations.BeforeTest
	public static void BeforeTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.biba.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public String excel(int i,int j, String sheet) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File f1 = new File("");
		FileInputStream fis = new FileInputStream(f1);
		Workbook w1 = WorkbookFactory.create(fis);
		String c1= w1.getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
		return c1;
		
	}
}
	
