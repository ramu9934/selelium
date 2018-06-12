package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String title=driver.getTitle();
		System.out.println(title);
		
	   driver.findElement(By.id("identifierId")).sendKeys("ramunakkana.18");
	   driver.findElement(By.xpath("//span[@class='RveJvd snByac' and contains(text(),'Next')]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8019944229");
	   driver.findElement(By.xpath("//span[@class='RveJvd snByac' and contains(text(),'Next')]")).click();
	   Thread.sleep(5000);
	   driver.close();
	   

	}

}
