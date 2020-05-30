package datadriven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    public static void main(String[] args) throws IOException {


        //define 3 data type for excel
        //String path = "C:\\Users\\firoz_000\\Desktop\\ExcelRead.xlsx";
        File src = new File("C:\\Users\\firoz_000\\Desktop\\ExcelRead.xlsx");//another way of line 16
        FileInputStream fis = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet ExcelWSheet = wb.getSheetAt(0);


        ExcelWSheet.getRow(0).createCell(7).setCellValue("pass");
        ExcelWSheet.getRow(1).createCell(7).setCellValue("fail");

        FileOutputStream fout = new FileOutputStream(src);//to store something we use this


        wb.write(fout);
        wb.close();

    }
}
