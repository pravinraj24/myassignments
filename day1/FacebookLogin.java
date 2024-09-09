package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pravin");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("pravinraj24@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Msdhoni@134");

		String title = driver.getTitle();
		if (title.contains("Facebook")) {
			System.out.println("verified");
		}

		else {
			System.out.println("Not Verified");
		}

	}

}
