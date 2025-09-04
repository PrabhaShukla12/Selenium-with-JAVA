package selpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.meesho.com/?srsltid=AfmBOoqvVz_ti9qop87KYihzp0QNCHm8dNSfpwEekZ1iTT6xvPcBVHUD");
		
		Thread.sleep(4000);
		
		WebElement dr= d.findElement(By.xpath("//*[@id=\"stUuGf\"]/div/div[2]/div/div/div"));
		dr.findElement(By.xpath("//*[@id=\"stUuGf\"]/div/div[2]/div/div/div/div[2]/div/promo-button-text[1]/div/div")).click();
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/a")).click();
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div[5]/a[2]/span")).click();
		
	}

}
