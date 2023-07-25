package snehasish;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild {
public static void main(String[] args) {
   	WebDriver driver=new ChromeDriver();
   	driver.manage().window().maximize();
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	driver.get("https://www.yatra.com/");
   	driver.findElement(By.id("userLoginBlock")).click();
   	driver.findElement(By.id("SignUpBtn")).click();
   	driver.findElement(By.id("login-input-wrapper")).sendKeys("9776918714");
   	driver.findElement(By.xpath("(//button[text()='Continue'])[1]")).click();
   	
}
}
