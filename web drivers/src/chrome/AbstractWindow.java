package chrome;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class AbstractWindow {
	public static void main(String[] args) throws AWTException {
		 
		//launch web page
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Durga Prasad\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	Robot rt = new Robot();
	
	StringSelection ss=new StringSelection("C:\\Users\\Durga Prasad\\Desktop\\images.jpg");
	
	// open url
    driver.get("http://apps.qaplanet.in/qahrm/login.php");
    
    WebElement name=driver.findElementByName("txtUserName");
    name.clear();
   
   if(name.isDisplayed())
 	    System.out.println("username has available");
 	    
 	    else
 	    	 System.out.println("namess unavailable");
     
     // passwoed location
    WebElement passwo=driver.findElementByName("txtPassword");

     passwo.clear();

      if(passwo.isDisplayed())
     	System.out.println("pssword name available");
     else
     	System.out.println("password not available");    
     //login type
     
     WebElement title1=driver.findElementByName("Submit");
     
     if(title1.isDisplayed()&&title1.isEnabled())
     System.out.println("display login");
     else
     	System.out.println("not display login");
     WebElement title2=driver.findElementByClassName("button");
		
     if(title2.isDisplayed()&&title2.isEnabled())
     	System.out.println("clear button enable yes");
     else
     	System.out.println("clar button enable no");
     
     //assign username and password to strings
          
          String username="qaplanet1";
          String password="lab1";
        //  Login to HRM

          name.sendKeys(username);
          passwo.sendKeys(password);
       

         // verify OrangeHRM title, else failed to login
          String title=driver.getTitle();
          if(title.equals("OrangeHRM - New Level of HR Management"))
         	 System.out.println("title is correctt");
          else
         	 System.out.println("title is not matchd");
          
          title1.click();
          WebElement little=driver.findElementByXPath("//li[contains(text(),'Welcome')]");
          String welcom=little.getText();
          // verify welcome text                                               
         		
          if(welcom.equals("Welcome"+ username))
         	System.out.println("welcom successful");
         		 else
         			 System.out.println("welcom not available");
          
        //abstract windows toolkit 
          
          driver.switchTo().frame("rightMenu");
          
          driver.findElementByXPath("//div[@class='actionbuttons']/input[@type='button']").click();
          driver.findElementByXPath("//input[@id='photofile']").click();
          
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
         
          rt.delay(2000);
          
          rt.keyPress(KeyEvent.VK_CONTROL);
          rt.keyPress(KeyEvent.VK_V);
          rt.keyRelease(KeyEvent.VK_V);
          rt.keyRelease(KeyEvent.VK_CONTROL);
          
          rt.keyPress(KeyEvent.VK_TAB);
          rt.keyRelease(KeyEvent.VK_TAB);
          
          rt.keyPress(KeyEvent.VK_TAB);
          rt.keyRelease(KeyEvent.VK_TAB);
          
      rt.keyPress(KeyEvent.VK_ENTER);
      rt.keyRelease(KeyEvent.VK_ENTER);
       
      rt.delay(2000);
    
   
	}
  }
