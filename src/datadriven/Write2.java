package datadriven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write2 {
    public static void main(String[] args) throws IOException {

        File path = new File("C:\\Users\\firoz_000\\Desktop\\ExcelRead.xlsx");
        XSSFWorkbook wb;
        XSSFSheet sheet;


        try {
            FileInputStream fis = new FileInputStream(path);
            wb = new XSSFWorkbook(fis);
            sheet = wb.getSheetAt(0);

            sheet.getRow(1).createCell(10).setCellValue("ajbhuiya");

            FileOutputStream fout = new FileOutputStream(path);
            wb.write(fout);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}