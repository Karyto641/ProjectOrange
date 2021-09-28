package Orange.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablesPages {

	private WebDriver driver;

	public TablesPages(WebDriver driver) {
		this.driver = driver;
	}

	public void tableLeave(String nameSearch, String actions) {
		WebElement searchTable = driver.findElement(By.xpath("//tr/td/a[contains(text(),'" + nameSearch
				+ "')]/../../td[8]//select/option[text() = '" + actions + "']"));
		searchTable.click();

	}

}