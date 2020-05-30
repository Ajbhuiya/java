package datadriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel4 {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\firoz_000\\Desktop\\ExcelRead.xlsx";
       // String sheetName = "Sheet1";
        XSSFWorkbook wb;
        XSSFSheet sheetName;
        XSSFCell cell;

        FileInputStream fis = new FileInputStream(path);
        wb = new XSSFWorkbook(fis);
        sheetName = wb.getSheetAt(0);
        cell=sheetName.getRow(2).getCell(1);
        String cellValue = cell.getStringCellValue();
        System.out.println(cellValue);



    }
}
