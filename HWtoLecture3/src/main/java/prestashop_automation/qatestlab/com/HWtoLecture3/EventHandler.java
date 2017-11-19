package prestashop_automation.qatestlab.com.HWtoLecture3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener {
	
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("Fill input " + arg0.getAttribute("id")+ " with value " + arg2.toString());
		
	}
	
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("Value successfully changed");
		
	}
	
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("Before clicking on element " + arg0.getTagName() + " " + arg0.getAttribute("name"));
		
	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("Element successfully clicked ");
		
	}
	
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("Search for element: " + arg0.toString());
		
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("Element found successfully");
		
	}
	
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("Just after navigating to " + arg0);
		
	}
	
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}


	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	
}