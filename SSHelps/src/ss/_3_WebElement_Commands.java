package ss;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class _3_WebElement_Commands {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		//Browser opening using Maven 
				  
				  WebDriverManager.chromedriver().setup();
				  WebDriver ss = new ChromeDriver();
				  
				
				
				//Page Maximizing
        ss.manage().window().maximize();
            
        //Browser Commands
        ss.get(" https://parabank.parasoft.com/parabank/register.htm");
     WebElement gettext=ss.findElement(By.xpath("//h1[text()='Signing up is easy!']"));
     
     //GetText
     
    String text= gettext.getText();
    System.out.println("Page getText:-"+ text);
     
    //Gettagname
    
    String tagname= gettext.getTagName();
    System.out.println("Page tagname:-"+ tagname);
   
    //getclass
    
    Class<? extends WebElement> getclass= gettext.getClass();
    System.out.println("Page getclass:-"+ getclass);
     
//Getsize
    
    org.openqa.selenium.Dimension getsize=  gettext.getSize();
    System.out.println("Height :" + getsize.height + "Width : "+ getsize.width); 
   
   
//GetCSSValue
    WebElement gettext2=ss.findElement(By.className("button"));
 
    System.out.println("Page getCssvalue:-"+ getCssValue(gettext2));
   

  
    

	Actions act= new Actions(ss);
	
    ss.findElement(By.id("customer.firstName")).sendKeys("siva");
       // ss.
    
    
    File srcFile = ((TakesScreenshot)ss).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File(".\\src\\ss\\Screenshots\\scrennshot1.png"));


    
    ss.navigate().to("https://the-internet.herokuapp.com/infinite_scroll");
   WebElement siva = ss.findElement(By.xpath("//html"));
   Thread.sleep(3000);
   act.dragAndDropBy(siva, 0, 10).build().perform();
   
       Thread.sleep(3000); 
       
     
       ss.quit();
        
        
	}

	private static String getCssValue(WebElement gettext2) {
		// TODO Auto-generated method stub
		return null;
	}

}
