package welcome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginApp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.naukri.com/nlogin/login");
	driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("snehasishsamal123@gmail.com");
	driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Maababaom");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']")).click();
	//driver.findElement(By.xpath("//a[text()='Logout']")).click();
}
}
