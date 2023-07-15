package testSelenium;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selefirst {

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
//driver.findElement(By.partialLinkText("Create an Account")).click();
//driver.findElement(By.id("firstname")).sendKeys("Test");
//driver.findElement(By.id("lastname")).sendKeys("Demo");
//Thread.sleep(3000);
//driver.findElement(By.id("email_address")).sendKeys("telagadesaraj581998@gmail.com");
//driver.findElement(By.id("password")).sendKeys("Sanas@111");
//Thread.sleep(3000);
//driver.findElement(By.id("password-confirmation")).sendKeys("Sanas@111");
//Thread.sleep(3000);
//driver.findElement(By.xpath("(//span[.='Create an Account'])[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//a[contains(.,'Sign In ')])[1]")).click();
Thread.sleep(3000);
driver.findElement(By.id("email")).sendKeys("pratiksanas05@gmail.com");
Thread.sleep(3000);
driver.findElement(By.id("pass")).sendKeys("Sanas@111");
//WebElement untb = driver.findElement(By.id("email"));
//WebElement pwtb = driver.findElement(By.id("pass"));
//WebElement logbu = driver.findElement(By.id("send2"));
//String path = "./data/data1.xlsx";
//Workbook wb = WorkbookFactory.create(new FileInputStream(path));
//String un = wb.getSheet("input").getRow(3).getCell(0).toString();
//String pw = wb.getSheet("input").getRow(3).getCell(1).toString();
//untb.sendKeys(un);
//Thread.sleep(2000);
//pwtb.sendKeys(pw);
//Thread.sleep(2000);
//logbu.click();
//Thread.sleep(3000);
//driver.findElement(By.id("search")).sendKeys("shirt");
//Thread.sleep(3000);
driver.findElement(By.id("send2")).click();
Thread.sleep(3000);
driver.findElement(By.id("search")).sendKeys("shirt");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@title='Search']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//a[contains(.,'Balboa Persistence Tee')])")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='option-label-size-143-item-168']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@id='option-label-color-93-item-52']")).click();
driver.findElement(By.xpath("//span[contains(.,'Add to Cart')]")).click();
Thread.sleep(6000);
driver.findElement(By.xpath("//a[@class='action showcart']")).click();
Thread.sleep(10000);
driver.findElement(By.id("top-cart-btn-checkout")).click();
//driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("Shiv chs, sec -18, nerul");
//driver.findElement(By.name("city")).sendKeys("Navi Mumbai");
//driver.findElement(By.name("postcode")).sendKeys("400706");
//WebElement CountryLB = driver.findElement(By.cssSelector("select[name='country_id']"));
//Thread.sleep(6000);
//Select s1 = new Select(CountryLB);
//Thread.sleep(6000);
//s1.selectByVisibleText("India");
//Thread.sleep(3000);
//driver.findElement(By.name("telephone")).sendKeys("9702722645");
//Thread.sleep(10000);
//WebElement StateLB = driver.findElement(By.cssSelector("select[name='region_id']"));
//Select s2= new Select(StateLB);
//Thread.sleep(6000);
//s2.selectByVisibleText("Maharashtra");
Thread.sleep(15000);
driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
Thread.sleep(10000);
driver.findElement(By.cssSelector("button[class='action primary checkout']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//a[contains(.,'Sign Out')])[1]")).click();
Thread.sleep(10000);
driver.close();
	}
}
