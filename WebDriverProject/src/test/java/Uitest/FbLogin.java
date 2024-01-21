package Uitest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("abc@xyz.com");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Abc@12345");

//		WebElement Loginbtn = driver.findElement(By.name("login"));
//		Loginbtn.click();

		WebElement signupbtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
		signupbtn.click();

		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Hemanth");

		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Chilakapati");

		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("hemanthchilakapati@mail.com");

		WebElement passwordfield = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		passwordfield.sendKeys("manthtest");

		WebElement confirmpassword = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		confirmpassword.sendKeys("manthtest");

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select ddday = new Select(day);
		ddday.selectByValue("23");

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select ddmonth = new Select(month);
		ddmonth.selectByVisibleText("Oct");

		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select ddyear = new Select(year);
		ddyear.selectByVisibleText("1997");

		WebElement sex = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		sex.click();

		List<WebElement> alldates = driver.findElements(By.xpath("//select[@id='day']/option"));
		for (WebElement element : alldates) {
			System.out.println(element.getText());
		}
		WebElement icon1 = driver.findElement(By.xpath("//a[@id='birthday-help']/i"));
		icon1.click();

		WebElement icontext = driver.findElement(By.xpath("//b[text()='Providing your birthday']/parent::div"));
		System.out.println(icontext.getText());

		WebElement icon2 = driver.findElement(By.xpath("//a[@id=\"gender-help\"]/i"));
		icon2.click();

		WebElement icontext2 = driver.findElement(By.xpath("//div[contains(text(),\"You can change who sees your\")]"));
		System.out.println(icontext2.getText());

		// driver.close();

	}

}
