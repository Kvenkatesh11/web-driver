package chrome;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		   //  System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\Durga Prasad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 //     ChromeDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Durga Prasad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		String title= driver.getTitle();
		 if(title.equals("OrangeHRM - New Level of HR Management"))
			 System.out.println("title veryfied");
		 else
			 System.out.println("titlee wrong");
		
		WebElement userp=driver.findElementByXPath("//input[@name='txtUserName']");
		WebElement pass=driver.findElementByXPath("//table[@id='Table_01']/descendant::input[@name='txtPassword']");
		WebElement laxmi=driver.findElementByXPath("//table[@id='Table_01']/descendant::input[@type='Submit']");
		WebElement naresh=driver.findElementByXPath("//input[@name='clear']");
		
		//conditions all elementts
		Thread.sleep(2000);
		if(userp.isDisplayed())
			System.out.println("user name available");
		else
			System.out.println("user name not available");
		if(pass.isDisplayed())
            System.out.println("password avaliable");	
		else
			System.out.println("password not available");
		if(laxmi.isDisplayed() && laxmi.isEnabled())
			System.out.println("login button display and enable");
		else
			System.out.println("login button not display and not enable");
		if(naresh.isDisplayed() && naresh.isEnabled())
	     	System.out.println("cler button display and enable");
		else
			System.out.println("clear button not displayed and not enable");
		// clear previous test in user and password 
		
		userp.clear();
		pass.clear();
		
		//send data in user name and password send keys
		
		String user = "qaplanet1";
		String pas = "lab1";
		
		userp.sendKeys(user);
		pass.sendKeys(pas);
		laxmi.click();
		
		WebElement welc=driver.findElementByXPath("//ul[@id='option-menu']/li[1]");
		 String e = welc.getText();
		 System.out.println(e);
		if ( e.equals("welcome"+ userp));
		System.out.println("successful title correct");
				
	 driver.switchTo().frame("rightMenu");
	 //using iterator
	 
 
   List<WebElement> lst =(List<WebElement>) driver.findElementByXPath("//table/tbody/tr/td[2]");
  
   for(WebElement x:lst) {
	   String cells =x.getText();
	   System.out.println(cells);
	   
   }
   
   
   
  } 
		
		
	}
	

	

