package testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class VerifyThePage {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://magento.softwaretestingboard.com/ ");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[contains(.,'Sign In ')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("pratiksanas05@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Sanas@111");
		//driver.findElement(By.id("send2")).click();
		Thread.sleep(3000);
		
		WebElement firstResult = driver.findElement(By.id("send2"));
		firstResult.click();
		Thread.sleep(3000);
		driver.findElement(By.id("search")).sendKeys("shirt");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(3000);
		String title = firstResult.getAccessibleName()
				;  //findElement(By.xpath("//meta[@content=\"Search results for: 'shirt'\"]")).
		//String url = firstResult.findElement(By.className("https://magento.softwaretestingboard.com/pub/static/version1678540400/frontend/Magento/luma/en_US")).getAttribute("href");
		
		String expectedTitle = "Search results for: 'shirt'";
		//String expectedUrl = "Expected URL";

		// Compare title and URL with expected values
		if (title.equals(expectedTitle) ) {        //&& url.equals(expectedUrl)
		    System.out.println("Search result details are correct.");
		} else {
		    System.out.println("Search result details are incorrect.");
		}	
	}

}
