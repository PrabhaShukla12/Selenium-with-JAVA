package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://letcode.in/radio");

		/*WebElement f1= d.findElement(By.className("card-content"));
		
		d.switchTo().frame(f1);
		*/
		d.findElement(By.xpath("//input[@type='radio']")).click();
		
		// confirming that only one radio button is selected 
		
		d.findElement(By.xpath("//input[@type='radio' and @name='one']")).click();
		
		Boolean but = d.findElement(By.xpath("//input[@type='radio' and @id='one']")).isSelected();
		
		if(but == true)
		{
			System.out.println("Yes is selected");
		}
		
		Thread.sleep(2000);
		
		Boolean but2 = d.findElement(By.xpath("//input[@type='radio' and @id='two']")).isSelected();
		
		if(but2 == true)
		{
			System.out.println("No is selected");
		}
		
		// finding a bug
		
		WebElement rad1 = d.findElement(By.xpath("//*[@id=\"nobug\"]"));
		WebElement rad2 = d.findElement(By.xpath("//*[@id=\"bug\"]"));
		
		rad1.click();
		rad2.click();
		
		Boolean r1= rad1.isSelected();
		Boolean r2= rad2.isSelected();
		
		if(r1==r2)
		{
			System.out.println("Both the radio button are selected at a same time and hence it is a bug");
		}
		
		// To find out which radio button is selected
		
		WebElement ra1 = d.findElement(By.xpath("//input[@type='radio' and @id='foo']"));
		
		WebElement ra2 = d.findElement(By.xpath("//input[@type='radio' and @id='notfoo']"));
		
		Boolean raa1= ra1.isSelected();
		Boolean raa2= ra2.isSelected();
		
		if(raa1==true)
		{
			System.out.println("Foo is selected");
		}
		
		if(raa2==true)
		{
			System.out.println("Bar is selected");
		}
		
		// confirming if the last field is disabled
		
		WebElement may= d.findElement(By.xpath("//input[@type='radio' and @id='maybe']"));
		Boolean maybe = may.isEnabled();
		
		if(maybe == false)
		{
			System.out.println("Last field is disabled");
		}
		
		// to check whether the check box is already selected
		
		WebElement ch= d.findElement(By.xpath("/html/body/app-root/app-radio/section/div/div/div[1]/div/div/div[6]/label[2]/input"));
		
		Boolean check = ch.isSelected();
		
		if(check==true)
		{
			System.out.println("Checkbox is already selected");
		}
		
		// Accepting the terms and conditions
		
		d.findElement(By.xpath("//a[text()='FAKE terms and conditions' ]")).click();
		
	}

}
