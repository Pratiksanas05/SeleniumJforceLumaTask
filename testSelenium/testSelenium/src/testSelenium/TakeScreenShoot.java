package testSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;


public class TakeScreenShoot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com");
		WebElement emailTB = driver.findElement(By.id("email"));
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		emailTB.sendKeys("dinga@gmail.com");//if we perform action after refreshing the page

		
	}

}
