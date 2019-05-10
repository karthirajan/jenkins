package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps1 {
	
	static WebDriver driver;
	
	@Given("The user is in telecom pages")
	public void the_user_is_in_telecom_pages() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishanthi\\eclipse-workspace2demo\\cucumber9\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.demo.guru99.com/telecom/");

	}

	@Given("The user navigates to add customer detail")
	public void the_user_navigates_to_add_customer_detail() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	
	@When("The user fill in the forms{int}{string},{string},{string},{string},{string}")
	public void the_user_fill_in_the_forms(Integer int1, String fname, String lname, String email, String address, String telephone) {
	   
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(address);
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(telephone);
	}

	@When("The user submits the forms")
	public void the_user_submits_the_forms() {
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

	@Then("The customer should verify the id is generated")
	public void the_customer_should_verify_the_id_is_generated() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	    
	}

}
