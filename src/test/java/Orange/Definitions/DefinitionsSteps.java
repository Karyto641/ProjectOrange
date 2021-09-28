package Orange.Definitions;

import org.openqa.selenium.WebDriver;

import Orange.Pages.LeavePage;
import Orange.Pages.LoginPage;
import Orange.Pages.PimPage;
import Orange.Steps.Connection;
import Orange.Steps.Questions;
import Orange.Steps.TablesPages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Connection connection = new Connection();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver);
	private LeavePage leavePage = new LeavePage(driver);
	private TablesPages tablesPages = new TablesPages(driver);
	private Questions questions = new Questions(driver);

	@Given("^open the browser$")
	public void open_browser() {
		this.connection = new Connection();
		this.driver = this.connection.openBrowser();

	}

	@When("^enter username (.*) and the password (.*)$")
	public void fillinLogin(String userName, String password) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.loginIn(userName, password);
	}

	@And("^access the addemployee option$")
	public void addEmployee() {
		this.pimPage = new PimPage(driver);
		this.pimPage.filloutAddEmployee();
	}

	@Then("^fill out the fields first name (.*) and last name (.*)$")
	public void filloutEmployee(String firstName, String lastName) {
		this.pimPage = new PimPage(driver);
		this.pimPage.fillinAddEmployee(firstName, lastName);

	}

	@Then("^position on the form Employee Information and search Employee (.*)$")
	public void employeeInformation(String employeeName) {
		this.pimPage = new PimPage(driver);
		this.pimPage.searchEmployee(employeeName);

	}

	@Then("^select sub unit list (.*)$")
	public void searchLeave(String subUnit) {
		this.leavePage = new LeavePage(driver);
		this.leavePage.searchLeave(subUnit);

	}

	@And("^look in the table (.*) select action (.*)$")
	public void searchTable(String nameSearch, String actions) {
		this.tablesPages = new TablesPages(driver);
		this.tablesPages.tableLeave(nameSearch, actions);

	}

	@Then("^enter start date (.*) and enter finish date(.*)$")
	public void searchForCalendar(String dateInit, String dateFinish) {
		this.leavePage = new LeavePage(driver);
		this.leavePage.searchCalendar(dateInit, dateFinish);

		
	}

	@And("^close browser$")
	public void closeBrowser() {
		this.questions = new Questions(driver);
		this.questions.closeBrowser();
	}

}