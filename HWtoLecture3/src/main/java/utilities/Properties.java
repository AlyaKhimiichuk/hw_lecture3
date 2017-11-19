package utilities;

import org.openqa.selenium.remote.BrowserType;



public class Properties {
	private static final String DEFAULT_BASE_ADMIN_URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
	private static final String DEFAULT_BROWSER = BrowserType.CHROME;
	
	public static String getBaseAdminUrl() {
		return System.getProperty(EnvVariables.BASE_ADMIN_URL.toString(), DEFAULT_BASE_ADMIN_URL);
		
	}
	
	public static String getBrowser() {
		return System.getProperty(EnvVariables.BROWSER.toString(), DEFAULT_BROWSER);
	}
	
}
enum EnvVariables{
	BASE_ADMIN_URL("env.admin.url"), 
    BROWSER("browser");
		
	private String value;
	EnvVariables(String value) {this.value = value; }
		
	@Override
	public String toString() {return value; }
}