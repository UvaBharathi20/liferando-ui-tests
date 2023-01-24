package liferando.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import liferando.commonUtils.Utils;

public class DriverActions {
    public static void scrollIntoView(WebElement webElement) throws InterruptedException {
        WebDriver driver = Utils.getDriver();
        // Create instance of Javascript executor
        JavascriptExecutor je = (JavascriptExecutor) driver;
        // now execute query which actually will scroll until that element is not appeared on page.
        je.executeScript("arguments[0].scrollIntoView(true);",webElement);
        je.executeScript("arguments[0].click();", webElement);
        Thread.sleep(2000);

    }
    public static void entervalues(WebElement webElement, String text){
        webElement.sendKeys(text);
    }
}
