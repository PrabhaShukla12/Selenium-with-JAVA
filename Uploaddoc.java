package selpro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploaddoc {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.monster.com/profile/onboarding/upload?userRequestId=5f34f928-bf59-4b63-bb54-d1984930343c&monsterProps=eyJsYW5ndWFnZVRhZyI6ImVuLVVTIiwicmVjb2duaXplZFVzZXIiOmZhbHNlLCJtb2RlIjoiU2lnblVwIiwicmVkaXJlY3RVcmkiOiIvcHJvZmlsZS9kZXRhaWw_c2lnblVwRmxvdz1SRVNVTUVfVVBMT0FEIiwic2lnblVwRmxvdyI6IlJFU1VNRV9VUExPQUQiLCJpc0dvb2dsZU9uZVRhcCI6ZmFsc2UsImRldmljZUlkIjoiOTdmMDU1NGEtMWZiMi00ZDg4LThmNzMtMzM2OTkzM2UzYTA2IiwiaXNPbmVJQU0iOnRydWV9&platformId=Web&userHints=first-time&state=3805a743-9068-4143-9581-992be53204e2");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		// login by correct email and password
		d.findElement(By.id("Input_Email")).sendKeys("ae3999628@gmail.com");
		d.findElement(By.id("Input_Password")).sendKeys("Prabha@1234%");
		d.findElement(By.name("Input.Button")).click();
		
		// clicking on upload resume
		d.findElement(By.className("FileUpload_dropzoneTitle__F1Twn")).click();
		
		// Copying the file
		StringSelection s = new StringSelection("C:\\Users\\HP\\Downloads\\Java12\\abcd.txt");
		
		// Pasting the file in the System clip board till the time we paste it anywhere else
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		// creating robot class for handling keyboards and mouse events
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.setAutoDelay(2000);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.setAutoDelay(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
