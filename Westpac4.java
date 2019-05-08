package ModemReboot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Westpac4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.westpac.co.nz/kiwisaver/calculators/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/kiwisaver/calculators/kiwisaver-calculator/']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[contains(.,'Current age')]//following::input[1]")).sendKeys("55");
		driver.findElement(By.xpath("//label[contains(.,'Employment status')]//following::div[@class='well-value ng-binding'][1]")).click();
		
		driver.findElement(By.xpath("//label[contains(.,'Employment status')]//following::div[@class='dropdown']/ul/li/div/span[text()='Not employed']")).click();
		
		driver.findElement(By.xpath("//label[contains(. , 'Prescribed investor rate (PIR)')]//following::div[@class='well-value ng-binding'][1]")).click();
		
		driver.findElement(By.xpath("//label[contains(. , 'Prescribed investor rate (PIR)')]//following::div[@class='dropdown']/ul/div/li/div/span[text()='10.5%']")).click();
		
		driver.findElement(By.xpath("//label[contains(.,'Current KiwiSaver balance')]//following::input[1]")).sendKeys("140000");
		
		driver.findElement(By.xpath("//label[contains(.,'Voluntary contributions')]//following::input[1]")).click();
		
		driver.findElement(By.xpath("//label[contains(.,'Voluntary contributions')]//following::input[1]")).sendKeys("10");
		
	
		
		driver.findElement(By.xpath("//label[contains(. , 'Risk profile')]//following::div[@class='control radio-control  radio-control-default-label']/div/label/span/input[@id='radio-option-01Y']")).click();

		driver.findElement(By.xpath("//label[contains(. , 'Savings goal at retirement')]//following::input[1]")).sendKeys("200000");
	}


	}


