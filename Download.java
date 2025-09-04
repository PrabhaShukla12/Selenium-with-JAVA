package selpro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		// navigate to the URL
		d.get("https://www.selenium.dev/downloads/");
		
		// Scroll down a page to find the download link on the page
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("scroll(0,345)");
		Thread.sleep(2000);
	
		// clicking on the download link
		d.findElement(By.xpath("/html/body/div/main/div[3]/div[3]/div/div[2]/p[2]/a")).click();
		
		// creating robot class for handling keyboards and mouse events
		Robot r= new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
	}

}
