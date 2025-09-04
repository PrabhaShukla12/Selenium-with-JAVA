package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://letcode.in/window");
		
		Thread.sleep(1000);
		
		d.findElement(By.id("home")).click();
		
		Thread.sleep(1000);
		
		d.navigate().to("https://letcode.in/window");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//button[@id='multi']")).click();
		Thread.sleep(1000);

	}

}
