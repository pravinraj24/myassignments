package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankLaunch {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uibank.uipath.com/welcome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.linkText("Register For Account")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pravinraj24@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Msdhoni@123");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Pravin");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("R");
		driver.findElement(By.xpath("//select[@id='sex']")).sendKeys("Male");
		driver.findElement(By.xpath("//select[@id='title']")).sendKeys("mr");

		driver.findElement(By.xpath("//select[@id='employmentStatus']")).sendKeys("Full-time");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("24/07/2003");
		driver.findElement(By.xpath("//select[@id='maritalStatus']")).sendKeys("Single");
		driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pravin24");

		String title = driver.getTitle();

		if (title.contains("UiBank")) {
			System.out.println("verified");

		} else {
			System.out.println("Not Verified");
		}

	}

}
