package Orange.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

	private Questions questions;

	@FindBy(how = How.XPATH, using = "//input[@type = 'submit']")
	private WebElement btnLogin;

	@FindBy(how = How.CSS, using = "#menu_pim_viewPimModule")
	private WebElement btnPim;

	@FindBy(how = How.ID, using = "menu_pim_addEmployee")
	private WebElement btnAddEmployee;

	@FindBy(how = How.ID, using = "btnSave")
	private WebElement btnSave;
	
	@FindBy(how = How.ID, using = "menu_leave_viewLeaveModule")
	private WebElement btnLeave;

	@FindBy(how = How.XPATH, using = "//input[@name= 'btnSearch']")
	private WebElement btnSeach;
	
	
	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.questions = new Questions(driver);

	}

	public void btnLogin() {
		btnLogin.isDisplayed();
		btnLogin.click();
	}

	public void btnPim() {
		questions.tiempoSegundos(10);
		btnPim.isDisplayed();
		btnPim.click();
	}

	public void btnAddEmployee() {
		btnAddEmployee.isDisplayed();
		btnAddEmployee.click();
		questions.tiempoSegundos(10);
		questions.screenShot();
		
	}
	
	public void btnSave() {
		btnSave.isDisplayed();
		btnSave.click();
	}
	
	public void btnLeave() {
		btnLeave.isEnabled();
		btnLeave.click();
	}
	
	public void btnSearch() {
		btnSeach.isEnabled();
		btnSeach.click();
	}
}
