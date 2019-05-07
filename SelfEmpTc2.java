package useCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelfEmpTc2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium jars\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.westpac.co.nz/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='KiwiSaver']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='KiwiSaver calculators']")).click();
		driver.findElement(By.xpath("//a[text()='Click here to get started.']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[contains(.,'Current age')]//following::input[1]")).sendKeys("45");
		driver.findElement(By.xpath("//label[contains(.,'Employment status')]//following::div[@class='well-value ng-binding'][1]")).click();
		
		driver.findElement(By.xpath("//label[contains(.,'Employment status')]//following::div[@class='dropdown']/ul/li/div/span[text()='Self-employed']")).click();
		
		driver.findElement(By.xpath("//label[contains(. , 'Prescribed investor rate (PIR)')]//following::div[@class='well-value ng-binding'][1]")).click();
		
		driver.findElement(By.xpath("//label[contains(. , 'Prescribed investor rate (PIR)')]//following::div[@class='dropdown']/ul/div/li/div/span[text()='10.5%']")).click();
		
		driver.findElement(By.xpath("//label[contains(.,'Current KiwiSaver balance')]//following::input[1]")).sendKeys("100000");
		
		driver.findElement(By.xpath("//label[contains(.,'Voluntary contributions')]//following::input[1]")).click();
		
		driver.findElement(By.xpath("//label[contains(.,'Voluntary contributions')]//following::input[1]")).sendKeys("90");
		
	//	driver.findElement(By.xpath("//label[contains(.,'Voluntary contributions')]//following::div[@class='control select-control']")).click();
		
	//	driver.findElement(By.xpath("//button[@class='btn btn-regular btn-results-reveal btn-has-chevron']")).click();
		
	//	driver.findElement(By.xpath("//label[contains(.,'Voluntary contributions')]//following::div[@class='dropdown']/ul/li/div/span[text()='Fortnightly']")).click();
		
		driver.findElement(By.xpath("//label[contains(. , 'Risk profile')]//following::div[@class='control radio-control  radio-control-default-label']/div/label/span/input[@id='radio-option-01Y']")).click();

		driver.findElement(By.xpath("//label[contains(. , 'Savings goal at retirement')]//following::input[1]")).sendKeys("290000");
	}

}
