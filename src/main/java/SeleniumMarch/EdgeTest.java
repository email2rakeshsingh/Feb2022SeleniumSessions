package SeleniumMarch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTest {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(title)) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct");
		}

	}

}
