package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Buttonn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://letcode.in/button");
		
		Thread.sleep(1000);
		
		d.findElement(By.id("home")).click();
		
		Thread.sleep(1000);
		
		d.navigate().to("https://letcode.in/button");
		
		Thread.sleep(1000);
		
		// for getting element location that is x and y coordinates
		
		WebElement ele = d.findElement(By.id("position"));
		
		Point eleloc = ele.getLocation();
		
		int x= eleloc.getX();
		int y= eleloc.getY();
		
		System.out.println("X coordinate is: "+ x);
		System.out.println("Y coordinate is: "+ y);
		
		 
		//finding out the colour of the background 
		
		String colr = d.findElement(By.id("color")).getCssValue("color");
		System.out.println("Colour of an element is: "+ colr);
		
		// converting the rgba value to Hex
		
		String hex = Color.fromString(colr).asHex();
		System.out.println("Colour is: "+hex);
		
		Thread.sleep(1000);
		
		WebElement e = d.findElement(By.id("property"));
		
		Point cor = e.getLocation();
		
		int width = cor.getX();
		int height = cor.getY();
		
		
		System.out.println("Height is : "+ height);
		System.out.println("Width is : "+ width);
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("scroll (0, 300)");
	
		// confirming if the button is disabled
		
		Boolean button = d.findElement(By.id("isDisabled")).isEnabled();
		if (button == false)
		{
			System.out.println("The button is disabled");
		}
		else
		{
			System.out.println("The button is enabled");
		}
		
		// click and hold a button
		Thread.sleep(1000);
		
		
		WebElement m = d.findElement(By.xpath("//*[@id='isDisabled' and @class='button is-primary']"));
		
		Actions a = new Actions(d);
		a.clickAndHold(m).build().perform();
		
		
	
	}

}
