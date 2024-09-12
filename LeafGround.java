package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='grid formgrid']//div[2]")).click();
		driver.findElement(By.xpath("(//div[@class='grid formgrid'])[2]//div[2]")).click();
		driver.findElement(By.xpath("(//div[@class='grid formgrid'])[3]//div[2]")).click();
		driver.findElement(By.xpath("(//div[@class='grid formgrid'])[4]//div[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("IStanbul");
		driver.findElement(By.xpath("(//label[text()='Istanbul'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
	}

}

