package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPClassForTC007 {
	
	public static String[][] testdata;
	
	@DataProvider (name ="testdata007")
	public static String[][] dpForTC007() throws IOException{		
		
		FileInputStream fis7 = new FileInputStream("./TestData/TestData_for_TC007.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis7);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("columnCount");
		for(int i=0; i <= rowCount; i++){
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j < columnCount ; j++){
				String cellData = row.getCell(j).getStringCellValue(); // get clarified
				System.out.println("The value of row "+j+" "+cellData); 
				testdata[i-1][j]=cellData;//get clarified
			}
								
					}
		
		return null;
		
	}

}
