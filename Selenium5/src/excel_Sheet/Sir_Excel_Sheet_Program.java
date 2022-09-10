package excel_Sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sir_Excel_Sheet_Program {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream excel = new FileInputStream("C:/Users/Aakash/Desktop/New Microsoft Excel Worksheet.xlsx");
	    
        Sheet a =  WorkbookFactory.create(excel).getSheet("Sheet1");
    
    String b= a.getRow(0).getCell(0).getStringCellValue();
    String c=a.getRow(0).getCell(1).getStringCellValue();
    
    
    Thread.sleep(2000);
    

    
    System.out.println(b);
    System.out.println(c);
    System.out.println(b+" "+c);
    
	}

}
