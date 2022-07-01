package PracticePage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _92_Excelsheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	File myfile = new File("D:\\@ashwini\\ExcelReading\\Excelfetchsel.xlsx");
System.out.println(WorkbookFactory.create(myfile).getSheet("Sheet6").getRow(0).getCell(1).getStringCellValue());
	
}
}
