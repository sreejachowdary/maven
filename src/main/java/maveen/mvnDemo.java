package maveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mvnDemo {
	@Test
	public void Test(){
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		/*System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
		System.out.println(driver.getTitle());*/
		driver.close();
	}

}


