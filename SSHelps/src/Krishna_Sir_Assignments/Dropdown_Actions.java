package Krishna_Sir_Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Actions {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

   // Browser Opening
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		   // Browser maximize
		
		driver.manage().window().maximize();
		
		// Web Page open by Using Browser commands
		
		driver.get(" https://register.rediff.com/register/register.php?");
		
	
		String title =driver.getTitle();
		System.out.println("Page title is-------:-"+title);
		String url =driver.getCurrentUrl();
		System.out.println("Page CurrentUrl is-------:-"+url);
		
		// Operating the WebElemnts By using Webelements 
		driver.findElement(By.xpath("//input[@maxlength='61']")).sendKeys("ss reddy");
		
		driver.findElement(By.xpath("//input[@maxlength='30']")).sendKeys("ssreddy3214");
		
		
		driver.findElement(By.cssSelector("input[value='Check availability']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("Ssreddy321");
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys("Ssreddy321");
		driver.findElement(By.xpath("//input[@name='chk_altemail711b7f4b']")).click();
	WebElement siva= driver.findElement(By.cssSelector("//select[@name='hintq711b7f4b']"));
		siva.click();
		Select sel= new Select(siva);
		sel.selectByValue("What is your exact time of birth?");
		

		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("6am");

		//input[@name='hinta711b7f4b']		
		
		driver.findElement(By.xpath("img[src='https://register.rediff.com/utilities/newforgot/img/darrow_country.png']")).click();
		
		//Select the one country code in list of options in mobile number field 
		List<WebElement> ram=driver.findElements(By.tagName("li"));
		
		System.out.println("number of the tag is----:-"+ram.size());
		
		for(int i=1;i<ram.size();i++)
		{
			String ch=ram.get(i).getText();
			System.out.println(ch);
			
			if(ch.contains("Australia"))
				
			{
				System.out.println( "Contry code is :-"+   ch);
				ram.get(i).click();
				
				
			}
			
			
		}
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("9857462310");
		
		boolean gender = driver.findElement(By.xpath("//input[@value='m']")).isEnabled();
		System.out.println("genger male is-----:-"+gender);
		
		WebElement gendermale=driver.findElement(By.xpath("//input[@value='m']"));
		
		WebElement genderfemale=driver.findElement(By.xpath("//input[@value='m']"));
		
		if(gendermale.equals("m"))
		{
			System.out.println("Selected gender is----:-"+gendermale.getAttribute("value"));
						
		}
		else
		{
			System.out.println("Selected gender is----:-"+genderfemale.getAttribute("value"));
		}
		
		gendermale.click();
		
		//DropDowns
		WebElement cnty=driver.findElement(By.xpath("//select[@id='country']"));
		Select country = new Select(cnty);
		System.out.println(country.getFirstSelectedOption().getText());
		System.out.println("Options are :-"+country.getOptions());
		
		boolean options = country.isMultiple();
		System.out.println("Multiple options are"+options);
		List<WebElement> countrynames=country.getOptions();
		
		int tcn=countrynames.size();
		System.out.println("num of countrynames are--:-"+tcn);
		
		
		
		
		for(int i=0;i<tcn;i++)
		{
			
			String cn=countrynames.get(i).getText();
			System.out.println();
		}
		country.selectByVisibleText("Togo");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		country.selectByVisibleText("India");
	
		//WebElement ct=driver.findElement(By.name("cityd88867c0"));
		
		

		WebElement da=driver.findElement(By.name("DOB_Dayd88867c0"));
		Select day= new Select(da);
		day.selectByValue("17");
		WebElement mo=driver.findElement(By.xpath("//select[contains(@name,'Dom_Month')]"));
		Select mon= new Select(mo);
		mon.selectByValue("12");
		WebElement ye=driver.findElement(By.xpath("//select[contains(@name,'Dom_Year')]"));
		Select year= new Select(ye);
		year.selectByValue("1997");
		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.id("Register")).submit();
		
			
		driver.quit();
		
	}

}
