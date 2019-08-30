package zavrsniProjekat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PeoplePage extends BaseClass{
	
	
	//
	//
	//	 /$$$$$$$$ /$$                                               /$$             
	//	| $$_____/| $$                                              | $$             
	//	| $$      | $$  /$$$$$$  /$$$$$$/$$$$   /$$$$$$  /$$$$$$$  /$$$$$$   /$$$$$$$
	//	| $$$$$   | $$ /$$__  $$| $$_  $$_  $$ /$$__  $$| $$__  $$|_  $$_/  /$$_____/
	//	| $$__/   | $$| $$$$$$$$| $$ \ $$ \ $$| $$$$$$$$| $$  \ $$  | $$   |  $$$$$$ 
	//	| $$      | $$| $$_____/| $$ | $$ | $$| $$_____/| $$  | $$  | $$ /$$\____  $$
	//	| $$$$$$$$| $$|  $$$$$$$| $$ | $$ | $$|  $$$$$$$| $$  | $$  |  $$$$//$$$$$$$/
	//	|________/|__/ \_______/|__/ |__/ |__/ \_______/|__/  |__/   \___/ |_______/ 
	//	                                                                             
	//	                                                                             
	//	                                                                             
	//
	// -------------------------------
	//
	
//	private static List <WebElement> bioList() {
//		return driver.findElements(By.cssSelector("div.bio:nth-child(1) > div"));
//	}
	
	private static List <WebElement> bioList() {
		return driver.findElements(By.cssSelector("div.bio  div:not(.bio):not(p)"));
	}
	
	
	//
	//
	//	 /$$      /$$             /$$     /$$                       /$$          
	//	| $$$    /$$$            | $$    | $$                      | $$          
	//	| $$$$  /$$$$  /$$$$$$  /$$$$$$  | $$$$$$$   /$$$$$$   /$$$$$$$  /$$$$$$$
	//	| $$ $$/$$ $$ /$$__  $$|_  $$_/  | $$__  $$ /$$__  $$ /$$__  $$ /$$_____/
	//	| $$  $$$| $$| $$$$$$$$  | $$    | $$  \ $$| $$  \ $$| $$  | $$|  $$$$$$ 
	//	| $$\  $ | $$| $$_____/  | $$ /$$| $$  | $$| $$  | $$| $$  | $$ \____  $$
	//	| $$ \/  | $$|  $$$$$$$  |  $$$$/| $$  | $$|  $$$$$$/|  $$$$$$$ /$$$$$$$/
	//	|__/     |__/ \_______/   \___/  |__/  |__/ \______/  \_______/|_______/ 
	//	                                                                         
	//	                                                                         
	//	                                                                         
	//
	// --------------------------------
	
	public void countPeople() {
		System.out.println(bioList().size());
	}
	
	public ArrayList <String> StringList() {
        ArrayList <String> imena = new ArrayList<String>();
        for (int i=0; i<74; i++) {
        	String b = " ";
            String a = bioList().get(i).findElement(By.cssSelector("b")).getText();
            List<WebElement> iTags = bioList().get(i).findElements(By.cssSelector("i"));
            if (iTags.size() > 0) {
            b = bioList().get(i).findElement(By.cssSelector("i")).getText();
            } else {
            	b = " ";
            }
            String c = (a + " " + b);
            imena.add(c);
        }
        
        return imena;
        
        }
        
    public void sthCrazy(ArrayList <String> imena) {
        try {
            final String FILE = "C:\\Users\\m\\Downloads\\ZavrsniFajl.xlsx";
            FileInputStream stream = new FileInputStream(FILE);
            XSSFWorkbook wb = new XSSFWorkbook(stream);
            XSSFSheet sheet1 = wb.getSheetAt(0);        
            for (String s : imena) {
            		int o = 0;
            		String s1 = s.replaceAll("[^a-zA-Z]", "");
            		String r1;
            		while (o<=sheet1.getLastRowNum()) {
            			r1 = sheet1.getRow(o).getCell(0).getStringCellValue().replaceAll("[^a-zA-Z]", "");
            			if (s1.equals(r1)) {
            				o=0;
            				break;
            			} else {
            				o = o+1;
            			}
            		}
            		if (o>=sheet1.getLastRowNum()) {
            			sheet1.createRow(sheet1.getLastRowNum()+1);
            			sheet1.getRow(sheet1.getLastRowNum()).createCell(0);
            			sheet1.getRow(sheet1.getLastRowNum()).getCell(0).setCellType(CellType.STRING);
        				sheet1.getRow(sheet1.getLastRowNum()).getCell(0).setCellValue(s);
            		}
//            		
//            		for (int i = 0; i<=imena.size();i++) {
//            			r1 = sheet1.getRow(i).getCell(0).getStringCellValue().replaceAll("[^a-zA-Z]", "");
//            			if (s1.equals(r1)) {
//            				System.out.println("ok");
//            				i = i+1;
//            				break;
//            			} else if (i>=wow){     
//            				
//            				sheet1.getRow(sheet1.getLastRowNum()+1).createCell(0);
//            				sheet1.getRow(wow).getCell(0).setCellValue(s);
//            				wow=wow+1;
//            			} else {
//            				i+=1;
//            			}
//            		}
                }
            stream.close();
            FileOutputStream outputStream = new FileOutputStream(FILE);
            wb.write(outputStream);
            wb.close();
        } catch (Exception e) {
            System.out.println("woopsie");
        }
	
}
}
