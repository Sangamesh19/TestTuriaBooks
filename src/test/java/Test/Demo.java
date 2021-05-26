package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import org.testng.annotations.Test;
public class Demo
{

@Test
public void add()
{
	System.out.println("VJHGVHJVJDS");
	System.setProperty("webdriver.chrome.driver", "./Lib/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.google.com");
	
}

}
