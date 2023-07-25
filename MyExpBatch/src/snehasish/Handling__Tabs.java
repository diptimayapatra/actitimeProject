package snehasish;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling__Tabs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		String eTitle = "actiTIME Online Terms of Service";
		System.out.println(eTitle);
		Set<String> address = driver.getWindowHandles();
		for (String s : address) {
			driver.switchTo().window(s);
			String aTitle = driver.getTitle();
			System.out.println(aTitle);
			if (eTitle.equals(aTitle)) {
				List<WebElement> headings = driver.findElements(By.tagName("h2"));
				for (WebElement e : headings) {
					System.out.println(e.getText());

				}
				Thread.sleep(2000);
				driver.close();

			}
			
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
