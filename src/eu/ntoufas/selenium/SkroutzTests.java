package eu.ntoufas.selenium;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkroutzTests {
	 WebDriver driver;
	 
	 public void invokeBrowser(){
		 try{
		 System.setProperty("webdriver.chrome.driver","//Users//Billy//Documents//jars//selenium-java-3.8.1//chromedriver");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
		 driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.MILLISECONDS);
		 
		 driver.get("https://www.skroutz.gr/");
		 SearchForItem();
		 }catch(Exception e){
			 e.printStackTrace();}
		 
	 }
	 
	 public void SearchForItem() throws InterruptedException{
		 
			
		 driver.findElement(By.id("search-bar-input")).sendKeys("iphone 7");
		 Thread.sleep(2000);
		 driver.findElement(By.id("search-bar-input")).sendKeys(Keys.RETURN);
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//*[@title='Κινητά Τηλέφωνα']")).click();
		
		 	 
	 }
	 
	public static void main(String args[]){
		
		
		
		SkroutzTests test = new SkroutzTests();
		test.invokeBrowser();
		
	}
	
	
}
