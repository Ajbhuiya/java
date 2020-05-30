package datadriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelWrite3 {
    public static void main(String[] args) throws IOException {

        File path = new File("C:\\Users\\firoz_000\\Desktop\\ExcelRead.xlsx");
        XSSFWorkbook wBook;
        XSSFSheet wSheet;
        XSSFCell wCell;

        try {
            FileInputStream fis = new FileInputStream(path);
            wBook= new XSSFWorkbook(fis);
            wSheet= wBook.getSheetAt(0);
            wCell= wSheet.getRow(1).getCell(0);
            String cellData = wCell.getStringCellValue();
            System.out.println(cellData);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}