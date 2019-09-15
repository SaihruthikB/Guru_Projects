package selenium.Guru_Projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteData_Excel {
	@Test
	public  void testt() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File f1 = new File("E:\\userdata\\rakesh.xlsx");
		System.out.println(f1.exists());
		FileInputStream fis = new FileInputStream(f1);
		Workbook w1 = WorkbookFactory.create(fis);
		w1.getSheetAt(0).getRow(0).getCell(0).setCellValue("rakesh");
		String data=w1.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		System.out.println(data+"df");
		System.exit(0);
		for (int i = 1;i<=3;i++)
		{
			System.out.println("entered for");
			String Ex = w1.getSheet("Write").getRow(i).getCell(i).getStringCellValue();
			String ax = w1.getSheet("Write").getRow(i).getCell(i+1).getStringCellValue();
			System.out.println(Ex+ax+"===================");
			if(Ex.equals(ax))
			{
				System.out.println("entered if");
				w1.getSheet("Write").getRow(i).getCell(i+2).setCellValue("Pass");
			}
			else
			{
				System.out.println("else");
				w1.getSheet("Write").getRow(i).getCell(i+2).setCellValue("Fail");
				
			}
		}
		FileOutputStream fos=new FileOutputStream(f1);
		w1.write(fos);
		
	}

	
	}

