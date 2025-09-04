package selpro;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.oracle.com/in/");
		
		// Taking screenshot of overall visible screen
		
		TakesScreenshot ts= (TakesScreenshot)d;
		File src= ts.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("C:\\Users\\HP\\Downloads\\Selenium\\img1.png");
		
		FileHandler.copy(src, dest);
		
		// Taking screenshot of a specific image or picture
		
		WebElement ele= d.findElement(By.xpath("//*[@id=\"rh08-s05\"]/div"));
		
		TakesScreenshot tss= (TakesScreenshot)ele;
		
		File src1 = tss.getScreenshotAs(OutputType.FILE);
		
		File dest1 = new File("C:\\Users\\HP\\Downloads\\Selenium\\img2.png");
		
		FileHandler.copy(src1, dest1);
		
		// Taking screenshot of a specific image by navigating on a different tab
		
		d.get("https://www.vrlbus.in/");
		
		WebElement image= d.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[1]/a/img"));
		
		TakesScreenshot scr = (TakesScreenshot)image;
		
		File src2 = image.getScreenshotAs(OutputType.FILE);
		
		File des2 = new File("C:\\Users\\HP\\Downloads\\Selenium\\img3.png");
		
		FileHandler.copy(src2, des2);
	}

}
