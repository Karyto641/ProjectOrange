package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;

public class LoginPage {

	private ButtonPages buttonPages;

	@FindBy(how = How.ID, using = "txtUsername")
	private WebElement txtUser;

	@FindBy(how = How.XPATH, using = "//input[@id='txtPassword']")
	private WebElement txtPass;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

		this.buttonPages = new ButtonPages(driver);
	}

	public void loginIn(String userName, String password) {
		txtUser.sendKeys(userName);
		txtPass.clear();
		txtPass.sendKeys(password);
		buttonPages.btnLogin();

	}

}
