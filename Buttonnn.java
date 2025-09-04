package practise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buttonnn  {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	
	d.manage().window().maximize();
	
	d.get("https://letcode.in/button");
	
	Thread.sleep(1000);
	
	WebElement ele= d.findElement(By.id("position"));
	
	Point eleloc= ele.getLocation(); 
	
	int x= eleloc.getX();
	int y= eleloc.getY();
	
	System.out.println("X coordinate is: " +x);
	System.out.println("Y coordinate is: " +y);
	
	// find out height and width
	
	WebElement el= d.findElement(By.id("property"));
	
	Point elel = el.getLocation();
	
	int width= elel.getX();
	int height= elel.getY();
	
	System.out.println("The height is: "+ height);
	System.out.println("The width is: "+ width);
	
	WebElement dis= d.findElement(By.id("isDisabled"));
	
	boolean but = dis.isEnabled();
	
	if(but==true)
	{
		System.out.print("The button is enabled");
	}
	
	else
	{
		System.out.print("The button is disabled");
	}
	
	WebElement m = d.findElement(By.xpath("//*[@id=\"isDisabled\"]/div/h2"));
	
	Actions a= new Actions (d);
	a.clickAndHold(m).build().perform();
	
}
}
