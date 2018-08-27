package library;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	XSSFWorkbook wb;
	
	XSSFSheet sheet1;
	 
	
	// This constructor load the workbook and return wb object
	//Mention path over here, it will load the excel file and read it 
	
	 public ExcelDataConfig(String excelPath)
	 {
	 
		  try
		  {
            File src=new File(excelPath);

			  FileInputStream fis=new FileInputStream(src);
			  
			  wb=new XSSFWorkbook(fis);
			  
		 }
		   catch (Exception e) {
		   
			   System.out.println(e.getMessage());
        }

	  }

	 // It will get data from Sheet No, row no and column no
	 
	  public String getData(int sheetNumber,int row,int column)
      {
         sheet1=wb.getSheetAt(sheetNumber);

		 String data= sheet1.getRow(row).getCell(column).getStringCellValue();
		 
		 System.out.println(data);

		 return data;
	  }
	  
	  
	  //Method to return no of rows
	  
	  public int getRowCount(int sheetIndex)
	  {
	  
		// It will get sheet at mentioned index no
		  
	     int row= wb.getSheetAt(sheetIndex).getLastRowNum();
		 
		 row=row+1;
		 
		 return row;
		 	 
		 
	  } 
	  
}