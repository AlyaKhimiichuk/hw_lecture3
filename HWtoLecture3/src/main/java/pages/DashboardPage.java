package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	private EventFiringWebDriver driver;
	private String categoryName = "NewTest";
	private By catalogLink = By.linkText("Каталог");
	private By categorySubtab = By.id("subtab-AdminCategories");
	private By addCategory = By.id("page-header-desc-category-new_category");
	private By categoryNameField = By.id("name_1");
	private By submitBtn = By.id("category_form_submit_btn");
	private By filterNameUp = By.xpath("//span[@class='title_box active']//i[@class='icon-caret-up']");
	
	public DashboardPage(EventFiringWebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCategorySubtab() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement catalogLinkElement = wait.until(ExpectedConditions.presenceOfElementLocated(catalogLink));
		Actions builder = new Actions(driver);
		builder.moveToElement(catalogLinkElement).build().perform();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(categorySubtab));
		driver.findElement(categorySubtab).click();
		
	}
	
	public void clickAddCategory() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement addCategoryElement = wait.until(ExpectedConditions.elementToBeClickable(addCategory));
		addCategoryElement.click();
	}
	
	public void addNewCategory() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement categoryNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(categoryNameField));
		categoryNameElement.sendKeys(categoryName);
	}
	
	public void submitChanges() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0, 200);");
		WebElement submitBtnElement = driver.findElement(submitBtn);
		jse.executeScript("arguments[0].scrollIntoView(true);", submitBtnElement);
		submitBtnElement.click();
		// verify successful message is appeared
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-success']")));
	}
	
	public void filterByName() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement filterUpElement = wait.until(ExpectedConditions.elementToBeClickable(filterNameUp));
		filterUpElement.click();
		//verify new category was created
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//td[contains(text(), 'NewTest')]")));
		
	}
	
	

}
