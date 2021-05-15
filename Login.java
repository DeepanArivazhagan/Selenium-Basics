package week2.day1;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	String test = "TestLeaf Automation Platform";
	String test2 = driver.getTitle();
	if(test == test2);{
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("RRD");
	driver.findElementById("createLeadForm_firstName").sendKeys("Deepan");
	driver.findElementById("createLeadForm_lastName").sendKeys("Arivazhagan");
	driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Deepu");
	driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Ari");
	driver.findElementById("createLeadForm_personalTitle").sendKeys("Adhi");
	driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Pranav");
	driver.findElementById("createLeadForm_birthDate").sendKeys("16/01/94");
	driver.findElementById("createLeadForm_departmentName").sendKeys("Jaisurya");
	driver.findElementById("createLeadForm_annualRevenue").sendKeys("1500");
	driver.findElementById("createLeadForm_numberEmployees").sendKeys("50");
	driver.findElementById("createLeadForm_sicCode").sendKeys("5000");
	driver.findElementByClassName("smallSubmit").click();
	driver.findElementByLinkText("Duplicate Lead").click();
	WebElement amount = driver.findElementById("createLeadForm_industryEnumId");
	Select amount2 = new Select(amount);
	amount2.selectByIndex(3);
	
	driver.findElementById("createLeadForm_companyName").clear();
	driver.findElementById("createLeadForm_companyName").sendKeys("RRDonnelley");
	driver.findElementByClassName("smallSubmit").click();
driver.close();


	}
	
	
	}

}
