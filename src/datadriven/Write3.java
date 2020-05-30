package datadriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Write3 {

    public static void main(String[] args) {
        XSSFWorkbook ExcelWBook;
        XSSFSheet ws;
        XSSFCell cell;

        String path = "C:\\Users\\firoz_000\\Desktop\\ExcelRead.xlsx";
        String sheetName = "Sheet1";

        try{
            FileInputStream fis = new FileInputStream(path);
            ExcelWBook = new XSSFWorkbook(fis);
            ws = ExcelWBook.getSheet(sheetName);//read work sheet

            cell = ws.getRow(2).getCell(0);
            String cellData = cell.getStringCellValue();
            System.out.println(cellData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
