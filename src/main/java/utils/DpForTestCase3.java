package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DpForTestCase3 {
	@DataProvider(name = "testcase3")
	public static String[][] getData() throws IOException{
		String[][] testdata3;
		FileInputStream fis3 = new FileInputStream("./TestData/TestData_for_TC003.xlsx");			
		XSSFWorkbook wb = new XSSFWorkbook(fis3);				
		XSSFSheet Sheet = wb.getSheetAt(0);
		int rowCount = Sheet.getLastRowNum();
		System.out.println("The row count is" +rowCount);
		int columnCount = Sheet.getRow(0).getLastCellNum();
		System.out.println("The column count is" +columnCount);
		
		testdata3= new String [rowCount][columnCount];
		for(int i=1; i<=rowCount; i++){
			XSSFRow row = Sheet.getRow(i);
			for (int j=0; j< columnCount; j++){
				String celldata = row.getCell(j).getStringCellValue();
				System.out.println("The value of row "+j+" "+celldata);
				testdata3[i-1][j]=celldata;			
				
			}				
		}
		return testdata3;
	}		
	}


