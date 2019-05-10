package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps {
	
	static WebDriver driver;

@Given("The user is in telecom page")
public void the_user_is_in_telecom_page() {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishanthi\\eclipse-workspace2demo\\cucumber9\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.demo.guru99.com/telecom/");
}

@Given("The user navigates to add customer details")
public void the_user_navigates_to_add_customer_details() {
    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
}

/*@When("The user fill in the form")
public void the_user_fill_in_the_form() {
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	  driver.findElement(By.id("fname")).sendKeys("nishanthi");
	  driver.findElement(By.id("lname")).sendKeys("Renganthan");
	  driver.findElement(By.id("email")).sendKeys("Nisha@gmail.com");
	  driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("1234567890");
	  driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("9095484678");   
}*/


@When("The user fill in the forms")
public void the_user_fill_in_the_forms(DataTable dataTable) {
	
	List<Map<String, String>> cusDetails = dataTable.asMaps(String.class,String.class);
	
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys(cusDetails.get(1).get("fname"));
	driver.findElement(By.id("lname")).sendKeys(cusDetails.get(3).get("lname"));
	driver.findElement(By.id("email")).sendKeys(cusDetails.get(2).get("email"));
	driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(cusDetails.get(3).get("address"));
	driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(cusDetails.get(2).get("telephone"));
	
	
	
}

@When("The user submits the form")
public void the_user_submits_the_form() {
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
}

@Then("The customer should see the id is generated")
public void the_customer_should_see_the_id_is_generated() {
	Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
}

}
