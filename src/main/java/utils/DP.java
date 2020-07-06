package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {

@DataProvider(name = "testcase1") // @DataProvider is annotation and giving name to data provider
public static String[][] getData() throws IOException{
	
	String[][] testdata;
	//System.out.println(testdata); 
//	testdata[0][0]="rowonecolzero";
//	testdata[0][1]="rowonecolone";hotcoding concepts
//	testdata[0][2]="rowonecoltwo";
//	testdata[0][3]="rowonecolthree";
//	
//	testdata[1][0]="rowtwocolzero";
//	testdata[1][1]="rowtwocolone";
//	testdata[1][2]="rowtwocoltwo";
//	testdata[1][3]="rowtwocolthree";
	
	FileInputStream fis = new FileInputStream("./TestData/TestData_TC001_for_all_elements.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);//Use this class and create obj to get the values in workbook
	XSSFSheet sheet = wb.getSheetAt(0); // Use this class to get the values in sheet.. in getsheet method pass 'o' is the index starts with.
	int rowcount=sheet.getLastRowNum(); // will give the used no of rows -1
	System.out.println(rowcount); 
	int columnCount = sheet.getRow(0).getLastCellNum(); // to get the column count of the sheet
	System.out.println(columnCount);
	testdata = new String[rowcount][columnCount]; // get clarified
	for(int i=1; i<= rowcount; i++){ //i is 1 since we start getting the data from row 1 where row 0 is header
		XSSFRow row = sheet.getRow(i);
		for (int j=0; j<columnCount; j++){ // since column has no header we are starting with 0 so j =0
			String cellData = row.getCell(j).getStringCellValue(); // get clarified
			System.out.println("The value of row "+j+" "+cellData); 
			testdata[i-1][j]=cellData;//get clarified
					
		}
	}
	
return testdata;
}


}


