package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _1_Browser_Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Browser opening 
		//	System.setProperty("Webdriver.chrome.diver", "\\C:\\chromedriver.exe");	
			//	WebDriver ss = new ChromeDriver();
		
				
		
		//Browser opening using maven 
				  
				  WebDriverManager.chromedriver().setup();
				  WebDriver ss = new ChromeDriver();
				  
				//input[@id="twotabsearchtextbox"]  
				
				//Page Maximizing
        ss.manage().window().maximize();
            
        //Browser Commands
        ss.get("https://netbanking.hdfcbank.com/netbanking/");
        
        String title=ss.getTitle();
        
        System.out.println("title of the page..:-"+title);
        
String url=ss.getCurrentUrl();
        
        System.out.println("URL of the page..:-"+url);
        
String PageSource=ss.getPageSource();
        
        System.out.println("PageSource of the page..:-"+PageSource);
        
    WebElement tag=ss.findElement(By.tagName("(img)[2])"));
    
    String name=tag.getText();
    System.out.println("TAGNAME..:-"+name);
    
        //ss.Quit();
        ss.close();
        
	}

}
