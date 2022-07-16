package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the URL
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the page
		driver.manage().window().maximize();
		
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		// Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subashini");
		
		//Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manavalan");
		
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shobi");
		
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IVS");
		
		//Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("desc");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("subashini.kssn@gmail.com");
		
		// Select State/Province as NewYork Using Visible Text
		WebElement findElement2 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select state = new Select(findElement2);
		state.selectByVisibleText("New York");
		
		// Click  on the Create button
		driver.findElement(By.className("smallSubmit")).click();
		
		// Get the Title of Resulting Page
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		
	}

}
