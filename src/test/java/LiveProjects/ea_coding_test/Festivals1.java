package LiveProjects.ea_coding_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Festivals1 extends Base {
	
	@Test
	public void festivals()  throws Exception {
//		WebDriver driver;
		Properties props = new Properties(); 
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\LiveProjects\\ea_coding_test\\data.properties");
		FileInputStream fis = new FileInputStream(file);
		
		props.load(fis);
		String browser = props.getProperty("browser");
		initializeBrowser(browser);
		
		Scanner sc = new Scanner(System.in);
		int elementCount = sc.nextInt();
		
		Thread.sleep(5000);
		
//		driver.navigate().refresh();
		
		List<WebElement> festivals = driver.findElements(By.xpath("//ol/li"));
		int noOfFestivals = festivals.size();
		System.out.println(noOfFestivals);
		Assert.assertEquals(18,noOfFestivals);
		
		
		
		
		List<WebElement> elementHavingSmallNightIn = driver.findElements(By.xpath("//li[text()=' Small Night In ']/ancestor::li"));
		int noOfelementHavingSmallNightIn=  elementHavingSmallNightIn.size();
		System.out.println(noOfelementHavingSmallNightIn);
		
		List<WebElement> elementHavingLOL = driver.findElements(By.xpath("//li[text()=' LOL-palooza ']/ancestor::li"));
		int noOfelementHavingLOL=  elementHavingLOL.size();
		System.out.println(noOfelementHavingLOL);
		
		
		
	}
	
	@Test
	public void festivalsTest3() throws Exception {
		Properties props = new Properties(); 
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\LiveProjects\\ea_coding_test\\data.properties");
		FileInputStream fis = new FileInputStream(file);
		
		props.load(fis);
		String browser = props.getProperty("browser");
		initializeBrowser(browser);
		Scanner sc = new Scanner(System.in); 
		String eleInput = sc.next();
		String festName = driver.findElement(By.xpath("//li[contains(text()," +eleInput+ ")]/ul")).getText();
		System.out.println(festName);
		
		Assert.assertEquals("Trainerella", festName);
	}

}
