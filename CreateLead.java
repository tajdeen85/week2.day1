package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lead");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test1Local");
		driver.findElement(By.name("departmentName")).sendKeys("Quality Engineering");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tajdeen.mit@gmail.com");
		
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateProvinceDD = new Select(stateProvince);
		stateProvinceDD.selectByVisibleText("New York");		
		
		driver.findElement(By.name("submitButton")).click();	
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
