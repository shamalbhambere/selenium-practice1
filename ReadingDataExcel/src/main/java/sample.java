import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("C://workspace//selenium-practice//ReadingDataExcel//Book1.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i < rowCount; i++) {
			XSSFRow currRow = sheet.getRow(i);
			for (int j = 0; j < cellCount; j++) {
				String value = currRow.getCell(j).toString();
				System.out.print(" " +value);
			}
			System.out.println();

		}

	}

}
