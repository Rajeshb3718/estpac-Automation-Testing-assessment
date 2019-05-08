package ModemReboot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Westpac2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.westpac.co.nz/kiwisaver/calculators/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/kiwisaver/calculators/kiwisaver-calculator/']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[contains(.,'Current age')]//following::input[1]")).sendKeys("30");
		
		driver.findElement(By.xpath("//label[contains(.,'Employment status')]//following::div[@class='well-value ng-binding'][1]")).click();
		
		driver.findElement(By.xpath("//label[contains(.,'Employment status')]//following::div[@class='dropdown']/ul/li/div/span[text()='Employed']")).click();
		
		driver.findElement(By.xpath("//label[contains(.,'Salary or wages per year (before tax)')]//following::input[1]")).sendKeys("82,000");
		
		driver.findElement(By.xpath("//label[contains(.,'KiwiSaver member contribution')]//following::span[@class='input-holder'][2]")).click();
		
		driver.findElement(By.xpath("//label[contains(. , 'Prescribed investor rate (PIR)')]//following::div[@class='well-value ng-binding'][1]")).click();
		
		driver.findElement(By.xpath("//label[contains(. , 'Prescribed investor rate (PIR)')]//following::div[@class='dropdown']/ul/div/li/div/span[text()='17.5%']")).click();
		
		driver.findElement(By.xpath("//label[contains(. , 'Risk profile')]//following::div[@class='control radio-control  radio-control-default-label']/div/label/span/input[@id='radio-option-01V']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-regular btn-results-reveal btn-has-chevron']")).click();

	}

}
