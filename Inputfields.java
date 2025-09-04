package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputfields {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://letcode.in/edit");
		
		Thread.sleep(3000);
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		d.findElement(By.id("fullName")).sendKeys("Monika Shinde");
		
		d.findElement(By.id("join")).sendKeys(" and great");
		
		// for getting text from a text field use - getAttribute("value") method.
		String t= d.findElement(By.xpath("//input[@id='getMe']")).getAttribute("value");
		
		Thread.sleep(1000);
		System.out.println("inside the text box: "+ t);
		
		Thread.sleep(1000);
		d.findElement(By.id("clearMe")).clear();
		
		Thread.sleep(1000);
		
		Boolean r= d.findElement(By.id("noEdit")).isEnabled();
		
		System.out.println(r);
		
		// for checking if the text in a text field is only readable and we can't edit it then use - getAttribute("readonly") method.
		String read= d.findElement(By.id("dontwrite")).getAttribute("readonly");
		
		System.out.println(read);
		
		
	}

}
