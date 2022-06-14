package SeleniumMarch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);

		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://mphc.gov.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
