package welcome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lunch_Browser {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.get("https://www.bbc.com/");
	Thread.sleep(4000);
	driver.manage().window().minimize();
	driver.close();
}
}
