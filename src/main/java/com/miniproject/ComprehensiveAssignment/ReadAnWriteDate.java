package com.miniproject.ComprehensiveAssignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAnWriteDate {
	
	public static void main(String[] args) {
		try {
		FileInputStream myFile = new FileInputStream("C:\\Users\\Z00530863\\OneDrive - Fresenius Medical Care\\Documents\\Java_Excel.xlsx"); 
		
        XSSFWorkbook myworkbook = new XSSFWorkbook(myFile); 
 
        Sheet mysheet = myworkbook.getSheetAt(0);
  
        Iterator <Row> rowIterator = mysheet.iterator();
        
        List<List<String>> data = new ArrayList<>();
        
        while (rowIterator.hasNext()) {
        
        Row newrow = rowIterator.next();
        
        Iterator <Cell> cellIterator = newrow.iterator();
        
        List<String> rowData = new ArrayList<>();
        
        while (cellIterator.hasNext()) {
            
        Cell newcell = cellIterator.next();
        
        if (newcell.getCellType() == CellType.STRING) {
        	
        rowData.add(newcell.getStringCellValue());
        
        }
        
        else if (newcell.getCellType() == CellType.NUMERIC) {
        
        rowData.add(String.valueOf(newcell.getNumericCellValue()));
        
        }
        }
        
        data.add(rowData);
        
        }
        
        for (List<String> row : data) {
        
        	System.out.println(row);
        	
        }
        
        myFile.close();
        }
        catch (IOException e) {
        	e.printStackTrace();
        }
        }
        }
     
    