// Filling out all the mandatory details and submitting the form

package selpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class Practise_form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://demoqa.com/automation-practice-form");
		
		Thread.sleep(1000);
		
		//scrolling down the page
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("scroll(0,700)");
		
		// Entering name in an incorrect format
		d.findElement(By.id("firstName")).sendKeys("654$%@#$%$^");
		
		Thread.sleep(1000);
		
		JavascriptExecutor jss = (JavascriptExecutor)d;
		jss.executeScript("scroll(0,700)");
		
		Thread.sleep(1000);
		
		//clicking on submit only after entering the incorrect name
		d.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		
		// Entering the correct details now
		d.findElement(By.id("firstName")).clear();
		Thread.sleep(1000);
		d.findElement(By.id("firstName")).sendKeys("Monika");
		Thread.sleep(1000);
		d.findElement(By.id("lastName")).sendKeys("Shinde");
		Thread.sleep(1000);
		
		d.findElement(By.id("userEmail")).sendKeys("ae3999@gmail.com");
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]")).click();
		Thread.sleep(1000);
		
		d.findElement(By.id("userNumber")).sendKeys("9898989898");
		Thread.sleep(1000);
		
		// For entering dob
		WebElement ele= d.findElement(By.id("dateOfBirthInput"));
		ele.click();
		Thread.sleep(1000);
		// for selecting month
		d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[1]")).click();
		Thread.sleep(1000);
		// for selecting year
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[100]")).click();
		// for selecting any specific date
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")).click();
		Thread.sleep(1000);
		
		
		JavascriptExecutor jssc = (JavascriptExecutor)d;
		jssc.executeScript("scroll(0,650)");
		
		// for auto suggestion subject dropdown
		
		
		
		/*List<WebElement> list = d.findElements(By.xpath("// div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		System.out.println(list.size());
		int count =list.size();
		
		for (int i=0; i<count; i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("Computer Science"))
			{
				list.get(i).click();
				break;
			}
		}
		*/
		
		Thread.sleep(1000);
		
		// for checkbox
		d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		Thread.sleep(1000);
		
		// for uploading a file
		d.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\HP\\Downloads\\Java12\\abcd.txt");
		Thread.sleep(1000);
		
		// Entering address
		d.findElement(By.id("currentAddress")).sendKeys("Testing Test");
		Thread.sleep(1000);
		
		JavascriptExecutor jssp = (JavascriptExecutor)d;
		jssp.executeScript("scroll(0,900)");
		
		
		
		// clicking submit button
		
		d.findElement(By.id("submit")).click();
		Thread.sleep(1000);
	}
	

}
