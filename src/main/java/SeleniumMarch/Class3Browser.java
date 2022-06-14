package SeleniumMarch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Naveen_Java_Feb2022\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver = new ChromeDriver();
//		driver = new ChromeDriver();

//		driver.get("https://www.google.com");
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1  = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver1.get("https://mphc.gov.in/");
		driver2.get("https://mail.google.com/mail/u/0/#sent");
	}

}
