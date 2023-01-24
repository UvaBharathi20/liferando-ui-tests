package liferando.commonUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * This class consists of utilities common to all tests.
 * @author uva
 *
 */
public class Utils {
    //Insatnce created for driver.
    private static WebDriver driver;

    /**
     * To set the property for browser used.
     */
    public static void setProperty() {
	String baseDir = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", baseDir + "/lib/chromedriver");
    }
    /***
     * To start the driver.
     * @throws WebDriverException
     */
    public static void startChromeSession() throws WebDriverException{
	//to start chrome session by initializing the driver.
	driver = new ChromeDriver();
    }
    //open the Liferando site.
    public static void openLiferandoApp() throws InterruptedException {
	driver.get(Constants.getLiferandoApplink());
    Thread.sleep(3000);
    }
    //close the window.
    public static void closeDriver() {
	driver.close();
    }
    //terminate the driver connection.
    public static void quitDriver() {
	driver.quit();
    }
    /**
     * makes the instance accessible by other class.
     * @return - driver instance.
     */
    public static WebDriver getDriver() {
	return driver;
    }

    /***
     * To check if the given type of element is present.
     * @param expression - the expression consist of type of locator.
     * @return true if the element is found.
     */
    public static boolean isElementPresent(By expression) throws NoSuchElementException{
	if(driver.findElement(expression)!= null)
	    return true;
	return false;
    }
}