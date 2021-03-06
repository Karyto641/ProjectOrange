package Orange.Steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Step;

public class Connection {

	private WebDriver driver;

	@Before
	@Step
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		return this.driver;

	}
	

}
