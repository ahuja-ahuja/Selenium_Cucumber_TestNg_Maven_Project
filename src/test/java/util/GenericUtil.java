package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

// this class is to use the genric code

public class GenericUtil {

public WebDriver driver;

    public GenericUtil(WebDriver driver){
        this.driver = driver;
    }

    public void switchWindowToChild(){
        Set<String> it = driver.getWindowHandles();
        Iterator<String> i1 = it.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        driver.switchTo().window(childWindow);
    }
}
