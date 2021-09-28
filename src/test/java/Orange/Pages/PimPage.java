package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;

public class PimPage {

	private ButtonPages buttonPages;
	private Questions questions;

	@FindBy(how = How.ID, using = "firstName")
	private WebElement txtFirstName;

	@FindBy(how = How.ID, using = "lastName")
	private WebElement txtLastName;
	
	@FindBy(how = How.XPATH, using = "//input[@id=\"empsearch_employee_name_empName\"]")
	private WebElement txtEmployeeName;

	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
	}

	public void filloutAddEmployee() {
		buttonPages.btnPim();
		buttonPages.btnAddEmployee();

	}

	public void fillinAddEmployee(String firstName, String lastName) {
		txtFirstName.sendKeys(firstName);
		txtLastName.sendKeys(lastName);
		buttonPages.btnSave();
		questions.tiempoSegundos(5);
	//	questions.assertWelcome();
		questions.tiempoSegundos(5);
		questions.assertFirstName(firstName, lastName);

	}

	public void searchEmployee(String employeeName) {
		buttonPages.btnPim();
		txtEmployeeName.sendKeys(employeeName);
		questions.tiempoSegundos(5);
		buttonPages.btnSearch();
		
		
	}

}
