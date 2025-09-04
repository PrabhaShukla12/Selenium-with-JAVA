package selpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_sheriyans {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.sheryians.com/");
		
		//clicking on signup
		
		d.findElement(By.xpath("/html/body/nav/div/div[2]/button[2]/a")).click();
		
		Thread.sleep(2000);
		
		// entering phone number
		
		d.findElement(By.id("phoneNumber")).sendKeys("9898989898");
		
	}

}
