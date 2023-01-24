package liferando.pageobject.bookingPriceSelectionPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import liferando.commonUtils.Utils;
import liferando.pageobject.DriverActions;

public class BookingPriceSelection extends DriverActions {
    public static void selectSalaryRangeLessThan1000() throws InterruptedException {
        WebDriver driver = Utils.getDriver();
        driver.findElement(By.cssSelector(BookingPriceSelectionConstants.getUpTo1000())).click();
        //Utils.getDriver().findElement(By.cssSelector(BookingPriceSelectionConstants.getStarterPackage())).click();

        //Identify the WebElement which will appear after scrolling down

        WebElement element = driver.findElement(By.cssSelector(BookingPriceSelectionConstants.getStarterPackage()));
        scrollIntoView(element);
        driver.switchTo().defaultContent();
        Utils.getDriver().findElement(By.cssSelector(BookingPriceSelectionConstants.getNextButton())).click();

    }
}
