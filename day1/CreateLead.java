package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("DemoCSR");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
//		driver.findElement(By.name("USERNAME")).sendKeys("DemoCSR");
//		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//		driver.findElement(By.className("loginButton")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("Infy");
		driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Lakshmi Priya");
		driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("Selvaraj");
		driver.findElement(By.xpath("(//input[contains(@id,'firstName')])[2]")).sendKeys("Priya");
//		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
//		driver.findElement(By.id("createLeadForm_description")).sendKeys("NA");
//		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priya@gmail.com");
		WebElement Province=driver.findElement(By.xpath("//select[contains(@id,'StateProvinceGeoId')]"));
		Select se=new Select(Province);
		se.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

	}

}
