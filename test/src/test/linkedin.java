package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkedin {

	public static void main(String[] args) throws InterruptedException {
			FirefoxDriver d1=new FirefoxDriver();
			d1.get("https://www.linkedin.com");
			d1.findElement(By.xpath(".//*[@id='login-email']")).sendKeys("ashok_hari07@yahoo.co.in");
			d1.findElement(By.xpath(".//*[@id='login-password']")).sendKeys("Bhuvana07##");
			d1.findElement(By.xpath(".//*[@id='login-submit']")).click();
			WebElement e1=d1.findElement(By.xpath(".//*[@id='nav-settings__dropdown-trigger']"));
			e1.click();
			e1.sendKeys(Keys.ARROW_DOWN);
			WebElement e2=d1.findElement(By.partialLinkText("Settings"));
			e2.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement e3=d1.findElement(By.partialLinkText("Premium"));
			e3.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement e4=d1.findElement(By.xpath(".//*[@id='minimal-nav-account-btn']"));
			e4.click();
			e4.sendKeys(Keys.ARROW_DOWN);
		    WebElement e5=d1.findElement(By.partialLinkText("Sign"));
			e5.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			

	}

}
