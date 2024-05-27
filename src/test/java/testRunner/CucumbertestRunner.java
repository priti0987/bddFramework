package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features= {"src/test/resources/Features"},
glue={"Stepdefinations"},
plugin= {"pretty","html:target/htmlreport.html"})

public class CucumbertestRunner extends AbstractTestNGCucumberTests {

}
