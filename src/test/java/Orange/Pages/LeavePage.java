package Orange.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Orange.Steps.ButtonPages;
import Orange.Steps.ListPages;
import Orange.Steps.Questions;
import Orange.Steps.TablesPages;

public class LeavePage {

	private ButtonPages buttonPages;
	private ListPages listPages;
	private Questions questions;
	private TablesPages tablesPages;
	
	
	@FindBy(how = How.ID, using = "calFromDate")
	private WebElement txtCalendar;
	
	@FindBy(how = How.ID, using = "calToDate")
	private WebElement txtCalendarfinish;

	public LeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.listPages = new ListPages(driver);
		this.questions = new Questions(driver);
		this.tablesPages = new TablesPages(driver);

	}

	public void searchLeave(String subUnit) {
		buttonPages.btnLeave();
		listPages.listSubUnit(subUnit);
		buttonPages.btnSearch();
		questions.tiempoSegundos(1);
		questions.scrollSeach();

	}

	public void actions(String nameSearch, String actions) {
		tablesPages.tableLeave(nameSearch, actions);
	}

	public void searchCalendar(String dateInit, String dateFinish) {
		buttonPages.btnLeave();
		txtCalendar.clear();
		txtCalendar.sendKeys(dateInit);
		txtCalendar.sendKeys(Keys.ENTER);
		txtCalendarfinish.clear();
		txtCalendarfinish.sendKeys(dateFinish);
		txtCalendarfinish.sendKeys(Keys.ENTER);
		buttonPages.btnSearch();
	
	}

}
