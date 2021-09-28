package Orange.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ListPages {

	private WebDriver driver;

	public ListPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void listSubUnit(String subUnit) {

		WebElement listSubUnit = driver.findElement(By.xpath("//select/option[text() = '" + subUnit + "']"));
		listSubUnit.click();

	}
}
