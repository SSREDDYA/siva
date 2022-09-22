package ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _2_Browser_Navigation_Commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Browser opening using maven 
				  
				  WebDriverManager.chromedriver().setup();
				  WebDriver ss = new ChromeDriver();
				  
				
				
				//Page Maximizing
        ss.manage().window().maximize();
            
        //Browser Commands
        ss.get("https://www.google.com/");
        
        String title=ss.getTitle();
        
        System.out.println("title of the page..:-"+title);
        
String url=ss.getCurrentUrl();
        
        System.out.println("URL of the page..:-"+url);
    Thread.sleep(3000);    
 //Navigate.TO
ss.navigate().to ("https://netbanking.hdfcbank.com/netbanking/");
        
        String title2=ss.getTitle();
        
        System.out.println("2 nd title of the page..:-"+title2);
        
String url2=ss.getCurrentUrl();
        
        System.out.println("2nd URL of the page..:-"+url2);
        
        
        Thread.sleep(3000); 
      
        //Navigate.BACK
        ss.navigate().back();
 String backtitle=ss.getTitle();
        
        System.out.println("Navigate.Back Page title of the page..:-"+backtitle);
        
String backurl=ss.getCurrentUrl();
        
        System.out.println("Navigate.Back Page of the page..:-"+backurl);
        
        Thread.sleep(3000);
        
      //Navigate.FORWARD 
       ss.navigate().forward(); 
       String forwardtitle=ss.getTitle();
       
       System.out.println("Navigate.forward Page title of the page..:-"+forwardtitle);
       
String forwardurl=ss.getCurrentUrl();
       
       System.out.println("Navigate.forward Page of the page..:-"+forwardurl);
   
       Thread.sleep(3000); 
       
     //Navigate.RE-FRESH
       
       ss.navigate().refresh(); 
       String refreshtitle=ss.getTitle();
       
       System.out.println("Navigate.refresh Page title of the page..:-"+refreshtitle);
       
String refreshurl=ss.getCurrentUrl();
       
       System.out.println("Navigate.refresh Page of the page..:-"+refreshurl);
   
     
       ss.quit();
        
        
	}

}
