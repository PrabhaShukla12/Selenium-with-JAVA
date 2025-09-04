package practise;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakeStore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://letcode.in/home");
		
		Thread.sleep(1000);
		
		d.findElement(By.className("card")).click();
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("/html/body/app-root/app-productlist/section/div[2]/div[1]/div/div/div[1]/button/span[2]")).click();
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("/html/body/app-root/app-productlist/section/div[1]/div/div[1]/button")).click();
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("scroll(0, 700)");
		
		d.findElement(By.xpath("/html/body/app-root/app-home/section/div/div[2]/div[6]/div/footer/button")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-productlist/section/div[2]/div[1]/div/div/div[1]/button/span[2]")).click();
		Thread.sleep(1000);
		
		// clicking on Cart
		
		d.findElement(By.xpath("/html/body/app-root/app-productlist/section/div[1]/div/div[2]/app-cartvalue/button[1]")).click();
		
		Thread.sleep(1000);
		
		// selecting one more quantity
		
		d.findElement(By.xpath("/html/body/app-root/app-cart/section/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/button[2]")).click();
		Thread.sleep(1000);

		d.findElement(By.xpath("/html/body/app-root/app-cart/section/div/div[1]/div[2]/div/button")).click();
		Thread.sleep(1000);
		
		System.out.println(d.switchTo().alert().getText());
		
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		
		// customizing xpath for dynamic value change
		d.findElement(By.xpath("// button[@class='button is-primary']")).click();
		
	}
	}


