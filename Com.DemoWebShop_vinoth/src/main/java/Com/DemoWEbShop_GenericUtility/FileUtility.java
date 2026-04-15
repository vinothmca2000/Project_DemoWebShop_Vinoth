package Com.DemoWEbShop_GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(FrameWorkConstants.propertiesFilePath);
		Properties pro=new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;
	}
	public String readDataFromExcelStringFile(String fileName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(FrameWorkConstants.excelFilePath);
		Workbook wb=WorkbookFactory.create(fis);
		String value=wb.getSheet(fileName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

}

