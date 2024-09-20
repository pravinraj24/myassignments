package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//div[@class='station-body col'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Banglore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='station-body col']")).click();
		driver.findElement(By.xpath("//Button[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("//div[@id='search-button']")).click();
		WebElement element1 = driver.findElement(By.xpath("//h5[@class='title']"));
		String bus = element1.getText();
		System.out.println(bus);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		WebElement element2 = driver.findElement(By.xpath("//div[@class='text-grey']"));
		String seat = element2.getText();
		System.out.println(seat);
		
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='1UA']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		WebElement element3 = driver.findElement(By.xpath("//div[@class='seat-fare col auto']"));
		String fare = element3.getText();
		System.out.println("The Total fare for bus:"+fare);
		Thread.sleep(2000);
		WebElement selectseat = driver.findElement(By.xpath("//div[@class='selected-seat col auto']//div[1]/div[1]"));
		String Seats=selectseat.getText();
		System.out.println("Seat selected:"+Seats);
		Thread.sleep(1000);
		driver.close();
		
	}
	

}
