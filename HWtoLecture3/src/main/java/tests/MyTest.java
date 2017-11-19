package tests;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import pages.DashboardPage;
import pages.LoginPage;
import prestashop_automation.qatestlab.com.HWtoLecture3.BaseTest;

public class MyTest extends BaseTest{
	
	public static void main (String[] args) {
		EventFiringWebDriver driver = getConfigureDriver();
		
		LoginPage lp = new LoginPage(driver);
		DashboardPage dp = new DashboardPage(driver);
		
		lp.open();
		lp.fillEmailField();
		lp.fillPasswdField();
		lp.clickLoginButton();
		dp.clickCategorySubtab();
		dp.clickAddCategory();
		dp.addNewCategory();
		dp.submitChanges();
		dp.filterByName();
		
		quiteDriver(driver);
	}

}
