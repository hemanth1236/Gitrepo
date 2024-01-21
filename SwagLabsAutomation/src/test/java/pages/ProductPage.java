package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id=\"inventory_filter_container\"]/div")
	WebElement name;

	public String getTitle() {
		return name.getText();
	}

	public void Add(String productname) {
		String a = "//div[text()='";
		String c = "']/parent::a/parent::div/following-sibling::div/button";
		String path = a + productname + c;

		driver.findElement(By.xpath(path)).click();
		System.out.println(path);

	}

}
