import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking_Whereareyougoing_list {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\MyNewDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https:\\www.booking.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys("Aqaba");
		
		Thread.sleep(1000);
		
		Keys theKeys = Keys.ARROW_DOWN;
		Keys theeKeys = Keys.ENTER;
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys(theKeys);
		driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys(theeKeys);

	}

}
