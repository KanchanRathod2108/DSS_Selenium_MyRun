package excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sir_Access_All_Execl_Data {

	public static void main(String[] args) throws IOException {
		FileInputStream excel=new FileInputStream("C:/Users/Aakash/Desktop/New Microsoft Excel Worksheet.xlsx");
	    Sheet a=WorkbookFactory.create(excel).getSheet("Sheet1");

	    int rowno=a.getPhysicalNumberOfRows();//4
	    //System.out.println(rowno);//4

	    for(int i=0;i<rowno;i++) {//  3 

	    int cellno=a.getRow(i).getPhysicalNumberOfCells();//2
	    //System.out.println(cellno);

	    for(int j=0;j<cellno;j++) {// 
	    String ss=a.getRow(i).getCell(j).getStringCellValue();//(1,0)
	    System.out.print(ss+" ");
	    }
	    System.out.println();
	    }
	}
}



