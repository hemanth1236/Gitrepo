package Uitest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total num of rows are " + rows.size());

		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("Total num of columns are " + columns.size());
		// find the contant and contry for the particular company
		// solution -1
		String companyname = "Island Trading";
		for (int i = 2; i < rows.size(); i++) {
			WebElement company = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[2]"));
			if (company.getText().equals(companyname)) {

				WebElement Contact = driver
						.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr[" + i + "]/td[2]"));
				WebElement Country = driver
						.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr[" + i + "]/td[3]"));

				System.out.println(Contact.getText());
				System.out.println(Country.getText());
			}

			// Solution -2

			WebElement Contact1 = driver
					.findElement(By.xpath("//td[text()='" + companyname + " ']/following-sibling::td[1]"));
			WebElement Country1 = driver
					.findElement(By.xpath("//td[text()='" + companyname + " ']/following-sibling::td[2]"));
			System.out.println(Contact1.getText());
			System.out.println(Country1.getText());
		}

		driver.close();

	}

}
