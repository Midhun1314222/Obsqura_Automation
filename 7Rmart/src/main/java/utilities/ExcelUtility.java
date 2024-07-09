package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constants;

public class ExcelUtility {
    static FileInputStream f;
    static XSSFWorkbook w;
    static XSSFSheet sh;

    public static String getStringData(int rowIndex, int columnIndex, String sheetName) throws IOException {
        String filepath = Constants.TestDataFile;
        f = new FileInputStream(filepath);
        w = new XSSFWorkbook(f);
        sh = w.getSheet(sheetName);
        Row r = sh.getRow(rowIndex);
        Cell c = r.getCell(columnIndex);
        return c.getStringCellValue();
    }

    public static String getIntegerData(int rowIndex, int columnIndex, String sheetName) throws IOException {
        String filepath = Constants.TestDataFile;
        f = new FileInputStream(filepath);
        w = new XSSFWorkbook(f);
        sh = w.getSheet(sheetName);
        Row r = sh.getRow(rowIndex);
        Cell c = r.getCell(columnIndex);
        double numericCellValue = c.getNumericCellValue();
        return String.valueOf((int) numericCellValue);
    }
}