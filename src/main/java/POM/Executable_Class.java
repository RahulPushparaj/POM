package POM;

public class Executable_Class extends Pom_Locator
{
	public static void main(String[] args) 
	{
		launchBrowser("https://www.facebook.com");
				Pom_Locator f = new Pom_Locator();
		type(f.getTextemail(), "RahulPushparaj");
		type(f.getTextpass(), "123456789");

		click(f.getClickbutton());
		closeBrowser();
		
	}

}
