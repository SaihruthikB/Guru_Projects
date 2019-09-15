package selenium.Guru_Projects;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseClass_ForExcel

{
public void testt() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	driver.findElement(By.xpath("//input[@id='txt_ccname']")).sendKeys((excel(1, 2, "nj")));
	
}

	
}
