package selpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Allinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.mycontactform.com/");
		
		List<WebElement> allinks = d.findElements(By.tagName("a"));
		int count= allinks.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
		System.out.println(allinks.get(i).getText());
		}
		
		d.findElement(By.linkText("Sample Forms")).click();
	
		// for getting the count of total values in dropdown countries
		
		WebElement c = d.findElement(By.id("q9"));
		
		Select s= new Select(c); 
		c.click();
		List <WebElement> l= s.getOptions();
		
		System.out.println("Total countries: "+ l.size());
		
		// for getting the count of total values in dropdown countries by customizing xpath
		int coun = d.findElements(By.xpath("//*[@id='q9']/option")).size();
		System.out.println("Total countries are: "+ coun);
	

}

}
