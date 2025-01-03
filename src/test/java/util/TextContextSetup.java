package util;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

import java.io.IOException;

public class TextContextSetup {
    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtil genericUtil;
    public TextContextSetup() throws IOException {

        //creaiting a new object of pageobjectManager which is resposible for creating the all other PageObjects objects
        this.testBase = new TestBase();  //where driver will initialize
        this.pageObjectManager = new PageObjectManager(testBase.WebDriverManager());//place from where the driver will be passed to all other locations
        this.genericUtil = new GenericUtil(testBase.WebDriverManager());
    }


}

/*  Driver flow important
from Testbase class driver is getting started with WebDriverManaer method then  ->
in TextContextSetup class this driver is getting passed in PageObjectManager class form this class ->
it will flow in each page object class */
