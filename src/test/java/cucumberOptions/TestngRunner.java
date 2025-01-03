package cucumberOptions;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue = "stepDefinitions" ,  monochrome = true,
plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
public class TestngRunner extends AbstractTestNGCucumberTests {

}

/*
for Junit ---

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
glue = "stepDefinitions" ,  monochrome = true,
plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
public class TestngRunner extends AbstractTestNGCucumberTests {

}


 */