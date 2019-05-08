package ModemReboot;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Westpac {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://www.westpac.co.nz/kiwisaver/calculators/");	
		driver.findElement(By.xpath("//a[@href='/kiwisaver/calculators/kiwisaver-calculator/']")).click();
		driver.switchTo().frame(0);
	
		/*WebElement area =driver.findElement(By.xpath("//div[@class='field-group-set-frame']"));
		List<WebElement> arealinks=area.findElements(By.xpath("//i[@class='icon']"));
			
		for(WebElement element :arealinks)
			{
			if(element.isDisplayed()) 
			{
			element.click();
			}
			
			}
		*/
		driver.findElement(By.xpath("(//i[@class='icon'])[1]")).click();
		driver.findElement(By.xpath("(//i[@class='icon'])[2]")).click();
		driver.findElement(By.xpath("(//i[@class='icon'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='icon'])[5]")).click();
		driver.findElement(By.xpath("(//i[@class='icon'])[6]")).click();
		driver.findElement(By.xpath("(//i[@class='icon'])[7]")).click();
		driver.findElement(By.xpath("(//i[@class='icon'])[8]")).click();
		
		//driver.findElement(By.xpath("(//div[@class='control-well'])[1]")).sendKeys("30");
		
		
		
		
		

	}}
