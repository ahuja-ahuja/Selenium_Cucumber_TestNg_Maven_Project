package stepDefinitionFramework;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import util.TextContextSetup;

import java.io.File;
import java.io.IOException;

public class Hooks {

    public TextContextSetup textContextSetup;

    public Hooks(TextContextSetup textContextSetup){
        this.textContextSetup = textContextSetup;
    }

    @After
    public void afterScenario() throws IOException {
        textContextSetup.testBase.WebDriverManager().quit();
    }
    @AfterStep
    public void addcreenshot(Scenario scenario) throws IOException {
        WebDriver driver = textContextSetup.testBase.WebDriverManager();
       if(scenario.isFailed()) {
           TakesScreenshot takesScreenshot = (TakesScreenshot)driver ;
           File sourcepath = takesScreenshot.getScreenshotAs(OutputType.FILE);
           byte[] filecontent = FileUtils.readFileToByteArray(sourcepath);
           scenario.attach(filecontent,"image/png", "image"+scenario.getName());
       }
    }

//    @Before("@SmokeTest")
//    public void morgageSetup(){
//        System.out.println("setup smokeTest");
//    }
}
