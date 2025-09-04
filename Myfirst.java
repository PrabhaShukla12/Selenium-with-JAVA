package selpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Myfirst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.mycontactform.com/");
		
		// for clicking on a link
		d.findElement(By.linkText("Sample Forms")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Features")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("About Us")).click();
		Thread.sleep(2000);
		d.findElement(By.linkText("Sample Forms")).click();
		
		
		// for checkbox
		d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[2]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[3]")).click();
		Thread.sleep(2000);
		
		// for text box
		d.findElement(By.id("subject")).sendKeys("Selenium Testing");
		Thread.sleep(2000);
		d.findElement(By.id("email")).sendKeys("shuklaprabha099@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.id("q1")).sendKeys("Automation Testing Class");
		Thread.sleep(2000);
		d.findElement(By.id("q2")).sendKeys("I want to learn automation testing with Java and Selenium Web Driver. This powerful pairing enables developers and testers to automate web browser interactions, simulate user actions, and verify application behavior across different browsers and platforms. ");
		Thread.sleep(2000);
		
		// for dropdown
		
		WebElement dd = d.findElement(By.id("q3"));
		dd.click();
		
		Select c= new Select(dd);
		Thread.sleep(2000);
		c.selectByIndex(1);
		Thread.sleep(2000);
		c.selectByValue("Second Option");
		Thread.sleep(2000);
		c.selectByVisibleText("Fourth Option");
		Thread.sleep(2000);
		
		
		// for radio button
		
		d.findElement(By.cssSelector("input[value='Third Option']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.cssSelector("input[value='Fifth Option']")).click();
		Thread.sleep(2000);
		
		// for checkbox
		
		d.findElement(By.id("q5")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[9]/td/div[1]/input[4]")).click();
		Thread.sleep(2000);
		
		d.findElement(By.cssSelector("input[value='Fifth Check Box']")).click();
		Thread.sleep(2000);
		
		// date picker
		
		d.findElement(By.id("q7")).click();
		
		// for selecting different month
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[9]")).click();
		
		// for selecting different year
		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[102]")).click();
		
		//for selecting any specific date firstly select a date-picker box
		WebElement dp= d.findElement(By.id("ui-datepicker-div"));
		
		// click on date
		dp.findElement(By.linkText("18")).click();
		
		// dropdown
		
		WebElement dt= d.findElement(By.id("q8"));
		dt.click();
		
		Select s = new Select(dt);
		s.selectByVisibleText("IN");
		
		// country dropdown
		
		WebElement dc= d.findElement(By.id("q9"));
		dc.click();
		
		Select y = new Select(dc);
		y.selectByVisibleText("India");
		
		// for canadian provinces dropdown
		
		WebElement dr= d.findElement(By.id("q10"));
		dr.click();
		
		Select p = new Select(dr);
		p.selectByVisibleText("Yukon");
		
		
		// for Title dropdown
		
		WebElement t= d.findElement(By.name("q11_title"));
		t.click();
				
		Select u = new Select(t);
		u.selectByVisibleText("Miss");
		
		// for first name and last name text box
		
		d.findElement(By.name("q11_first")).sendKeys("Monika");
		d.findElement(By.name("q11_last")).sendKeys("Shinde");
		
		WebElement m= d.findElement(By.name("q12_month"));
		m.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[15]/td/select[1]/option[9]")).click();
		
		WebElement day = d.findElement(By.name("q12_day"));
		day.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[15]/td/select[2]/option[28]")).click();
		
		WebElement yr = d.findElement(By.name("q12_year"));
		yr.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[15]/td/select[3]/option[14]")).click();
		
		// for uploading a file - not a correct way but we can do it this way as well
		
		d.findElement(By.id("attach4589")).sendKeys("C:\\Users\\HP\\Downloads\\Java12\\abcd.txt");
		
		
		
		
	}

}
