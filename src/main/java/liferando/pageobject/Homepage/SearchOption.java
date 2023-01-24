package liferando.pageobject.Homepage;

import liferando.commonUtils.Constants;
import liferando.commonUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static liferando.commonUtils.Constants.getWaitAfterClick;
import static liferando.commonUtils.Constants.getWaitForNewPage;
import static liferando.pageobject.DriverActions.entervalues;

public class SearchOption {
    public static void enterAddressInSearchBar(String address) throws InterruptedException{
        WebDriver driver = Utils.getDriver();
        entervalues(driver.findElement(By.id(SearchOptionConstants.getSearchBoxId())), address);
        Thread.sleep(getWaitAfterClick());
    }

    public static void selectAddress() throws InterruptedException {
        WebDriver driver = Utils.getDriver();
        driver.findElement(By.xpath(SearchOptionConstants.getAddressOption())).click();
        Thread.sleep(getWaitForNewPage());
    }
}
