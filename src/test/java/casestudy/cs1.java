package casestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cs1 {
	WebDriver driver;
	
	@Given("user opens testme application on chrome browser")
	public void user_opens_testme_application_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\New_NextGen_Testing_Software\\Selenium Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("user click on SignUp button")
	public void user_click_on_SignUp_button() {
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@Then("user enters username as {string}")
	public void user_enters_username_as(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@Then("user enters firstname as {string} and lastname as {string}")
	public void user_enters_firstname_as_and_lastname_as(String string, String string2) {
		driver.findElement(By.name("firstName")).sendKeys(string);
		driver.findElement(By.name("lastName")).sendKeys(string2);
	}

	@Then("user enters password as {string} and confirmpassword as {string}")
	public void user_enters_password_as_and_confirmpassword_as(String string, String string2) {
		driver.findElement(By.name("password")).sendKeys(string);
		driver.findElement(By.name("confirmPassword")).sendKeys(string2);
	}

	@Then("select gender as {string}")
	public void select_gender_as(String string) {
		Actions act1=new Actions(driver);
		act1.moveToElement(driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]"))).click().build().perform();
	}

	@Then("enter mail as {string}")
	public void enter_mail_as(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@Then("enter mobilenumber as {string}")
	public void enter_mobilenumber_as(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@Then("enter dob as {string}")
	public void enter_dob_as(String string) {
		driver.findElement(By.name("dob")).sendKeys(string);
	}

	@Then("enter address as {string}")
	public void enter_address_as(String string) {
		driver.findElement(By.name("address")).sendKeys(string);
	}

	@Then("enter securityquestion")
	public void enter_securityquestion_as() {
		Select s = new Select(driver.findElement(By.name("securityQuestion")));
		s.selectByVisibleText("What is your Nick Name?");
	}

	@Then("enter answer as {string}")
	public void enter_answer_as(String string) {
		driver.findElement(By.name("answer")).sendKeys(string);
	}

	@Then("click on Register button")
	public void click_on_Register_button() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("verify register result as success")
	public void verify_register_result_as_success() {
		Assert.assertTrue(driver.getTitle().contains("Login"));
		driver.close();
	}


}
