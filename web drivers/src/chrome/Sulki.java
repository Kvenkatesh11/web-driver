package chrome;



import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;




public class Sulki {
	
  public static void main (String[] args) throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Durga Prasad\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =new ChromeDriver();
	    
	    driver.get("http://apps.qaplanet.in/qahrm/login.php");
	    Screen sc = new Screen();
	    
	    Pattern p1 = new Pattern("C:\\Users\\Durga Prasad\\Desktop\\sikuli images\\username.PNG");
	    Pattern p2 = new Pattern("C:\\Users\\Durga Prasad\\Desktop\\sikuli images\\password.PNG");
	    Pattern p3 = new Pattern("C:\\Users\\Durga Prasad\\Desktop\\sikuli images\\login.PNG");
	    
	    sc.type(p1,"qaplanet1");
	    sc.type(p2,"lab1");
	    sc.click(p3);
	    
	    
  }
	

}
