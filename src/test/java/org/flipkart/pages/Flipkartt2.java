package org.flipkart.pages;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class Flipkartt2 extends BaseClass{
	public Flipkartt2() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z\']")
	private WebElement closepopup ;
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchbox ;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbtn ;
	@FindBy(xpath="//a[@class='IRpwTa']")
	private List<WebElement> Nike ;
	@FindBy(xpath="//div[@class='_25b18c']")
	private List<WebElement> Price ;

	public WebElement getClosepopup() {
		return closepopup;
	}
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public List<WebElement> getNike() {
		return Nike;
	}
	public List<WebElement> getPrice() {
		return Price;
	}
	
	

}
