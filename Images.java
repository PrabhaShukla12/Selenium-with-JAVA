package selpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		
		WebElement l= d.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
		
		if(l.isDisplayed())
		{
			System.out.println("Yes, Image is displayed " + l.getAttribute("alt"));
		}
		else
		{
			System.out.println("No, Image is not getting displayed");
		}
		
		d.navigate().to("https://www.oracle.com/in/");
		
		d.navigate().to("https://www.amazon.in/");
		System.out.println(d.getTitle());
		
	}

}
