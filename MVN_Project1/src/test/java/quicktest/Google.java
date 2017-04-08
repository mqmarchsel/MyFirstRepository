package quicktest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google 
{
	static WebDriver driver;
	public void Open()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void Search()
	{
		Open();
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnG")).click();
		driver.close();
	}
}
