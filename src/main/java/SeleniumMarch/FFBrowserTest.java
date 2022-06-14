package SeleniumMarch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FFBrowserTest {

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver","C:\\Users\\rakesh.singh\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("google")) {
			System.out.println("correct title ");
		} else {
			System.out.println("title is not correct ");

		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.close();

	}

}
