package SeleniumMarch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver",
				//"D:\\Naveen_Java_Feb2022\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("Google")) {
			System.out.println("Correct Title");

		} else {
			System.out.println(" Title is worng");
		}
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			driver.quit();
	}

}
