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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadData_FromExcel {
	static Cell Login;
	static Cell Password; 
	static WebDriver driver;
	public static void main(String args[]) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ReadData();
	}
	public static void ReadData() throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		File f1 = new File("E:\\userdata\\Mavan_Project.xlsx");
		FileInputStream f2 = new FileInputStream(f1);
		Workbook w1 = WorkbookFactory.create(f2);
		for(int i=1; i<=3; i++);
		{
			int i=1;
			Login =w1.getSheet("Mavan").getRow(i).getCell(1);
			Password= w1.getSheet("Mavan").getRow(i).getCell(2);
			DataFormatter d=new DataFormatter();
			String user= d.formatCellValue(Login);
			String pwd= d.formatCellValue(Password);
			driver.findElement(By.name("uid")).sendKeys(user);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.name("btnLogin")).click();
			Alert alert = driver.switchTo().alert();
			String alertmessage = driver.switchTo().alert().getText();
			System.out.println(alertmessage);
			alert.accept();
		}
		
		
		
		
		
		
		
		
	}

}
