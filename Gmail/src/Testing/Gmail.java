package Testing;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver","C:\\selenium webdriver\\FirefoxDriver\\geckodriver-v0.32.0-win-aarch64\\geckodrive.exe");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("https://accounts.google.com/");
		   driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("shishir@gmail.com");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("123456");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		   Thread.sleep(2000);
		   String et ="Gmail";
		   String at = driver.getTitle();
		   driver.close();
       
		  if(et.equals(at))
           {
        	   System.out.println("Test is pass");
        	 
           }
           else
           {
        	   System.out.println("Test is Failure");
           }
		
	}

}
