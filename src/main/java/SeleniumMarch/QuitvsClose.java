package SeleniumMarch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitvsClose {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver",
				//"D:\\Naveen_Java_Feb2022\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.quit();
		driver.close();
		//System.out.println(driver.getTitle());
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

	}

}
