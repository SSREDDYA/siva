package ss;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_handlings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		String siva = driver.getTitle();
		System.out.println("FIRST page title---:->" + siva);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		System.out.println("--Parnt id--" + driver.getWindowHandle());

		WebElement frame_xpath = driver.findElement(By.xpath("//frame[@name='login_page']"));
		Thread.sleep(3000);
		driver.switchTo().frame(frame_xpath);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
         driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();
		String sankar = driver.getTitle();
		System.out.println("SECOND page title---:-" + sankar);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		driver.switchTo().parentFrame();
		Thread.sleep(6000);
		// driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("54523009");

		String ram= driver.findElement(By.xpath("//frame[@name='login_page']")).getText();
		System.out.println("TEXT IS .-------:->"+ram);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		Set<String> Windowids = driver.getWindowHandles();
		Iterator<String> it = Windowids.iterator();

		String parnt_window_id = it.next();

		String child_window_id = it.next();

		System.out.println("parnt window id--:-" + parnt_window_id);

		System.out.println("child_window_id--:-" + child_window_id);

		driver.switchTo().window(child_window_id);
		String child_window_Title = driver.getTitle();
		System.out.println("-child_window_Title--:-" + child_window_Title);
		driver.switchTo().window(parnt_window_id);
		String parnt_window_Title = driver.getTitle();
		System.out.println("-parnt_window_Title--:-" + parnt_window_Title);

		driver.quit();

		
	}

}
