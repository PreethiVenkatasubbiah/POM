package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPClassForTC006 {
	private static String[][] testdata;

	@DataProvider(name = "testCase6")
	public static String[][] getData() throws IOException{
		FileInputStream fis6 = new FileInputStream("./TestData/TestData_for_TC006.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis6);
		XSSFSheet Sheet = wb.getSheetAt(0);
		int rowCount = Sheet.getLastRowNum();
		System.out.println(rowCount);
		int columnCount = Sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		testdata = new String[rowCount][columnCount];
		for(int i = 0; i <= rowCount; i++){
			XSSFRow row = Sheet.getRow(i);
				for( int j=0 ; j < columnCount; j++){
					String cellData = row.getCell(j).getStringCellValue();
					System.out.println("The value of row "+j+" "+cellData); 
					testdata[i-1][j]=cellData;//get clarified
				}
			}
			
			return null;
		
	}

}
