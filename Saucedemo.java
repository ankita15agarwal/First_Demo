
package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Ankita");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Agarwal");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("801503");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();





}
}
