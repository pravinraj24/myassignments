package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select source = new Select(element);
		element.sendKeys("Selenium");
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		WebElement element2 = driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']"));
		element2.sendKeys("Selenium WebDriver");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']")).click();
		element2.sendKeys("Playwright");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-item-label='Playwright']")).click();
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
		driver.findElement(By.xpath("//li[@id='j_idt87:lang_1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
		driver.findElement(By.xpath("//li[@id='j_idt87:value_2']")).click();
	}

}

