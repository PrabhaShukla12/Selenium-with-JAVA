package selpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Alerts.html");
		
		// clicking on a button to get alert box
		
		d.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(1000);
		
		// For getting text which is available on the alert box
		String at= d.switchTo().alert().getText();
		System.out.println("Text on Alert Box is: "+ at);
		
		
		// For clicking on "Ok" on the alert box
		Thread.sleep(1000);
		d.switchTo().alert().accept();
		
		String et = "I am an alert box!";
		
		if(at.contentEquals(et))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
