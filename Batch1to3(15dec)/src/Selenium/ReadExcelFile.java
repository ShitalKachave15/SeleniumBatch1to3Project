package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		fetch the file
      File file=new File("D:\\Software Testing\\ReadExcelFile.xlsx");
      
      //read the excel file
      FileInputStream io=new FileInputStream(file);
      
      //fetch the workbook
      XSSFWorkbook wb=new XSSFWorkbook(io);
      
      XSSFSheet sheet=wb.getSheet("demo");
//      XSSFSheet sheet=wb.getSheetAt(0);
      
//      //Row 0 cell 0
//      XSSFRow row0=sheet.getRow(0);
//      XSSFCell cell00=row0.getCell(0);
//         String id=cell00.getStringCellValue();
////         System.out.println(id);
//         
//         
//         //Row 0  cell 1
//      
//         XSSFCell cell01=row0.getCell(1);
//            String name=cell01.getStringCellValue();
////            System.out.println(name);
//            
//            //Row 0  cell 2
//            
//            XSSFCell cell02=row0.getCell(2);
//               String city=cell02.getStringCellValue();
////               System.out.println(city);
//            
//            System.out.println(id+"||"+name+"||"+city);
//         
//      //Row 1 cell 0
//         XSSFRow row1=sheet.getRow(1);
//         XSSFCell cell10=row1.getCell(0);
//                double id1=cell10.getNumericCellValue();
////            System.out.println(id1);
//      
//      
//            //Row 1 cell 1
//            
//            XSSFCell cell11=row1.getCell(1);
//                   String  name1=cell11.getStringCellValue();
////               System.out.println(name1);
//                   
//                   //Row 1 cell 2
//                   
//                   XSSFCell cell12=row1.getCell(2);
//                          String  city1=cell12.getStringCellValue();
////                      System.out.println(city1);
//               
//               System.out.println(id1+"||"+name1+"||"+city1);
//            
      
      
      
//      nested for loop
      
      int rowcount=sheet.getLastRowNum();
      System.out.println(rowcount);
      
      //rows
    		  for(int i=0;i<rowcount;i++)
      {
    			  XSSFRow row=sheet.getRow(i);  
    			 int cellcount=row.getLastCellNum();
    			System.out.println();
    	  for(int j=0;j<cellcount;j++)
    	  {
    		   XSSFCell cell=row.getCell(j);
    		if(cell.getCellType()==CellType.STRING)
    		{
    			System.out.print(row.getCell(j).getStringCellValue()+"||");
    		}
    		else if(cell.getCellType()==CellType.NUMERIC)
    		{
    			System.out.print(row.getCell(j).getNumericCellValue()+"||");
    		}
  	 
    	  }
      }
    	  
    	  
	}

}
