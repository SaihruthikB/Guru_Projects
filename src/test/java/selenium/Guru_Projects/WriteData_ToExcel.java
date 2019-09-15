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

public class WriteData_ToExcel {
	@Test
	public  void Write2() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File f1 = new File("E:\\userdata\\Write.xlsx");
		FileInputStream Fis = new FileInputStream(f1);
		Workbook w1 =WorkbookFactory.create(Fis);
		for (int i=1;i<=3; i++)
		{
			String Ex = w1.getSheet("Write").getRow(i).getCell(2).getStringCellValue();
			String Ac =w1.getSheet("Write").getRow(i).getCell(3).getStringCellValue();
			System.out.println("expected"+Ex);
			System.out.println("actual"+Ac);
		 if (Ex.equals(Ac))
		 {
			 w1.getSheet("Write").getRow(i).getCell(4).setCellValue("Pass");
		 }
		 else
		 {
			 w1.getSheet("Write").getRow(i).getCell(4).setCellValue("Fail");
			 
			 
		 }
		
		}
		 FileOutputStream fos=new FileOutputStream(f1);
			w1.write(fos);
		
		
	}



}

