package appliTools;
//Illustration of using Appli Tools

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;

public class Visual_Validation_TC01 
{
	public static String api_key = "AhuJ8Wano90DQq5zDeRBj2LJgSaKt1114UD1oQz29yCEs110";
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejkumar\\Desktop\\Selenium\\softwares\\chromedriver.exe");
		
		Eyes eye = new Eyes();
		eye.setApiKey(api_key);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://applitools.com/helloworld/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		eye.open(driver, "Helloworld", "First Page Check", new RectangleSize(800, 800));
		
		eye.checkWindow();
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me!')]")).click();
		
		eye.checkWindow();
		
		eye.close();
		
		System.out.println("Page title :: "+driver.getTitle());
		driver.close();
	}
}
