package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPForTestCase002 {
@DataProvider(name = "testcase2")
	public static String[][] getData() throws IOException{
	String[][] testdata2;
	 
		FileInputStream fis2 = new FileInputStream("./TestData/TestData_for_TC002.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis2);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		int columncount = sheet.getRow(0).getLastCellNum();
		System.out.println(columncount);
		testdata2 = new String[rowcount][columncount];
		for (int i=1; i<= rowcount; i++){
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j < columncount; j++){
				String cellData = row.getCell(j).getStringCellValue();
				System.out.println("The value of row "+j+" "+cellData);
				testdata2[i-1][j]=cellData;
				
			}
			
		}		
		
		return testdata2;
		
	}
	
	
}
