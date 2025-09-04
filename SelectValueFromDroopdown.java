package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValueFromDroopdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://letcode.in/dropdowns");
		
		Thread.sleep(1000);
		
		WebElement fruit= d.findElement(By.id("fruits"));
		fruit.click();
		
		Select s= new Select(fruit);
		s.selectByValue("0");
		
		Thread.sleep(1000);
		
		WebElement sp = d.findElement(By.xpath("//*[@id='superheros']"));
		
		Select suph= new Select(sp);
		
		suph.selectByIndex(0);
		suph.selectByVisibleText("Batman");
		suph.selectByValue("ek");
	
		// selecting last programming lang and print all of the options mentioned in the dropdown
		
		JavascriptExecutor js= (JavascriptExecutor)d;
		js.executeScript("scroll(0,300)");
		
		Thread.sleep(3000);
		
		WebElement la= d.findElement(By.id("lang"));
		Select ln= new Select(la);
		la.click();
		
		List <WebElement> lang= ln.getOptions();
		
		int si= lang.size();
		
		System.out.println("Size of the list is: "+si);
		
		for (int i=0; i<si ;i++)
		{
			System.out.println(lang.get(i).getText());
		}
		ln.selectByIndex(si-1);
		
		// selecting India from the dropdown and print whichever has been selected
		
		WebElement coun= d.findElement(By.id("country"));
		
		coun.click();
		
		Select c= new Select(coun);
		
		List<WebElement> list = c.getOptions();
		list.size();
		
		c.selectByValue("India");
		
		for (int j=0; j<list.size() ;j++)
		{
			String co = list.get(j).getText();
			
		if (co.contentEquals(("India")))
		{
			System.out.println("The Selected country is: India");
		}
		}
	}

}
