package datadriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Read {

    public static void main(String[] args) {
        //define 3 data type for excel
        XSSFWorkbook ExcelWBook;
        XSSFSheet ExcelWSheet;
        XSSFCell Cell;

        String path = "C:\\Users\\firoz_000\\Desktop\\ExcelRead.xlsx";
        String sheetName = "Sheet1";

        try{
            FileInputStream fs = new FileInputStream(path);
            ExcelWBook = new XSSFWorkbook(fs);
            ExcelWSheet = ExcelWBook.getSheet(sheetName);

            Cell= ExcelWSheet.getRow(2).getCell(0);
            String cellData = Cell.getStringCellValue();
            System.out.println(cellData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
