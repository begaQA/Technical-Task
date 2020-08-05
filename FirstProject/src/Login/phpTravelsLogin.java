package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class phpTravelsLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bego\\Desktop\\SELENIUM\\Program\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net\admin");
		driver.findElement(By.id("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.id("password")).sendKeys("demoadmin");
		driver.findElement(By.id("login")).click();
			
	}

}
