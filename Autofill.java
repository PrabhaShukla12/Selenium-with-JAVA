package selpro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autofill {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.zingbus.com/?utm_source=google&utm_medium=cpc&campaignid=20824175696&adgroupid=156392245899&keyword=bus%20booking&device=c&network=g&gad_source=1&gad_campaignid=20824175696&gbraid=0AAAAACv60hoTP7PkCF-GYAo_y1SG0ByGT&gclid=Cj0KCQjw097CBhDIARIsAJ3-nxfzyK0vOlvR9o7mFNteJLZf-Itl11TjK94_jhiUwwu05bVOMQk6_5UaAmHdEALw_wcB");
		
		
		// Selecting source location
		d.findElement(By.xpath("//*[@id=\"formshome_SectionSearch__PovC_\"]/div/div/div/div[1]/div[3]/div/input")).sendKeys("Del");
		Thread.sleep(1000);
		
		JavascriptExecutor jssc = (JavascriptExecutor)d;
		jssc.executeScript("scroll(0,380)");
		
		Robot r =new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);

		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);

		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		// Selecting destination
		d.findElement(By.xpath("//*[@id=\"formshome_SectionSearch__PovC_\"]/div/div/div/div[2]/div[3]/div/input")).sendKeys("Mum");
		Thread.sleep(1000);
		
		
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);

		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);

		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		// selecting the date
		WebElement date= d.findElement(By.id("date"));
		date.click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"formshome_SectionSearch__PovC_\"]/div/div/div/div[3]/div[3]/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[5]")).click();
		
		//Clicking on search
		
		d.findElement(By.xpath("//*[@id=\"formshome_SectionSearch__PovC_\"]/div/div/div/div[4]/button/span[1]")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)d;
		js.executeScript("scroll(0,400)");
	}

}
