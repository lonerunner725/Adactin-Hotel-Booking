package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class adacDataDriven {
	
	
	public static String getExcelValue(int sheet, int rowindex,int cellindex) throws IOException {
		File f = new File("C:\\Users\\Deepthi\\eclipse-workspace\\adactinproject\\excel\\adac.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(sheet);
		Row row = sheetAt.getRow(rowindex);
		Cell cell = row.getCell(cellindex);
		CellType cellType = cell.getCellType();
		
		if((cellType.equals(cellType.NUMERIC))){
			double numericCellValue = cell.getNumericCellValue();
			String strcell = Double.toString(numericCellValue);
			return strcell;
		}else  if(cellType.equals(cellType.STRING)){
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
		
		}else {
			//System.out.println("invalid datatype");
			String s= "invalid datatype";
			return s;
		}
		
		
		}
	public static void main(String[] args) throws IOException {
		
	}
	

}
