import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop_Down {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "G:\\\\\\\\MyNewDriver\\\\\\\\chromedriver.exe");
         
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://127.0.0.1:5500/index.html");
        
        
        driver.findElement(By.id("My-Select")).click();
        
       // Keys theKeys = Keys.ARROW_DOWN ;
        //driver.findElement(By.id("My-Select")).sendKeys(theKeys);
        
        driver.findElement(By.id("My-Select")).sendKeys("j"+Keys.ENTER);
        
        
        
	}

}
