package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		//step1: Set up the path for the excel workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//step2: get into Worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		// to get the number of rows; excluding the first row
		int rowCount = ws.getLastRowNum(); 
		
		//to get the cell count
		int cellCount = ws.getRow(0).getLastCellNum();
		
		//declare 2D array
		String[][] data = new String[rowCount][cellCount];
		
			
		for (int i = 1; i <= rowCount; i++) { //1,2
					
			for(int j = 0; j < cellCount; j++) { //0,1,2,3
				String text = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(text);
				data[i-1][j] = text; //1,0 ;
			}
			
		}
		
		
		
		//to close the workbook
		wb.close();
		
		return data;
		
		
		
		//int physicalNumberOfRows = ws.getPhysicalNumberOfRows(); //count includes the first row
		//System.out.println(physicalNumberOfRows);
		
		//step3: get into row
		//XSSFRow row = ws.getRow(1);
		
		//step4: get into cell
		//XSSFCell cell = row.getCell(0);
		
		//String text  = cell.getStringCellValue();
		
		
		
		
		

	}

}
