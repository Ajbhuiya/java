package datadriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelRead {
    //	 URL to get the binary - http://poi.apache.org/download.html
//	 Binary Name - poi-bin-3.11-beta2-20140822.zip
//	 Extract the binary
//	 Add all the jars from the location you extracted to the build path
//	 Also add all the jars from lib, do not add the jar file of log4j
//	 Also add all the jars from ooxml-lib
//	 Only works for Excel 2007+
    //code top down

    public static void main(String[] args) {

        //define 3 data type for workbook
        XSSFWorkbook ExcelWBook;//class provided by poi to identify excel workbook
        XSSFSheet ExcelWSheet;//class by apache poi identify excel sheet
        XSSFCell Cell;//read the data from cell

        // Location of the Excel file
        String path = "C:\\Users\\firoz_000\\Desktop\\ExcelRead.xlsx";
        String sheetName = "Sheet1";

        try {
            FileInputStream ExcelFile = new FileInputStream(path);//read excel file
            ExcelWBook = new XSSFWorkbook(ExcelFile);//read the workbook
            ExcelWSheet = ExcelWBook.getSheet(sheetName);//read work sheet

            Cell = ExcelWSheet.getRow(1).getCell(0);//get the row
            String cellData = Cell.getStringCellValue();
            System.out.println("Cell Data: " + cellData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
