package com.framework.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;

public class ReadExcel 
{
	public static String[][] getData(String fileName, String sheetName)
	{
		File f = null;
		FileInputStream fin= null;
		Workbook wb = null;
		Sheet sh = null;
		
		try
		{
			f = new File(fileName);
			fin = new FileInputStream(f);
			wb= new XSSFWorkbook(fin);
			sh= wb.getSheet(sheetName);
			int rowNum = sh.getLastRowNum();
			int colNum= sh.getRow(0).getLastCellNum();
			
			String[][] credentials = new String[rowNum][colNum];
			for(int i =0; i<rowNum; i++)
			{
				Row row = sh.getRow(i);
				for(int j =0; j<colNum; j++)
				{
					Cell cell = row.getCell(j);
					String value = new DataFormatter().formatCellValue(cell);  //Data Formater format the cell into a particular type
					credentials[i][j] = value;
					
				}
			}
			return credentials;
		}
		catch(Exception e)
		{
			return null;
		}
		
		finally
		{
			try
			{
				f=null;
				fin.close();
				wb.close();
				wb=null;
				sh = null;			
			}
			catch(Exception e)
			{
				Reporter.log("Unable to close the file "+e);
			}
		}
		
	}

}