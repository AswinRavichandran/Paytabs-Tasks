package Paytap;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment {
	 public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver= new ChromeDriver();
		 
		 // To maximize window
		 driver.manage().window().maximize();
		 
		 //Launch URL
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Enter the username
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 
		 //Enter the password
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 Thread.sleep(3000);
		 
		 //Click on login button
		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		 
		 //Click on Admin button
		 driver.findElement(By.xpath("//span[text()='Admin']")).click();
		 
		 //click on add button
		 driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		 
		 //Click on user role dropdown
		 driver.findElement(By.xpath("(//div[contains(text(),'Select')])[1]")).click();
		 
		 //Click an option in dropdown
		 driver.findElement(By.xpath("(//span[text()='Admin'])[2]")).click();
		 
		 //Enter values in Employee name text box
		 driver.findElement(By.xpath("//label[text()='Employee Name']/following::input[1]")).sendKeys("l");
		
		 //Click on the 3rd suggestions appeared in employee name 
		 driver.findElement(By.xpath("(//div[@class='oxd-autocomplete-option'])[3]")).click();
		 
		 //Click on the status dropdown
		 driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
		 
		 //Click an option in dropdown
		 driver.findElement(By.xpath("//span[text()='Enabled']")).click();
		 
		 //Enter the values in Username text box
		 driver.findElement(By.xpath("//label[text()='Employee Name']/following::input[2]")).sendKeys("Aswinvignesh");
		 
		 //Enter the values in password text box
		 driver.findElement(By.xpath("//label[text()='Employee Name']/following::input[3]")).sendKeys("Aswinvignesh@2406");
		 
		 //Enter the values in confirm password text box
		 driver.findElement(By.xpath("//label[text()='Employee Name']/following::input[4]")).sendKeys("Aswinvignesh@2406");
		 Thread.sleep(3000);
		 
		 //Click on the save buttton
		 driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		 
		 //Click on the profile dropdown
		 driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		 
		 //Click on logout button
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 
		 //Enter the username
		 driver.findElement(By.name("username")).sendKeys("Aswinvignesh");
		 
		 //Enter the password
		 driver.findElement(By.name("password")).sendKeys("Aswinvignesh@2406");
		 
		 //Click on login button
		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		 Thread.sleep(3000);
		 
		 //Close the browser
		 driver.close();
		 }
	 }
