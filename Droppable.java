package selpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(1000);
		
		WebElement dd = d.findElement(By.className("demo-frame"));
		
		d.switchTo().frame(dd);
		
		// storing the values of both source and target in a variable
		
		WebElement drag= d.findElement(By.id("draggable"));
		
		WebElement drop= d.findElement(By.id("droppable"));
		
		Actions a=new Actions(d);
		
		// we have an inbuilt method for drag and drop
		Thread.sleep(1000);
		
		a.dragAndDrop(drag, drop).build().perform();
		
		// now we need to switch to the default window and click on resizable button
		
		d.switchTo().parentFrame();
		Thread.sleep(1000);
		
		d.findElement(By.linkText("Resizable")).click();
		
		WebElement dd1 = d.findElement(By.className("demo-frame"));
		d.switchTo().frame(dd1);
		
		WebElement widget= d.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		a.clickAndHold(widget).moveByOffset(180, 100).release().build().perform();
	}

}
