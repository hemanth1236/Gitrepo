package Uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stuby

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();

		driver1.get("https://www.simplilearn.com");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.simplilearn.com");

	}

}
