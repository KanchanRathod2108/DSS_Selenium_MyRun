package excel_Sheet;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_Sheet_one_element {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream excel=new FileInputStream("C:/Users/Aakash/Desktop/New Microsoft Excel Worksheet.xlsx");
		Sheet a=WorkbookFactory.create(excel).getSheet("Sheet1");
		String b=a.getRow(0).getCell(0).getStringCellValue();
		String c=a.getRow(1).getCell(0).getStringCellValue();
		String d=a.getRow(2).getCell(0).getStringCellValue();
		Thread.sleep(1000);
		System.out.println(b);
		System.out.println(c);
		System.out.println(b+ " "+c);
		

	}

}
