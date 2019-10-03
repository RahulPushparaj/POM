package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Locator extends Base_Class
{
	//1st step create construction
	public Pom_Locator() 
	{
		PageFactory.initElements(push, this);
	}
	//2nd step maintain all locators
	@FindBy(id="email")
	private WebElement textemail;
	@FindBy(id="pass")
	private WebElement textpass;
	@FindBy(id="loginbutton")
	private WebElement clickbutton;
	//3rd step create getter
	public WebElement getTextemail() {
		return textemail;
	}
	public WebElement getTextpass() {
		return textpass;
	}
	public WebElement getClickbutton() {
		return clickbutton;
	}
}
