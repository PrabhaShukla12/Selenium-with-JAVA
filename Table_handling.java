package selpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://letcode.in/table");
		
		JavascriptExecutor js= (JavascriptExecutor)d;
		js.executeScript("scroll(0,450)");
		
		// table heading
		WebElement table= d.findElement(By.id("simpletable"));
		List <WebElement> list= table.findElements(By.tagName("th"));
		
		for(WebElement h: list)
		{
			String txt= h.getText();
			System.out.println(txt);
		}
		
		//table body
		
		List<WebElement> allrows= table.findElements(By.cssSelector("tbody tr"));
		System.out.println(allrows.size());
		
		int count = allrows.size();
		if (count ==3)
		{
			System.out.print("Pass");
		}
		else
		{
			System.out.print("Fail");
		}
		
		for(WebElement i: allrows)
		{
			List<WebElement> col= i.findElements(By.tagName("td"));
			{
				String fn= col.get(0).getText();
				System.out.print(fn);
				
				String ln= col.get(1).getText();
				System.out.print(" "+ ln);
				
				if (ln.contentEquals("Raj"))
				{
					col.get(3).findElement(By.id("second")).click();
					break;
				}
				
				String em= col.get(2).getText();
				System.out.println(""+ em);
			}
		}
		
		Thread.sleep(1000);
		
		
		// Sortable Tables
		// for headings
		JavascriptExecutor jss= (JavascriptExecutor)d;
		jss.executeScript("scroll(0,1650)");
		
		WebElement tabl = d.findElement(By.xpath("/html/body/app-root/app-table/section/div/div/div[1]/div/div/div/div[3]/div/table"));
		
		List <WebElement> head = tabl.findElements(By.tagName("th"));
		System.out.println("Total headings in table's Heading section is: "+head.size());
		
		for(WebElement i: head)
		{
			String h= i.getText();
			System.out.println(h);
		}
		
		// for body
		List <WebElement> rows = tabl.findElements(By.tagName("tr"));
		System.out.println("Total rows in table's body is: "+ rows.size());
		
		for(WebElement r: rows)
		{
			List<WebElement> colu= r.findElements(By.tagName("td"));
			{
				for(WebElement s: colu)
				{
					String des = s.getText();
					System.out.println(des+" ");
				}
			}
		}
		
	}

}
