package Uitest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://simplilearn.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//a[@title='Log in'] ")).click();

		WebElement username = driver.findElement(By.name("user_login"));
		username.sendKeys("abc@xyz.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Abc@12345");

		WebElement remember = driver.findElement(By.id("remember-me"));
		remember.click();

		WebElement Loginbtn = driver.findElement(By.name("btn_login"));
		Loginbtn.click();

		WebElement errormsg = driver.findElement(By.className("error_msg"));
		System.out.println(errormsg.getText());

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println("the total link elements are: " + list.size());
		System.out.println(list);

	}

}
