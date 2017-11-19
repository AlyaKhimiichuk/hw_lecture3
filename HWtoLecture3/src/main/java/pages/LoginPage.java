package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import utilities.Properties;

public class LoginPage {
	private EventFiringWebDriver driver;
	private By emailField = By.id("email");
	private By passwordField = By.id("passwd");
	private By loginButton = By.name("submitLogin");
	private String email = "webinar.test@gmail.com";
	private String password = "Xcg7299bnSmMuRLp9ITw";

		
	public LoginPage(EventFiringWebDriver driver) {
		this.driver = driver;
	}
	
	public void open() {
		driver.get(Properties.getBaseAdminUrl());		
	}
	
	public void fillEmailField() {
		driver.findElement(emailField).sendKeys(email);	
	}
	
	public void fillPasswdField() {
		driver.findElement(passwordField).sendKeys(password);	
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
}
		
