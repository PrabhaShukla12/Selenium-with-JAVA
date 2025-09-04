package selpro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		// navigate to the URL
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		d.findElement(By.xpath("//input[@name='username']")).sendKeys("ae399@gmail.com");
		
		System.out.println("Title: "+ d.getTitle());
		
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("aert@jhkj87686");
	}

}
