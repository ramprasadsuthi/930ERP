package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutTC {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://projects.qedgetech.com/webapp/login.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		String actResult = driver.findElement(By.id("ewPageCaption")).getText();
		if (actResult.equals("Dashboard")) {
			System.out.println("Login successful, Testcase is passed..");
		}
		else {
			System.out.println("Login failed, Testcase is failed..");
		}
		driver.findElement(By.id("mi_logout")).click();
		if (driver.findElement(By.id("btnsubmit")).isEnabled()) {
			System.out.println("Logout successful, Testcase is passed..");
		}
		else {
			System.out.println("Logout failed, Testcase is failed..");
		}
	}
}
