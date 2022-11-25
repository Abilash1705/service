package own;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev140474.service-now.com");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("BZX68Ceh$-mv");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		
		WebElement filter = driver.findElement(By.id("filter"));
		filter.sendKeys("incidents");
		Thread.sleep(2000);
		filter.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='Incidents'])[1]")).click();
		driver.switchTo().frame(0);
		
		 driver.findElement(By.xpath("//button[text()='New']")).click();
		 WebElement num = driver.findElement(By.id("incident.number"));
		 String name=num.getText();
		 System.out.println(name);
		 
		 driver.getWindowHandle();
		 
		 
		 
		 driver.findElement(By.xpath("(//span[@class='icon icon-search'])[1]")).click();
		
		Set<String> handle = driver.getWindowHandles();
		
		List<String> handlesList = new ArrayList<>(handle);
		
		
		driver.switchTo().window(handlesList.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Alfonso Griglen']")).click();
		
		driver.switchTo().window(handlesList.get(0));
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("adhcidggv");
		
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		
		

		
		
		
		
	
		
		
		
	
		
		
	}

}
