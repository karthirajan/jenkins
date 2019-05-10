package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/AddCustomer.feature",glue= {"org.stepdefinition"},
                 plugin= {"html:target","json:target/report.json"},
                                     monochrome=true)

public class TestRunner {

}
