package liferando.pageobject.Homepage;

import liferando.commonUtils.Constants;
import liferando.commonUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static liferando.commonUtils.Constants.getWaitAfterClick;
import static liferando.commonUtils.Constants.getWaitForNewPage;
import static liferando.pageobject.DriverActions.entervalues;

public class SearchOption {
    static WebDriver driver = Utils.getDriver();
    public static void enterAddressInSearchBar(String address) throws InterruptedException{
        entervalues(driver.findElement(By.id(SearchOptionConstants.getSearchBoxId())), address);
        Thread.sleep(getWaitAfterClick());
    }

    public static void selectAddress() throws InterruptedException {
        driver.findElement(By.xpath(SearchOptionConstants.getAddressOption())).click();
        Thread.sleep(getWaitForNewPage());
    }
}
