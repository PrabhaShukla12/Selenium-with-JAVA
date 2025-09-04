package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthan {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://letcode.in/alert");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//button[@id='accept']")).click();
		Thread.sleep(1500);
	    d.switchTo().alert().accept();
	
	    Thread.sleep(1500);
	    d.findElement(By.xpath("//button[@id='confirm']")).click();
	    Thread.sleep(1500);
	    
	    System.out.println(d.switchTo().alert().getText());
	    d.switchTo().alert().dismiss();
	    
	    Thread.sleep(1500);
	    d.findElement(By.xpath("//button[@id='prompt']")).click();
	    Thread.sleep(1500);
	    d.switchTo().alert().sendKeys("Monika Shinde");
	    Thread.sleep(1500);
	    d.switchTo().alert().accept();
	    
	    Thread.sleep(1500);
	    d.findElement(By.xpath("//button[@id='modern']")).click();
	}

}
