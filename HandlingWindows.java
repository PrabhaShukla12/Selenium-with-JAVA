package selpro;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://letcode.in/window");
		
		String wh= d.getWindowHandle();
		System.out.println("ID of the parent window is: "+ wh);
		
		d.findElement(By.id("home")).click();
		
		Set <String> whs= d.getWindowHandles();
		System.out.println("ID : "+ whs);
		
		System.out.println(d.getTitle());			// It will print the parent window's title
		System.out.println(d.getCurrentUrl());		// It will print the parent's window URL
		
		// Switching the window from one to another, firstly we need to convert the set of string to the list of string to get the length
		
		List <String> list = new ArrayList<String>(whs);
		d.switchTo().window(list.get(1));
		
		System.out.println(d.getTitle());			// It will print the child window's title becoz we have switched the window to child window
		System.out.println(d.getCurrentUrl());		// It will print the child's window URL becoz we have switched the window to child window
		
		d.switchTo().window(list.get(0));
		d.findElement(By.id("multi")).click();
		d.close();
		
		// Now as we have closed parent window so we need to re-arrange the list so that the windows get the new list or index
		
		
		Set <String> whs1= d.getWindowHandles();
		list.clear();
		list.addAll(whs1);
		
		d.switchTo().window(list.get(2));
	
		System.out.println(d.getTitle());			// It will print the child window's title becoz we have switched the window to child window
		System.out.println(d.getCurrentUrl());
	}

}
