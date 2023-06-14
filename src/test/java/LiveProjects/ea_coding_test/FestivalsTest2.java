package LiveProjects.ea_coding_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FestivalsTest2 extends Base {

	@Test
	public void fetivalTest2() throws Exception {
		Properties props = new Properties(); 
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\LiveProjects\\ea_coding_test\\data.properties");
		FileInputStream fis = new FileInputStream(file);
		
		props.load(fis);
		String browser = props.getProperty("browser");
		initializeBrowser(browser);
		
		Scanner sc = new Scanner(System.in);
		int elementCount = sc.nextInt();
		
		String element = driver.findElement(By.xpath("//ol/li["+elementCount+"]")).getText();
		System.out.println(element);
	}
}
