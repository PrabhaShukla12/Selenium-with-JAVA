package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://letcode.in/frame");
		
		WebElement frame1 = d.findElement(By.id("firstFr"));
		
		d.switchTo().frame(frame1);
		
		d.findElement(By.name("fname")).sendKeys("Monika");
		d.findElement(By.name("lname")).sendKeys("Shinde");
		
		JavascriptExecutor js= (JavascriptExecutor)d;
		js.executeScript("scroll(0,200)");
		
		WebElement frame2 = d.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
		d.switchTo().frame(frame2);
		
		d.findElement(By.name("email")).sendKeys("ae399628@gmail.com");
		
		d.switchTo().defaultContent();
		
		d.findElement(By.xpath("//a[@href='/test']")).click();
	
	}

}
